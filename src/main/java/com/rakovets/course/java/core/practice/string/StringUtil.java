package com.rakovets.course.java.core.practice.string;

public class StringUtil {

    public String glue(String str1, String str2) {
        return str1.concat(str2);
    }

    public int symbolIndex(String x, String text) {
        int index = text.indexOf(x);
        return index;
    }
}