import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int length = scanner.nextInt();
        double[] array = new double[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }

        int maxElementIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 3 == 0) && (maxElementIndex == -1 || array[i] > array[maxElementIndex])) {
                maxElementIndex = i;
            }
        }

        System.out.println("Максимум среди чисел, делящихся на 3: " + array[maxElementIndex] + "; номер максимума: " + (maxElementIndex + 1));
    }
}
