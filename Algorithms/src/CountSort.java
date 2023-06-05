public class CountSort {//сортировка подсчетом
    public static void countSort(int[] array){
        final int MAX_VALUE = 100;

        int[] count = new int[MAX_VALUE];//массив счетчиков

        for (int i = 0; i < array.length; i++) {
            count[array[i]] +=  1;
        }

        int arrayindex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[arrayindex] = i;
                arrayindex++;
            }
        }
    }
}
