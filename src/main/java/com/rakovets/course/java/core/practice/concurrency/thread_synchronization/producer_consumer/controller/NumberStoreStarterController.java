package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.controller;

public class NumberStoreStarterController {
    public static void main(String[] args) {
        NumberStoreController numberStoreController = new NumberStoreController();
        numberStoreController.start();
    }
}
