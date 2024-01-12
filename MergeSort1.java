//Sorting an Array using Merge Sort
import java.util.Arrays;
public class MergeSort1{
    public static void main(String[] args){
        int[] array = {1,3,5,7,2,4,6,8,5};
        int joined[] = sort(array);
        for(int num : joined){
            System.out.print(num+" ");
        }
    }
  //Divide and Conquer algorithm
    public static int[] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));// Here arr.length is not inclucive
        return merge(left, right);

    }
  // performing merge sort algorithm
    public static int[] merge(int[] left, int[] right){
        int k=0, i=0, j=0;
        // 'k' is index of new joined array
        // 'i' is index of left array
        // 'j' is index of right array
        int[] join = new int[left.length + right.length];
        while(i<left.length && j<right.length){
            if(left[i]>right[j]){
                join[k] = right[j];
                j++;
                k++;
            }
            else{
                join[k] = left[i];
                i++;
                k++;
            }
        
        }
        for(; i<left.length; i++){
            join[k] = left[i];
            k++;
        }
        for(; j<right.length; j++){
            join[k] = right[j];
            k++;
        }
        return join;
    }
}
