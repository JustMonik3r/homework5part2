import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила " + sum);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + arr[arr.length - 1] + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Средняя сумма трат за месяц составила " + ((double)sum / arr.length));
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = (reverseFullName.length - 1); i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}