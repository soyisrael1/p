package metodoburbuja;

import java.util.Scanner;

public class burbuja {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese la cantidad de números a ingresar: ");
	        int cantidadNumeros = scanner.nextInt();
	        int[] numeros = new int[cantidadNumeros];
	        System.out.println("Ingrese los números:");
	        for (int i = 0; i < cantidadNumeros; i++) {
	            numeros[i] = scanner.nextInt();
	        }
	        System.out.println("IMPRIMIR ARRAY");
	        for (int i = 0; i < cantidadNumeros; i++) {
	            System.out.print(numeros[i] + " ");
	        }
	        System.out.println("\nIMPRIMIR ARRAY ALREVES");
	        for (int i = cantidadNumeros - 1; i >= 0; i--) {
	            System.out.print(numeros[i] + " ");
	        }
	        int suma = 0;
	        int multiplicacion = 1;
	        for (int i = 0; i < cantidadNumeros; i++) {
	            suma += numeros[i];
	            multiplicacion *= numeros[i];
	        }
	        System.out.println("\nSuma" + suma);
	        System.out.println("Multiplicación " + multiplicacion);
	        
	        for (int i = 0; i < cantidadNumeros - 1; i++) {
	            for (int j = 0; j < cantidadNumeros - i - 1; j++) {
	                if (numeros[j] > numeros[j + 1]) {
	                    int temp = numeros[j];
	                    numeros[j] = numeros[j + 1];
	                    numeros[j + 1] = temp;
	                }
	            }
	        }
	        System.out.println("ARRAY ORDENADO");
	        for (int i = 0; i < cantidadNumeros; i++) {
	            System.out.print(numeros[i] + " ");
	        }
	    }
	}
