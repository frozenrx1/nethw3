import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int points = 0;
        while (true) {
            System.out.println("Введите год в формате yyyy \n Введите четыре числа, например (2004)");
            int year = scan.nextInt();
            System.out.println("Введите количество дней в году");
            int days = scan.nextInt();
            int realDays = daysInYear(year);
            if (days == realDays) {
                points++;
                System.out.println("Правильно! Год " + year + " имеет: " + realDays + " дней. ");
            } else {
                System.out.println("Не правильно! Год " + year + " имеет: " + realDays + " дней. ");
                break;
            }

        }
        System.out.println("Игра окончена. Набрано очков: " + points);
        scan.close();
    }

    public static int daysInYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366; // Високосный год
        } else return 365; // Не високосный год
    }
}