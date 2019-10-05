package com.rakovets.course.practice.module2;

/**
 * Разработать программу для логистического центра:
 * которая будет разчитывать количество некоторого груза, который останется на складе, так как грузовики
 * отправляются только загруженными, если известно:
 *
 * @param cargo            - вес всего груза
 * @param carryingCapacity - грузоподъемность грузовиков
 */
public class Task02 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		int cargo = 1;
		int carryingCapacity = 2;

		// Код необходимый для тестирования, не изменять
		cargo = (args.length == 0) ? cargo : Integer.parseInt(args[0]);
		carryingCapacity = (args.length == 0) ? carryingCapacity : Integer.parseInt(args[1]);

		System.out.println(cargo % carryingCapacity);

	}
}