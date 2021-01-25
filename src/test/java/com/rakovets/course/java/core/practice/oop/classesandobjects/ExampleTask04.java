package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class ExampleTask04 {
    public static void main(String[] args) {
        Atm testATM = new Atm(1000, 2000, 4000);
        testATM.addBanknotes100(50);
        testATM.addBanknotes50(60);
        testATM.addBanknotes20(70);
        System.out.println(testATM.isPossibleIssue(1000));
        System.out.println(testATM.getOptionsCombinationBanknotes(100));
    }
}
