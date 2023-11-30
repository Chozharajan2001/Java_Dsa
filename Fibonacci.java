package Java_Dsa;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int f = 0, s = 1;
        int n;
        System.out.println("Enter the limit for the fibonacci: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(f);
        System.out.println(s);

        for (int i = 0; i < n; i++) {
            int a = f + s, temp = 0;
            System.out.println(a);
            f = s;
            s = a;

        }
    }

}
