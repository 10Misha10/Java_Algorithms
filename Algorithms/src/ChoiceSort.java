public class ChoiceSort {//сортировка выбором
    public static int findMin(int arr[], int step){
        int minValue = arr[step];
        int minIndex = step;

        for(int i = step + 1; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
                minIndex = i;
            }
        }
        //System.out.println(minValue);
        return minIndex;

    }
    public static int[] choiceSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int minIndex = findMin(arr, i);
            if(i != minIndex) {
                /*arr[i] += arr[minIndex];
                arr[minIndex] = arr[i] - arr[minIndex];
                arr[i] -= arr[minIndex];*/
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }


}
