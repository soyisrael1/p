package arrays;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] a = new int[5];

        
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }

        
        System.out.println("ARARY");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        
        System.out.println("REVERSO:");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            mult *= a[i];
        }
        System.out.println("Suma de los elementos: " + sum);
        System.out.println("Multiplicación: " + mult);
        }
}
    