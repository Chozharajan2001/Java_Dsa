//Sorting an array using Insertion sort
import java.util.ArrayList;
public class InsertionSort{
    public static void main(String[] args){
        int array[] = {1,3,2,5,4,6,9,8,7};
        sort(array);
    }
    //Implementing Insertion Sort
    //Time Complexity for worst case : O(n2)
    //                for best case : O(n)
    public static void sort(int[] a){
        int n = a.length;
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
                else{
                  //if already the a[j] and a[j-1] are in correct order
                  break;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : a){
            list.add(num);
        }
        System.out.println("Sorted array : "+list);
    }
}
