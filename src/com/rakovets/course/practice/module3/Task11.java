package com.rakovets.course.practice.module3;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * Необходимо определить, какие символы вводит пользователь:
 * - латиници
 * - кирилица
 * - цифра
 * - спец. символ
 * Так же программа не должна зависеть от регистра.
 * Известно:
 *
 * @param letter - символ введенный пользователем
 * @return 'latin'/'cyrillic'/'digit'/'undefined'
 * <p>
 * Help: American standard code for information interchange
 */

public class Task11 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        char letter = (args.length != 1) ? scanner.next().charAt(0) : args[0].charAt(0);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int number = (int) letter;
        if ((number > 64) &&  (number < 91)) {
            System.out.println("latin");
        } else if ((number > 96) &&  (number < 123)) {
            System.out.println("latin");
        } else if ((number > 191) &&  (number < 256)) {
            System.out.println("cyrillic");
        } else if ((number > 47) &&  (number < 58)) {
            System.out.println("digit");
        } else {
            System.out.println("undefined");
        }
    }
}