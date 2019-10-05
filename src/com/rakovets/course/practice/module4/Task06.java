package com.rakovets.course.practice.module4;

import java.util.Scanner;

/**
 * Разработать программу для бухгалтерии:
 * Конвертировать чесловую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
 * пробелом. Известно:
 * @param amount сумма
 * @return сумма в бухгалтерском формате
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task06 {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
		Scanner scanner = new Scanner(System.in);

		// Код необходимый для тестирования, не изменять
		long amount = (args.length != 1 ? scanner.nextLong() : Long.parseLong(args[0]));

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		String answer = "";
		long amount2;

		if (amount >= 0) {
			for (int i = 1; amount >= 1000; i++) {
				amount2 = amount % 1000;
				amount = (amount - amount2) / 1000;
				answer = (" " + amount2 + answer);
			}
			System.out.print(amount + answer);
		}
		else {
			amount = 0 - amount;
			for (int i = 1; amount >= 1000; i++) {
				amount2 = amount % 1000;
				amount = (amount - amount2) / 1000;
				answer = (" " + amount2 + answer);
			}
			System.out.print("-" + amount + answer);
			}
	}
}