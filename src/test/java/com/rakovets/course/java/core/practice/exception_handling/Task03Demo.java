package com.rakovets.course.java.core.practice.exception_handling;

public class Task03Demo {
    public static void main(String[] args) {

        try {
            System.out.println(Task03.throwException(0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
