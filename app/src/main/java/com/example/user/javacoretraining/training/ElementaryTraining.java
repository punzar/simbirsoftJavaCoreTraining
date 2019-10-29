package com.example.user.javacoretraining.training;

/**
 * Набор тренингов по работе с примитивными типами java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ElementaryTrainingTest.
 */
public class ElementaryTraining {


    /**
     * Метод должен возвращать среднее значение
     * для введенных параметров
     *
     * @param firstValue  первый элемент
     * @param secondValue второй элемент
     * @return среднее значение для введенных чисел
     */
    public double averageValue(int firstValue, int secondValue) {
        double average = (double) (firstValue + secondValue) / 2;
        return average;
    }

    /**
     * Пользователь вводит три числа.
     * Произвести манипуляции и вернуть сумму новых чисел
     *
     * @param firstValue  увеличить в два раза
     * @param secondValue уменьшить на три
     * @param thirdValue  возвести в квадрат
     * @return сумма новых трех чисел
     */
    public double complicatedAmount(int firstValue, int secondValue, int thirdValue) {
        double complicate = (double) firstValue * 2 + (secondValue - 3) + thirdValue * thirdValue;
        return complicate;
    }

    /**
     * Метод должен поменять значение в соответствии с условием.
     * Если значение больше 3, то увеличить
     * на 10, иначе уменьшить на 10.
     *
     * @param value число для изменения
     * @return новое значение
     */
    public int changeValue(int value) {
        if (value > 3) {
            value += 10;
        } else {
            value -= 10;
        }
        return value;
    }

    /**
     * Метод должен менять местами первую
     * и последнюю цифру числа.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10, вернуть
     * то же число
     *
     * @param value число для перестановки
     * @return новое число
     */
    public int swapNumbers(int value) {
        if (value > 9 && value <= 99999) {
            int endNum = value % 10;
            int countOfSymbol = String.valueOf(value).length();
            // Делитель для отсечения первого символа
            int bigDiv = (int) Math.pow(10, countOfSymbol - 1);
            int startNum = ((value - value % (bigDiv)) / (bigDiv));
            int halfResultNum = value - endNum + startNum;
            int resultNum = ((halfResultNum - bigDiv * startNum) + bigDiv * endNum);
            return resultNum;
        }
        if (value < 10) return value;
        return -1;
    }

    /**
     * Изменить значение четных цифр числа на ноль.
     * Счет начинать с единицы.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10 вернуть
     * то же число.
     *
     * @param value число для изменения
     * @return новое число
     */
    public int zeroEvenNumber(int value) {
        if (value > 9 && value <= 99999) {
            String valueText = String.valueOf(value);
            char[] chars = valueText.toCharArray();

            int[] digitsArray = new int[chars.length];
            for (int digit = 0; digit < chars.length; digit++) {
                if (Character.getNumericValue(chars[digit]) % 2 == 0) {
                    digitsArray[digit] = 0;
                } else digitsArray[digit] = Character.getNumericValue(chars[digit]);
            }
            int result = 0;
            int exponent = digitsArray.length - 1;
            for (int digit = 0; digit < digitsArray.length; digit++) {
                result += digitsArray[digit] * Math.pow(10, exponent);
                exponent -= 1;
            }
            return result;
        }
        if (value < 10) return value;
        return -1;
    }
}
