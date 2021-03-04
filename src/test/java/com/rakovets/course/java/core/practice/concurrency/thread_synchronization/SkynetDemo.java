package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.Factory;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.FactoryStore;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.SmartTeam;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.Team;

public class SkynetDemo {
    public static void main(String[] args) {
        FactoryStore store = new FactoryStore();
        Factory factory = new Factory(store);
        Team world = new Team(store);
        Team wednesday = new Team(store);
        int days = 100;

        for (int x = 0; x < days; x++) {
            try {
                Thread producer = new Thread(factory);
                producer.start();
                producer.join();

                Thread loki = new Thread(world);
                Thread odin = new Thread(wednesday);
                loki.start();
                odin.start();
                odin.join();
                loki.join();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }

        if (wednesday.getNumberOfRobots() > world.getNumberOfRobots()) {
            System.out.printf("Odin won! Praise the Great God!\nScore %d : %d\n", wednesday.getNumberOfRobots(), world.getNumberOfRobots());
        } else if (wednesday.getNumberOfRobots() < world.getNumberOfRobots()) {
            System.out.printf("Loki won! Praise the Great God!\nScore %d : %d\n", world.getNumberOfRobots(), wednesday.getNumberOfRobots());
        } else {
            System.out.printf("It's a draw!\nScore %d : %d\n", world.getNumberOfRobots(), wednesday.getNumberOfRobots());
        }

        SmartTeam smartWednesday = new SmartTeam(store);
        SmartTeam smartWorld = new SmartTeam(store);
        for (int x = 0; x < days; x++) {
            try {
                Thread producer = new Thread(factory);
                producer.start();
                producer.join();

                Thread odin = new Thread(smartWednesday);
                Thread loki = new Thread(smartWorld);
                odin.start();
                loki.start();
                odin.join();
                loki.join();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }

        if (smartWednesday.getNumberOfRobots() > smartWorld.getNumberOfRobots()) {
            System.out.printf("Odin won! Praise the Great God!\nScore %d : %d\n", smartWednesday.getNumberOfRobots(), smartWorld.getNumberOfRobots());
        } else if (smartWednesday.getNumberOfRobots() < smartWorld.getNumberOfRobots()) {
            System.out.printf("Loki won! Praise the Great God!\nScore %d : %d\n", smartWorld.getNumberOfRobots(), smartWednesday.getNumberOfRobots());
        } else {
            System.out.printf("It's a draw!\nScore %d : %d\n", smartWorld.getNumberOfRobots(), smartWednesday.getNumberOfRobots());
        }
    }
}
