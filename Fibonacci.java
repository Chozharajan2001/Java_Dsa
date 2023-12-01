package Java_Dsa;



// Program to find fibonacci number upto n number
//program to print the fibonacci series
//first understand what is fibonacci series
// fibonacci of current number is sum of previous two number c=a+b
//fibonacci always starts oth position and 1st and 2nd so on
/* --------------important-----------------------------------------------
                0,1,1,2,3,5
                0th position = 0;
                1th position = 1;
                2nd position = 1;
                3rd position = 2;
                4th position = 3;
                5th position = 5;

*/


import java.util.Scanner;

public class Fibonacci {
    static int t1=0,t2=1,nextTerm;
    static void fib(int n) {
        if(n>0) {
            nextTerm =t1+t2;
            t1=t2;
            t2=nextTerm;
            System.out.printf("%d ",nextTerm);
            fib(n-1);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.printf("%d %d ",t1,t2);
        fib(n-2); }

}
// import java.util.Scanner;; 
// class _1Fibonacci2 {
//     static int fib(int n){
//         if(n<=1){
//             return n;
//         }
//         return fib(n-1)+fib(n-2);
//     }
//     public static void main(String [] args){
//         Scanner s=new Scanner(System.in);
//         System.out.println("Enter the number to find fibonacci: ");
//         int n=s.nextInt();
//         s.close();
//         System.out.printf("The  fibonacci number given %dth is: %d \n",n,fib(n));
        
//     }
// }