package com.rakovets.course.practice.module2;

/**
 * Разработать программу для фабрики по производству квадратной плитки для мозаики:
 * которая будет расчитывать размерность (т.е. размер стороны) квадратной плитки, которая находится на весах
 * сортировочной ленты, если известно:
 * <p>
 * - что на 1 кв.единицу площади необходимо 1 единица веса *
 *
 * @param weight - вес плитки
 */
public class Task04 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		int weight = 9;

		// Код необходимый для тестирования, не изменять
		weight = (args.length == 0) ? weight : Integer.parseInt(args[0]);

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
	double area = weight;
		System.out.println(Math.sqrt(area));
	}
}