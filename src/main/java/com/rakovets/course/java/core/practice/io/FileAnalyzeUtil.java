package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FileAnalyzeUtil {
    //Task02
    public static List<String> getTextListFromFile(Path filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)));
        return bufferedReader.lines().collect(Collectors.toList());
    }

    //Task03
    public static List<String> getWordsListStartingWithVowelFromFile(Path filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)));
        List<String> list = bufferedReader.lines()
                .flatMap(i -> Arrays.stream(i.replaceAll("[,.!?\\s]", " ").split(" ")))
                .collect(Collectors.toList());

        return list.stream()
                .filter(i -> i.matches("^(?i:[aeuioy]).*"))
                .collect(Collectors.toList());
    }

    //Task04
    public static List<String> getWordsListEndingWithLetterEqualFirstLetterOfNextWord(Path filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)));
        List<String> list = bufferedReader.lines()
                .flatMap(i -> Arrays.stream(i.replaceAll("[,.!?\\s]", " ").split(" ")))
                .collect(Collectors.toList());

        return IntStream.range(0, list.size() - 1)
                .filter(i -> {
                    String current = list.get(i);
                    String next = list.get(i + 1);
                    return current.substring(current.length() - 1).equalsIgnoreCase(next.substring(0, 1));
                })
                .mapToObj(list::get)
                .collect(Collectors.toList());
    }

    //Task06
    public static Map<Character, Integer> getLetterFrequency(Path filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)));
        Map<Character, Integer> map = new HashMap<>();
        String line = bufferedReader.lines().toString().replaceAll("[,.!?\\s\\p{P}]", "");
        int value = 1;

        for (char key : line.toCharArray()) {
            if (map.containsKey(key)) {
                value = map.get(key);
                map.put(key, ++value);
                value = 1;
            } else {
                map.put(key, value);
            }
        }
        return map;
    }

    //Task07
    public static Map<String, Integer> getWordsFrequency(Path filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)));
        Map<String, Integer> map = new HashMap<>();
        List<String> list = bufferedReader.lines()
                .flatMap(i -> Arrays.stream(i.replaceAll("[,.!?\\s]", " ").split(" ")))
                .collect(Collectors.toList());
        int value = 1;

        for (String key : list) {
            if (map.containsKey(key)) {
                value = map.get(key);
                map.put(key, ++value);
                value = 1;
            } else {
                map.put(key, value);
            }
        }
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }

    //Task08
    public static void sortNumbersFromFile(Path filePath) throws IOException {
        Path writtenFilePath = Paths.get("src/main/java/com/rakovets/course/java/core/practice/io/" +
                "files/fileAnalyzeUtil-task-08-sortedNumbers");
        FileWriter writer = new FileWriter(String.valueOf(writtenFilePath));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)));

        List<String> list = bufferedReader.lines()
                .flatMap(i -> Arrays.stream(i.replaceAll("[,.!?\\s]", " ").split(" ")))
                .sorted()
                .collect(Collectors.toList());
        writer.write(String.valueOf(list).replaceAll("\\p{P}", ""));
        writer.flush();
    }

    //Task09
    public static Map<String, Double> getStudentsAverageMarks(Path filePath) throws IOException {
        List<String> list;
        Map<String, Double> map = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)));
        String line;
        String username = "";
        double averageMark = 0;

        while ((line = bufferedReader.readLine()) != null) {
            list = Arrays.stream(line.replaceAll("[,.!?]", "").split("\\s"))
                    .collect(Collectors.toList());
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) {
                    averageMark += Integer.parseInt(list.get(i));
                } else {
                    username = list.get(i);
                }
            }
            averageMark = BigDecimal.valueOf(averageMark / (list.size() - 1))
                    .setScale(1, RoundingMode.HALF_UP).doubleValue();
            map.put(username, averageMark);
            averageMark = 0;
        }
        return map;
    }

    //Task10
    public static void changeFileModifiers(Path filePath, String oldModifier, String newModifier) throws IOException {
        Path writtenFilePath = Paths.get("src/main/java/com/rakovets/course/java/core/practice/io/" +
                "files/fileAnalyzeUtil-task-10-writtenFile");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)));

        List<String> list = bufferedReader.lines()
                .map(i -> i.replace(oldModifier, newModifier))
                .collect(Collectors.toList());
        Files.write(writtenFilePath, list);
    }
}
