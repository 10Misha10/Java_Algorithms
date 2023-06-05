import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void measureTime(Runnable method){
        long startTime = System.nanoTime();
        method.run();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution Time: " + duration + " nanoseconds");
    }
    public static int findMin(int arr[]){//поиск второго по минимальности
        int minValue = arr[0];
        int minIndex = Integer.MAX_VALUE;
        int minIndex2 = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minValue){
                minIndex2 = minValue;
                minValue = arr[i];
                minIndex = i;
            } else if (arr[i] < minIndex2 && arr[i] != minIndex2) {
                minIndex2  = arr[i];
            }
        }
        if(minIndex2 != Integer.MAX_VALUE){
            System.out.println("второй по минимальности " + minIndex2);
        }
        else{
            System.out.println("второго по минимаольности нет");
        }
        //System.out.println(minValue);
        return minIndex;

    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 5, 57, 99, 65, 33, 2, 9, 0, 2, 33, 5};
        System.out.println(Arrays.toString(arr));
        //arr = bubble(arr);
        Bubble.bubbleSortKnuth(arr);
        //arr = choiceSort(arr);
        //QuickSort.quickSort(arr, 0, arr.length - 1);
        //measureTime(() -> QuickSort.quickSort(arr, 0, arr.length - 1));
        //Merge.mergeSort(arr);
        //CountSort.countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}