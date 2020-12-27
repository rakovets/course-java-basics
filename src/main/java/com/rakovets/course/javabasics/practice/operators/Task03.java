package com.rakovets.course.javabasics.practice.operators;

/**
 * Разработать программу для банка:
 * которая будет высчитывать конечную сумма после пяти лет на депозитном счете, для плана без возможности снятия денег,
 * если известно
 *
 * @param deposit          - первоначальная сумма на счете
 * @param annualPercentage - ежегодный простой процент, т.е. ежегодный процент высчитывается от первоначальной суммы
 */
public class Task03 {
    public static void main(String[] args) {
        //FIXME
        // Переменные, которые можно изменять для проверки различных вариантов входных параметров
        int deposit = 1521;
        int annualPercentage = 6;

        // Код необходимый для тестирования, не изменять
        deposit = (args.length == 0) ? deposit : Integer.parseInt(args[0]);
        annualPercentage = (args.length == 0) ? annualPercentage : Integer.parseInt(args[1]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        double total_deposit = deposit + 5 * deposit * annualPercentage / 100;
        System.out.print(total_deposit);
    }
}
