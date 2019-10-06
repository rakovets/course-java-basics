package com.rakovets.course.practice.module4;

import java.util.Scanner;

/**
 * Разработать программу для сети оптовых гипермаркетов:
 * Необходимо сформировать price для некоторого продукта. Известно:
 * @param startPriceAllItems стоимость всех продуктов, с которых начинается price
 * @param startNumberItems количество продуктов, с которых начинается price
 * @param differentialNumberItems разница в количестве продуктов между соседними значениями price
 * @param differentialSell скидка % на всю покупку за приобретение дополнительных differentialNumberItems товара
 * @param sizeTotalPrice размерность итогового price
 * @return price, где формат вывода одной записи '${numberItems} - ${cost} with sell ${totalSell}%'
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task09 {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
		Scanner scanner = new Scanner(System.in);

		// Код необходимый для тестирования, не изменять
		double startPriceAllItems = (args.length!=5 ? scanner.nextDouble():Double.parseDouble(args[0]));
		int startNumberItems = (args.length!=5 ? scanner.nextInt():Integer.parseInt(args[1]));
		int differentialNumberItems = (args.length!=5 ? scanner.nextInt():Integer.parseInt(args[2]));
		int sizeTotalPrice = (args.length!=5 ? scanner.nextInt():Integer.parseInt(args[3]));
		double differentialSell = (args.length!=5 ? scanner.nextDouble():Double.parseDouble(args[4]));

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)

		int counter = 0;
		double costOfItems;
		double sizeOfSell = 0;
		double reductionOfPrice;

		costOfItems = startPriceAllItems / (startNumberItems / differentialNumberItems);
		do {
			if ( counter > 0 && counter < sizeTotalPrice) {
				System.out.print("\n");
			}
			System.out.print(startNumberItems + " - " + startPriceAllItems + " with sell " + sizeOfSell + "%");

			reductionOfPrice = startPriceAllItems * sizeOfSell / 100;
			sizeOfSell++;

			startNumberItems += differentialNumberItems;
			startPriceAllItems += costOfItems - reductionOfPrice;

			counter++;

		} while(counter < sizeTotalPrice);
	}

}