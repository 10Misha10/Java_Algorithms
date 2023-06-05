public class Bubble {
    public static int[] bubble(int arr[]){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 1; i < arr.length; i++){
                if(arr[i] < arr[i-1]){
                    arr[i] += arr[i-1];
                    arr[i-1] = arr[i] - arr[i-1];
                    arr[i] -= arr[i-1];
                    isSorted = false;
                }
            }
        }
        return arr;
    }
    public static int[] bubbleSortKnuth(int[] array) {//оптимизированная версия,  когда с каждым проходом максимальный элемент остается в конце
        int k = 1;
        int j = array.length;
        while (k > 0) {
            k = 0;
            for (int i = 1; i < j; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    k = i;//то есть ловим последний поменяный элемент и уже идем в цикле до него в следующий раз
                }
            }
            j = k;
        }
        return array;
    }

    public static void combSort(int[] array) {//сортировка расческой, когда сравниваем и меняем элементы на каком-то интервале, а не соседние что позволяем быстрее переместить большие элементы вперед
        int gap = array.length;//изначальный наш интервал

        boolean isSorted = false;
        while (!isSorted || gap != 1) {

            if (gap > 1) {
                gap = gap * 10 / 13; // gap / 1.3// это уже давно расчитанный оптимальный шаг изменения интервала(он на самом деле гдето 1.27...)
            } else {
                gap = 1;
            }

            isSorted = true;
            for (int i = gap; i < array.length; i++) {
                if (array[i - gap] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - gap];
                    array[i - gap] = tmp;
                    isSorted = false;
                }
            }
            //когда интервал уже становится 1, то начинается обычная сортировка пузырьком
        }
        //эта сортировка быстрее намного сортировки пузырьком и оптимизированной тоже, также быстрее сортировки выбором
    }
}