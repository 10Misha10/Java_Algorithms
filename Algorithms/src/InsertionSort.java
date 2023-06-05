public class InsertionSort {//сортировка вставками
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {//все элементы неотсортированной последовательности
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {//сдвигаем все элементы чтоб освободить ячейку
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }
}
