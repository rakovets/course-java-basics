package com.rakovets.course.java.core.practice.concurrency.common.parallelCalculator;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.util.*;

public abstract class ParallelCalculator {
    public static Map<Integer, int[]> calculate(List<int[]> list) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int[] number : list) {
            OptionalInt sum = Arrays.stream(number).reduce(Integer::sum);
            if (sum.isPresent()) {
                map.put(sum.getAsInt(), number);
            }
        }
        return map;
    }

    public static Map<Integer, int[]> calculateWithThreads(List<int[]> data, int numberOfThreads) {
        Map<Integer, int[]> map = new HashMap<>();
        List<int[]> list = new ArrayList<>(data);
        long startTime = System.currentTimeMillis();
        Runnable thread = () -> {
            while (!list.isEmpty()) {
                try {
                    int[] array = list.remove(0);
                    OptionalInt sum = Arrays.stream(array).reduce(Integer::sum);
                    if (sum.isPresent()) {
                        map.put(sum.getAsInt(), array);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(numberOfThreads + " Threads: " + (System.currentTimeMillis() - startTime) + "ms");
        };
        for (int x = 1; x <= numberOfThreads; x++) {
            new Thread(thread).start();
        }
        return map;
    }
}
