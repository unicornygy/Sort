public class SortMethod {
    public static void straightInsertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int x = array[i];
            int j = i - 1;
            for(; j >= 0 && x < array[j]; j--){
                array[j + 1] = array[j];
            }
            array[j + 1] = x;
        }
    }
    public static void shellSort(int[] array , int [] num){
        for(int i = 0; i < num.length; i++){
            int length = array.length/num[i];
            for(int j = 1; j < length; j++){
                int x = array[j * num[i]];
                int m = j - 1;
                for(; m >= 0 && x < array[m * num[i]]; m--){
                    array[(m + 1) * num[i]] = array[m * num[i]];
                }
                array[(m + 1) * num[i]] = x;
            }
        }
    }
    public static void simpleSelectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int num = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[j - 1]){
                    num = j;
                }
            }
            array[i] = array[num];
            array[num] = temp;
        }
    }
    public static void heapSort(int[] array){
        //将乱序调整为大顶堆
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            adjustHeap(array,i,array.length);

        }
        //将堆顶元素与堆底交换
        for (int i = array.length - 1; i > 0; i--) {
            swap(array,0,i);
            adjustHeap(array,0,i);
        }

    }
    public static void adjustHeap(int[] array, int k, int length){
        int left = 2 * k + 1;
        int right = left + 1;
        int largest = k;
        if(left < length && array[left] > array[k]){
            largest = left;
        }
        if(right < length && array[right] > array[largest]){
            largest = right;
        }
        if(largest != k){
            swap(array, largest, k);
            adjustHeap(array,largest,length);
        }
    }
    public static void swap(int[] array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array,j, j + 1);
                }
            }
        }
    }
    public static void quickSort(int[] array, int start, int end){
        int i = start;
        int j = end;
        if(i >= j){
            return;
        }
        int key = array[i];
        while (i < j){
            while (i < j && array[j] > key){
                j--;
            }
            array[i] = array[j];
            while (i < j && array[i] <= key){
                i++;
            }
            array[j] = array[i];
        }
        array[i] = key;
        quickSort(array,start,i - 1);
        quickSort(array,i + 1,end);
    }

}
