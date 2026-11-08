import java.util.Arrays;

public class Main {

    // 1. Сортировка выбором (Selection sort) — по возрастанию
    public static void selectionSort(short[] array) {
        if (array == null || array.length <= 1) return;

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Обмен элементов
            if (minIndex != i) {
                short temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    // 2. Сортировка вставками — по возрастанию
    public static void insertionSort(short[] array) {
        if (array == null || array.length <= 1) return;

        for (int i = 1; i < array.length; i++) {
            short key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        short[] data1 = {15, -3, 42, 0, 8, -12, 99, 4};
        short[] data2 = Arrays.copyOf(data1, data1.length);

        System.out.println("Исходный массив: " + Arrays.toString(data1));

        selectionSort(data1);
        System.out.println("Selection Sort (возрастание): " + Arrays.toString(data1));

        insertionSort(data2);
        System.out.println("Insertion Sort (возрастание): " + Arrays.toString(data2));
    }
}
