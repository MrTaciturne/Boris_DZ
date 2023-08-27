// TODO: 22.08.2023 ненужные импорты желательно удалять - комбинация клавиш ctrl + alt + O

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;  // Как я понял, эти библиотеки подключались сами при использовании строк, найденых в интернете

// TODO: 22.08.2023 конвениция для именования классов BorisHomeWork1. В оновном в java используется camalCase. snake_case (BORIS_HOMEWORK) испльзуется для именования констант, до которых мы дойдем. 

public class BorisHomeWork1 {
    public static void main(String[] args) {
        // TODO: 22.08.2023 можно проще System.lineSeparator()
        String newline = System.getProperty("line.separator");  // Порылся в интернете для украшения выходных данных

//        Переработка таблицы умножения

        System.out.println(newline + "Таблица умножения:");

        for (byte i = 1; i <= 10; i++) {
            for (byte b = 1; b <= 10; b++) {
                System.out.print(b + "*" + i + "=" + b * i + " || ");
            }
            System.out.println();
        }

//        Сложение чисел

        System.out.println(newline + "Сложение ваших чисел:" + newline);

        Scanner in = new Scanner(System.in);
        // TODO: 22.08.2023 предпочтительнее писать свой кода так чтобы одна инструкция была на одной строке. Инструкция заканчивается ";"  
        System.out.print("Введите первое число: ");
        int b = in.nextInt();
        System.out.print("Введите второе число: ");
        int c = in.nextInt();
        System.out.println("Результат сложения: " + b + "+" + c + "=" + (b + c) + newline);

//        Рандомайзер на введённом диапозоне

        System.out.println("Случайное положительное число в вашем диапозоне:" + newline);

        System.out.print("Задайте верхний предел: ");
        // TODO: 22.08.2023 для переменных которые используются не цикле например как i и b у тебя, желательно использовать более говрящие имена наприме в этом случае boundNumber или просто number
        b = in.nextInt();
        Random rand = new Random();
        System.out.println("Ваше случайное число: " + (rand.nextInt(b) + 1));

    }

    // TODO: 22.08.2023 можно убирать лишние пробелы в Idea ctrl + alt + L помогает форматировать код до определенной степени. Делает его более красивым. 
}

