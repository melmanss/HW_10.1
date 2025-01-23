import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int number = readInt(scanner);
        System.out.println("Квадрат числа " + number + " дорівнює: " + (number * number) + ".");
        System.out.print("Введіть радіус циліндра: ");
        double radius = readDouble(scanner);
        System.out.print("Введіть висоту циліндра: ");
        double height = readDouble(scanner);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height +
                " дорівнює " + (Math.PI * radius * radius * height) + ".");
        System.out.print("Введіть кількість елементів масиву: ");
        int n = readInt(scanner);
        int[] numbers = new int[n];
        System.out.println("Введіть " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = readInt(scanner);
        }
        System.out.println("Сума всіх елементів масиву дорівнює " + sumArray(numbers) + ".");
        scanner.nextLine();
        System.out.print("Введіть рядок: ");
        String text = scanner.nextLine();
        System.out.println("Рядок в зворотньому порядку: " + new StringBuilder(text).reverse().toString() + ".");
        System.out.print("Введіть a: ");
        int a = readInt(scanner);
        System.out.print("Введіть b: ");
        int b = readInt(scanner);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + Math.pow(a, b) + ".");
        System.out.print("Введіть кількість повторень: ");
        int nText = readInt(scanner);
        scanner.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String textToPrint = scanner.nextLine();
        printTextMultipleTimes(nText, textToPrint);
        scanner.close();
    }
    private static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    private static int readInt(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Неправильний ввод! Будь ласка, введіть ціле число:");
                scanner.next();
            }
        }
    }
    private static double readDouble(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Неправильний ввод! Будь ласка, введіть число з плаваючою комою:");
                scanner.next();
            }
        }
    }
    private static void printTextMultipleTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
