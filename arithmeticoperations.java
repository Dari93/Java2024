import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите 1-е целое число: ");
        int num1 = input.nextInt();

        System.out.print("Введите 2-е целое число: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (double) (num1 + num2) / 2;
        int distance = Math.abs(num1 - num2);
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        System.out.println("Сумма двух целых чисел: " + sum);
        System.out.println("Разница двух целых чисел: " + difference);
        System.out.println("Произведение двух целых чисел: " + product);
        System.out.println("Среднее значение двух целых чисел: " + String.format("%.2f", average));
        System.out.println("Расстояние между двумя целыми числами: " + distance);
        System.out.println("Максимальное целое число: " + max);
        System.out.println("Минимальное целое число: " + min);
    }
}