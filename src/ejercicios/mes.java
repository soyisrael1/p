package ejercicios;

import java.util.Scanner;

public class mes {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	        System.out.print(" ");
	        int numeroMes = scanner.nextInt();
	        
	        String nombreMes = obtenerNombreMes(numeroMes);
	        System.out.println("" + nombreMes);
	    }
	    
	    public static String obtenerNombreMes(int numeroMes) {
	        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
	        
	        if (numeroMes >= 1 && numeroMes <= 12) {
	            return meses[numeroMes - 1];
	        } else {
	            return "Número de mes fuera de rango";
	        }
	    }
	}
