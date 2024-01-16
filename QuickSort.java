//Sorting an array using quick sort method
import java.util.Arrays;
public class QuickSort{
    public static void main(String[] args){
        int[] arr={1,3,5,7,2,4,6,9,8};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //Implementing Quick sort
    //Time Complexity   Best case: n log n
    //                  wrost case: n^2
    public static void sort(int[] arr, int low, int high){
        //condition to check wheather the index of array is out of range
        if(low>=high)
            return;
        int start = low;
        int end = high;
        int mid = (start+end)/2;
        int pivot = arr[mid];
        
        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        //Dividing the array and performing sort
        sort(arr, low, end);
        sort(arr, start, high);
    }
}
