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
    public static void sort(int[] a){
        int n = a.length; 
        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                //if(a[j])<a[j+1]) for Descending order sort
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
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
