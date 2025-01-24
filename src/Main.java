import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число для обчислення квадрату: ");
        int number = scanner.nextInt();
        printSquare(number);
        System.out.print("Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("Об'єм циліндра дорівнює: " + volume);
        System.out.print("Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Введіть " + n + " цілих чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = sumArray(numbers);
        System.out.println("Сума всіх елементів масиву дорівнює: " + sum);
        System.out.print("Введіть рядок: ");
        String text = scanner.next();
        String reversedText = reverseString(text);
        System.out.println("Рядок у зворотньому порядку: " + reversedText);
        System.out.print("Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        double powerResult = power(a, b);
        System.out.println("Результат " + a + "^" + b + " дорівнює: " + powerResult);
        System.out.print("Введіть кількість повторень: ");
        int nText = scanner.nextInt();
        System.out.print("Введіть текстовий рядок: ");
        String textToPrint = scanner.next();
        printTextMultipleTimes(nText, textToPrint);
        scanner.close();
    }
    private static void printSquare(int number) {
        System.out.println("Квадрат числа " + number + " дорівнює: " + (number * number));
    }
    private static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
    private static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    private static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }
    private static double power(int a, int b) {
        return Math.pow(a, b);
    }
    private static void printTextMultipleTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
