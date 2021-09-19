public class HomeWork3 {
    public static void main(String[] args) {
        replaceArray();
        fillTheArray();
        changeArray();
        fillDiagonalArray();
        fullArray(3, 5);
        minMaxArray();
        System.out.println("Задание 7. " + checkArray());
        //stepArray(1, 1, 2, 3);
    }

    public static void replaceArray() {
        int[] arrayForReplace = {1, 1, 0, 0, 1, 1, 1, 0};
        System.out.print("Задание 1. ");
        for (int i = 0; i < arrayForReplace.length; i++) {
            arrayForReplace[i] = arrayForReplace[i] == 0 ? 1 : 0;
            System.out.print(arrayForReplace[i] + " ");
        }
        System.out.println();
    }

    public static void fillTheArray() {
        int[] arrayForFill = new int[100];
        System.out.print("Задание 2. ");
        for (int i = 0; i < arrayForFill.length; i++) {
            arrayForFill[i] = i + 1;
            System.out.print((arrayForFill[i]) + " ");
        }
        System.out.println();
    }

    public static void changeArray() {
        int[] arrayForChange = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Задание 3. ");
        for (int i = 0; i < arrayForChange.length; i++) {
            if (arrayForChange[i] < 6) {
                arrayForChange[i] *= 2;
            }
            System.out.print(arrayForChange[i] + " ");
        }
        System.out.println();
    }

    public static void fillDiagonalArray() {
        int[][] arrayForFillDiafonal = new int[3][3];
        int len = arrayForFillDiafonal.length;
        System.out.print("Задание 4. ");
        System.out.println();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j || j == len - i - 1) {
                    arrayForFillDiafonal[i][j] = 1;
                }
                System.out.print(arrayForFillDiafonal[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fullArray(int len, int initialValue) {
        int[] arrayForFull = new int[len];
        System.out.print("Задание 5. Длина массива: " + len + ". Значение элементов: " + initialValue + ". Массив: ");
        for (int i = 0; i < arrayForFull.length; i++) {
            arrayForFull[i] = initialValue;
            System.out.print(arrayForFull[i] + " ");
        }
        System.out.println();
    }

    public static void minMaxArray() {
        int[] arrayMinMax = {-11, 1, 0, 5, -10, 20, 7, -3};
        int min = 0;
        int max = 0;
        System.out.print("Задание 6. ");
        for (int i = 0; i < arrayMinMax.length; i++) {
            if (arrayMinMax[i] < min) {
                min = arrayMinMax[i];
            }
            if (arrayMinMax[i] > max) {
                max = arrayMinMax[i];
            }
        }
        System.out.println("Минимум: " + min + " Максимум: " + max);
    }

    public static boolean checkArray() {
        int[] arrayMinMaxCheck = {1, 2, 3, 1, 2, 4};
        int sum = 0;
        int left = 0;
        for (int i = 0; i < arrayMinMaxCheck.length; i++) {
            sum += arrayMinMaxCheck[i];
        }
        for (int i = 0; i < arrayMinMaxCheck.length; i++) {
            left += arrayMinMaxCheck[i];
            if (left == sum - left) {
                return true;
            }
        }
        return false;
    }


}
