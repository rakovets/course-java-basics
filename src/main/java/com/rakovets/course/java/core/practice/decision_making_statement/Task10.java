package com.rakovets.course.java.core.practice.decision_making_statement;

class Task10 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int firstFuelReserves = 100;
        int secondFuelReserves = 100;
        int thirdFuelReserves = 100;

        int numberStation = getNumberStation(firstFuelReserves, secondFuelReserves, thirdFuelReserves);
        System.out.printf("Result: %s", numberStation);
    }

    /**
     * Программа вычисляет на какую АЗС необходимо доставить топливо в первую очередь.
     * Если количество запасов топлива наименьшее на нескольких АЗС, то вывести первую АЗС в порядке
     * возрастания номера АЗС.
     * Например: если на всех заправках одинаковое количество, то вернуть <code>1</code>
     *
     * @param firstFuelReserves  запасы топлива на первой заправке
     * @param secondFuelReserves запасы топлива на второй заправке
     * @param thirdFuelReserves  запасы топлива на третьей заправке
     * @return номер заправки.
     */
    static int getNumberStation(int firstFuelReserves, int secondFuelReserves, int thirdFuelReserves) {
        int azc = 0;

        if (firstFuelReserves <= secondFuelReserves && firstFuelReserves <= thirdFuelReserves) {
            azc = 1;
        } else if (secondFuelReserves <= firstFuelReserves && secondFuelReserves <= thirdFuelReserves) {
            azc = 2;
        } else if (thirdFuelReserves <= firstFuelReserves && thirdFuelReserves <= secondFuelReserves) {
            azc = 3;
        }

        return azc;
    }
}