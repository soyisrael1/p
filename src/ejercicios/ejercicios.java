package ejercicios;

import java.util.Scanner;

public class ejercicios {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("");
	    double estatura = input.nextDouble();
	      System.out.print(" ");
	    double peso = input.nextDouble();
	    double imc = peso / (estatura * estatura);
	    System.out.printf("%.2f\n", imc);
	    if (imc < 18.5) {
	      System.out.println("Infra Peso");
	    } else if (imc < 25) {
	      System.out.println("Peso Normal");
	    } else if (imc < 30) {
	      System.out.println("Sobre Peso");
	    } else if (imc < 35) {
	      System.out.println("Obesidad Leve");
	    } else if (imc < 40) {
	      System.out.println("Obesidad Media");
	    } else {
	      System.out.println("Obesidad Morbida");
	    }
	  }
	}
