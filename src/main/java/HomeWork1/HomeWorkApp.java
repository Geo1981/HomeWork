package HomeWork1;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println("printThreeWords:");
        printThreeWords();
        System.out.println("\ncheckSumSign:");
        checkSumSign();
        System.out.println("\nprintColor:");
        printColor();
        System.out.println("\ncompareNumbers:");
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("\tOrange");
        System.out.println("\tBanana");
        System.out.println("\tApple");

    }

    public static void checkSumSign() {
        int a = -5;
        int b = 1;

        if (a + b >= 0) {
            System.out.println("\tСумма положительная");
        }
        if (a + b < 0) {
            System.out.println("\tСумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 10;

        if (value <= 0) {
            System.out.println("\tКрасный");
        } else if (value > 0 & value <= 100 ) {
            System.out.println("\tЖелтый");
        } else {
            System.out.println("\tЗеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 1;

        if(a >= b) {
            System.out.println("\ta >= b");
        } else {
            System.out.println("\ta < b");
        }
    }
}
