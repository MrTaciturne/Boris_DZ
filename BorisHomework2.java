import java.util.Scanner;

public class BorisHomework2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        Чётность числа

        System.out.print("Введите число для проверки: ");
        int number = in.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " чётное");
        } else {
            System.out.println("Число " + number + " не чётное");
        }
        System.out.println();

//        Весокосный год

        System.out.print("Введите год для проверки: ");
        int year = 0;

        while (year <= 0) {
            year = in.nextInt();
            if (year <= 0) {
                System.out.print("Неверный ввод. Ожидание ввода положительного значения: ");
            }
        }

        if (((year % 4) == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }
}
