package com.rakovets.course.practice.module2;

/**
 * Разработать программу для векторного графического редактора:
 * которая будет округлять вещественное значение координаты точки до ближайшего
 * целого значения координаты пикселя на мониторе, если известно:
 *
 * @param value - вещественное значение координаты точки
 */
public class Task05 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		float value = 3.2f;

		// Код необходимый для тестирования, не изменять
		value = (args.length == 1) ? Float.parseFloat(args[0]) : value;

		System.out.println(Math.round(value)) ;

	}
}
