import java.time.Duration;
import java.time.Instant;

public class QuickSort {
    public static void quickSort(int[] arr, int from, int to){
        if(from < to){//есть ли что сортировать
            int devideIndex = partion(arr, from, to);//разделение по сторонам по опорному элементу, возвращает индекс элемента по котрому происходит разделение
            quickSort(arr, from, devideIndex - 1);//от начала до элемента
            quickSort(arr, devideIndex, to);//от элемента до конца

        }
    }
    public static int partion(int[] arr, int from, int to){
        int rightIndex = to;
        int leftIndex = from;
        int pivot = arr[(from+to)/2];//выбираем начальную точку, тут выбрали начало массива
        while(leftIndex <= rightIndex){
            while (arr[leftIndex] < pivot){
                leftIndex++;
            }
            while (arr[rightIndex] > pivot){
                rightIndex--;
            }
            if(leftIndex <= rightIndex){//если найдены элементы один меньше опорного а второй больше их меняю местами
                int temp = arr[rightIndex];
                arr[rightIndex] = arr[leftIndex];
                arr[leftIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
