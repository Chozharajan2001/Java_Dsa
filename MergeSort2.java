//Merge sort without using extra arrays
public class MergeSort2{
    public static void main(String[] args){
        int[] array = {1,3,5,7,2,4,8,6};
        sort(array, 0, array.length);
        for(int num : array){
            System.out.print(num+" ");
        }
    }
    //Divide and conquer
    //Dividing each element in an array
    //Time complexity = n log n
    public static void sort(int[] array, int st, int end){
        
        if(end-st==1){
            return ;
        }
        int mid = (end+st)/2;
        sort(array, st, mid);
        sort(array, mid, end);
        
        merge(array, st, end, mid);
    }
    //performing merge sort algorithm
    public static void merge(int[] array, int st, int end, int mid){
        int join[] = new int[end-st];
        int k = 0, i=st, j=mid;
        while(i<mid && j<end){
            if(array[i]<array[j]){
                join[k++] = array[i++];
            }
            else{
                join[k++] = array[j++];
            }        
        }
        //to add remaining elements to the array "join"
        while(i<mid){
            join[k++] = array[i++];
        }
        while(j<end){
            join[k++] = array[j++];
        }
        
        for(k =0; k<join.length; k++){
            array[st+k] = join[k];
        }
    }
}
