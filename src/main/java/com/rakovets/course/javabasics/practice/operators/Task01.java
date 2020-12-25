package com.rakovets.course.javabasics.practice.operators;

/**
 * Разработать программу для логистического центра:
 * которая будет рассчитывать количество полностью загруженных грузовиков, необходимых
 * для перевозки некоторого груза, если известно:
 *
 * @param cargo            - вес всего груза
 * @param carryingCapacity - грузоподъемность грузовиков
 */
public class Task01 {
    public static void main(String[] args) {
        //FIXME
        // Переменные, которые можно изменять для проверки различных вариантов входных параметров
        int cargo = 100;
        int carryingCapacity = 30;

        // Код необходимый для тестирования, не изменять
        cargo = (args.length == 0) ? cargo : Integer.parseInt(args[0]);
        carryingCapacity = (args.length == 0) ? carryingCapacity : Integer.parseInt(args[1]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        int fullyLoadedTrucks = cargo / carryingCapacity;
        System.out.print(fullyLoadedTrucks);
    }
}
