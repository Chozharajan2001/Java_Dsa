//Sorting an array using slection sort method
import java.util.Arrays;
public class SelectionSort{
    public static void main(String[] args){
        int[] arr={1,3,5,7,2,4,6,9,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //time complexity: n^2
    public static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
