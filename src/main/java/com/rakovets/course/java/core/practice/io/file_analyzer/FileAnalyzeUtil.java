package com.rakovets.course.java.core.practice.io.file_analyzer;
import java.awt.event.ItemEvent;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {
    public static List<String> getListLines(Path filePath) {
        List<String> list = new ArrayList<>();
        String tempString;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            while ((tempString = bufferedReader.readLine()) != null) {
                list.add(tempString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<String> getListWordStartWith(Path filePath) {
        String[] words = getListLines(filePath).toString().replaceAll("[.,:]", "").split(" ");
        return Arrays.stream(words)
                .filter(x -> x.matches("[eyuioaEYUIOA].*"))
                .collect(Collectors.toList());
    }

    public static List<String> getListWord(Path filePath) {
        String[] words = getListLines(filePath).toString().replaceAll("[.,:]", "").split(" ");
        List<String> listWord = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) == words[i + 1].charAt(0)) {
                listWord.add(words[i]);
            }
        }
        return listWord;
    }
}
