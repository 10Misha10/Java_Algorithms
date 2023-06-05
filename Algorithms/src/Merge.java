public class Merge {
    //главное его проимущество это СТАБИЛЬНОСТЬ РАБОТЫ и можно не ждать напрмер пока придут все данные, а по ходу их получения сразу кучками сортировать и сливать
    public static int[] mergeSort(int[] array){
        int[] tmp;
        int[] currentSrc = array;//массив источник
        int[] currentDest = new int[array.length];//массив приемник

        int size = 1;//в ней хранится текущий размер сливаемых массивов
        while(size < array.length){
            for(int i = 0; i < array.length; i += 2*size){
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }
            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;
            size *= 2;
        }
        return currentSrc;
    }
    public static void merge(int[] src1, int src1Start, int[] src2, int src2Start,//src1 и src2 это наши подмассивы, src1Start и src2Start это с какого элемента начать слияние
                             int[] dest, int destStart, int size){//dest это массив приемник, destStart это с какого элемента начать запись в массив приемник
                                                                  //size показывает какого размера подмассивы мы должны сливать
        int index1 = src1Start;//текущие элементы в каждом подмассиве
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);//вычисляются концы подмассивов
        int src2End = Math.min(src2Start + size, src2.length);

        int iterationCount = src1End - src1Start + src2End - src2Start;//вычисляем сколько понадобится итераций чтоб объединить два массива(сумарное количество элементов в каждом)

        for(int i = destStart; i < destStart + iterationCount; i++){
            if(index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])){
                dest[i] = src1[index1];
                index1++;
            }
            else{
                dest[i] = src2[index2];
                index2++;
            }
        }
    }
}
