package com.company;

public class Main extends Methods {

    /**
     * Лаб_раб1 Программа для подсчета суммы 3х целых чисел. Операция суммирования уже считанных чисел должна быть вынесена в отдельный метод.
     * <p>
     * Задание * - Сколько литров воды нужно для заполнения бассейна до бортов. Известно, что бассейн имеет линейные размеры a × b × c
     *
     * @author Frolova SI
     */
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber, sum, waterVolume;
        // лаба1
        System.out.print("Введите первое число: ");
        firstNumber = scanNumber();
        System.out.print("Введите второе число: ");
        secondNumber = scanNumber();
        System.out.print("Введите третье число: ");
        thirdNumber = scanNumber();

        sum = sumNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println("Сумма чисел = " + sum);

        //задача со *
        waterVolume = multiplication(firstNumber, secondNumber, thirdNumber) * 1000; //умножаем на 1000 для вычисления объема
        System.out.println("Объем воды в бассейне = " + waterVolume);
    }
}
