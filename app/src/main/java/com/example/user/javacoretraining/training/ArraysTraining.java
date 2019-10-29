package com.example.user.javacoretraining.training;

import java.util.Collection;
import java.util.HashMap;

/**
 * Набор тренингов по работе с массивами в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ArraysTrainingTest.
 */
public class ArraysTraining {

    /**
     * Метод должен сортировать входящий массив
     * по возрастранию пузырьковым методом
     *
     * @param valuesArray массив для сортировки
     * @return отсортированный массив
     */
    public int[] sort(int[] valuesArray) {
        int memNum;
        for (int i = 1; i < valuesArray.length; i++) {
            for (int digit = 0; digit < valuesArray.length - i; digit++) {
                if (valuesArray[digit] > valuesArray[digit + 1]) {
                    memNum = valuesArray[digit];
                    valuesArray[digit] = valuesArray[digit + 1];
                    valuesArray[digit + 1] = memNum;
                }
            }
        }

        return valuesArray;
    }

    /**
     * Метод должен возвращать максимальное
     * значение из введенных. Если входящие числа
     * отсутствуют - вернуть 0
     *
     * @param values входящие числа
     * @return максимальное число или 0
     */
    public int maxValue(int... values) {
        int maxValue = 0;
        for (int num : values) {
            if (maxValue < num) {
                maxValue = num;
            }
        }

        return maxValue;
    }

    /**
     * Переставить элементы массива
     * в обратном порядке
     *
     * @param array массив для преобразования
     * @return входящий массив в обратном порядке
     */
    public int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int num = 0; num < array.length; num++) {
            reverseArray[num] = array[(array.length - 1) - num];
        }
        return reverseArray;
    }

    /**
     * Метод должен вернуть массив,
     * состоящий из чисел Фибоначчи
     *
     * @param numbersCount количество чисел Фибоначчи,
     *                     требуемое в исходящем массиве.
     *                     Если numbersCount < 1, исходный
     *                     массив должен быть пуст.
     * @return массив из чисел Фибоначчи
     */
    public int[] fibonacciNumbers(int numbersCount) {
        if (numbersCount < 1) {
            return new int[]{};
        }
        int[] sequenceFibonacci = new int[numbersCount];
        int memNum1 = 1;
        int memNum2 = 0;
        for (int i = 0; i < numbersCount; i++) {

            sequenceFibonacci[i] = memNum1 + memNum2;
            memNum2 = memNum1;
            memNum1 = sequenceFibonacci[i];

        }
        return sequenceFibonacci;

    }

    /**
     * В данном массиве найти максимальное
     * количество одинаковых элементов.
     *
     * @param array массив для выборки
     * @return количество максимально встречающихся
     * элементов
     */
    public int maxCountSymbol(int[] array) {

        HashMap<Integer, Integer> countOfSymbols = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (countOfSymbols.containsKey(array[i])) {
                countOfSymbols.put(array[i], countOfSymbols.get(array[i]) + 1);
            }

            if (!countOfSymbols.containsKey(array[i])) {
                countOfSymbols.put(array[i], 1);
            }
        }
        Collection<Integer> counts = countOfSymbols.values();
        Integer maxValue = 0;
        for (Integer num : counts) {
            if (maxValue < num) {
                maxValue = num;
            }
        }

        return maxValue.intValue();
    }
}
