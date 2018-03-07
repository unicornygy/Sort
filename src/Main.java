public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5,7,8,6,9,2,4,2,0,1};
        int[] num = new int[]{4,2,1};
        SortMethod.shellSort(array,num);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
