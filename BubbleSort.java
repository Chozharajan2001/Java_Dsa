// Sorting an array using Bubble sort algorithm
import java.util.Scanner;
import java.util.ArrayList;
public class BubbleSort{
    public static void main(String[] args){
        System.out.println("enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("enter the array elements");
        for(int i=0; i<size; i++){
            System.out.println("element "+i+" : ");
            array[i] = sc.nextInt();
        }
        sort(array);
    }
    // Implementing Bubble sort
    //Space Complex  : O(1) Since onely one array is used
    //Time Complex : O(n^2) 
    //1st iteration: n-1 steps
    //2nd iteration: n-2 steps
    // ... up to
    // nth iteration: 1   So, (n-1)(n-1+1)/2 = (n^2 * n)/2
    public static void sort(int[] a){
        int n = a.length; 
        boolean swap = false;
        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                //if(a[j])<a[j+1]) for Descending order sort
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                System.out.println("Already sorted");
                break;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : a){
            list.add(num);
        }
        System.out.println("Sorted Array:");
        System.out.println(list);
    }
}
