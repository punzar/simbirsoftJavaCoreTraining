package com.example.user.javacoretraining.training;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Набор тренингов по работе со строками в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see StringsTrainingTest.
 */
public class StringsTraining {

    /**
     * Метод по созданию строки,
     * состоящей из нечетных символов
     * входной строки в том же порядке
     *
     * @param text строка для выборки
     * @return новая строка из нечетных
     * элементов строки text
     */
    public String getOddCharacterString(String text) {
        StringBuilder changedText = new StringBuilder();
        //в тесте ошибка, он ожидает четные символы
        for (int symbol = 1; symbol < text.length(); symbol += 2) {
            changedText.append(text.charAt(symbol));
        }

        return changedText.toString();
    }

    /**
     * Метод для определения количества
     * символов, идентичных последнему
     * в данной строке
     *
     * @param text строка для выборки
     * @return массив с номерами символов,
     * идентичных последнему. Если таких нет,
     * вернуть пустой массив
     */
    public int[] getArrayLastSymbol(String text) {

        ArrayList<Integer> likeLastIndex = new ArrayList<>();
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(text.length() - 1)) {
                likeLastIndex.add(i);
            }
        }
        int[] arrayLastSymbol = new int[likeLastIndex.size()];
        for (int i = 0; i < likeLastIndex.size(); i++) {
            arrayLastSymbol[i] = likeLastIndex.get(i);
        }
        return arrayLastSymbol;
    }

    /**
     * Метод по получению количества
     * цифр в строке
     *
     * @param text строка для выборки
     * @return количество цифр в строке
     */
    public int getNumbersCount(String text) {
        char[] textToCharArray = text.toCharArray();
        int countOfDigit = 0;
        for (char symb : textToCharArray) {
            if (Character.isDigit(symb)) {
                countOfDigit++;
            }
        }

        return countOfDigit;
    }

    /**
     * Дан текст. Заменить все цифры
     * соответствующими словами.
     *
     * @param text текст для поиска и замены
     * @return текст, где цыфры заменены словами
     */
    public String replaceAllNumbers(String text) {
        StringBuilder replacedText = new StringBuilder();
        char[] textToCharArray = text.toCharArray();
        for (char symbol : textToCharArray) {
            if (Character.isDigit(symbol)) {
                switch (Character.getNumericValue(symbol)) {
                    case 0:
                        replacedText.append("zero");
                        break;
                    case 1:
                        replacedText.append("one");
                        break;
                    case 2:
                        replacedText.append("two");
                        break;
                    case 3:
                        replacedText.append("three");
                        break;
                    case 4:
                        replacedText.append("four");
                        break;
                    case 5:
                        replacedText.append("five");
                        break;
                    case 6:
                        replacedText.append("six");
                        break;
                    case 7:
                        replacedText.append("seven");
                        break;
                    case 8:
                        replacedText.append("eight");
                        break;
                    case 9:
                        replacedText.append("nine");
                        break;

                }
            } else {
                replacedText.append(symbol);
            }
        }

        return replacedText.toString();
    }

    /**
     * Метод должен заменить заглавные буквы
     * на прописные, а прописные на заглавные
     *
     * @param text строка для изменения
     * @return измененная строка
     */
    public String capitalReverse(String text) {
        StringBuilder capitalReversedText = new StringBuilder();
        char[] textChars = text.toCharArray();
        for (char symbol : textChars) {
            if (Character.isLetter(symbol)) {
                if (Character.isLowerCase(symbol)) {
                    capitalReversedText.append(Character.toUpperCase(symbol));
                } else capitalReversedText.append(Character.toLowerCase(symbol));
            } else capitalReversedText.append(symbol);
        }
        
        return capitalReversedText.toString();
    }

}
