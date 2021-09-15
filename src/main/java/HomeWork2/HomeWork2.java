package HomeWork2;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println("Задание 1: " + inside10and20(10, 20));
        plusOrMinus(1);
        System.out.println("Задание 3: " + isMinus(10));
        printWordNTimes(3, "Задание 4: ");
        System.out.println("Задание 5: " + leapYear(2000));

    }

    public static Boolean inside10and20(int a, int b) {
        int sum = a + b;
        if (10 < sum & sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void plusOrMinus(int a) {
        if (a < 0) {
            System.out.println("Задание 2. Отрицательное число число.");
        } else {
            System.out.println("Задание 2. Положительное число.");
        }
    }

    public static Boolean isMinus(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWordNTimes(int times, String word) {
        int i = 0;
        for (; i < times; i++) {
            System.out.println(word + i);
        }
    }

    public static Boolean leapYear(int year) {
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            return false;
        } else {
            return true;
        }

    }
}


