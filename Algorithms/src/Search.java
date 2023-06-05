public class Search {
    public static int searchLinear(int[] arr, int elementToFind){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == elementToFind){
                return i;
            }
        }
        return -1;
    }
    public static int searchBinaryRecursive(int arr[], int startIndex, int endIndex, int elementToFind){//для этого метода массив обязательно должен быть отсартирован!!!!
        if(endIndex >= startIndex){
            int middleIndex = startIndex + (endIndex - startIndex)/2;

            if(arr[middleIndex] == elementToFind){
                return middleIndex;
            }
            if(arr[middleIndex] > elementToFind){
                return searchBinaryRecursive(arr, startIndex, middleIndex - 1, elementToFind);
            }else{
                return searchBinaryRecursive(arr, middleIndex + 1, endIndex, elementToFind);
            }
        }
        return -1;
    }

}
