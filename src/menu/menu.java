package menu;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);
	        Scanner in=new Scanner(System.in);
	        int opcion;
	        int edad=0;
	        do{ 
	            System.out.println("1. HolaMundo");
	            System.out.println("2. MayorEdad");
	            System.out.println("3. suma");
	            System.out.println("4. linea");
	            System.out.println("5. cuadrado");
	            System.out.println("6. triangulo");
	            System.out.println("7.salir");
	            System.out.println("");
	            System.out.println("Elige opcion?");
	            opcion=in.nextInt();
	            switch(opcion){
	                case 1:
	            System.out.println("Hola mundo");
	                break;
	                case 2:
	            System.out.println("mayor de edad");
	                String msj=(edad>=18)?"ADULTO":"MENOR DE EDAD";
	            System.out.println(msj);
	                break;
	                case 3:
	                 System.out.println("suma");
	                 int A=teclado.nextInt();
	        int B=teclado.nextInt();
	        int suma;
	        suma=A+B;
	        if(suma % 2 == 0) {
	            System.out.println(+suma+" par");
	        } else {
	            System.out.println(+suma+" impar");
	        }
	                break;
	                case 4:
	                System.out.println("LINEA");
	                int n=in.nextInt();
	                for(int i=0;i<n;i++){
	                    System.out.print("*");
	                }
	                System.out.print("a");
	                break;
	                case 5:
	                System.out.print("cuadrado");
	        int lado = teclado.nextInt();
	        teclado.close();
	 
	        System.out.println();
	        for(int row=1; row<=lado; row++){
	            for(int col=1; col<=lado; col++){
	                
	                    System.out.print("*");
	                
	                
	                    System.out.print(" ");
	                
	            }
	            System.out.println();
	        }
	                case 6:
	                Scanner sc = new Scanner(System.in);
	        System.out.print("Ingresa la altura: ");
	        int numFilas = sc.nextInt();
	            
	 if(numFilas==0){
	     System.out.println("No existe");
	     System.out.println("Ingresa de nuevo la altura");
	     numFilas=sc.nextInt();
	 }
	        for(int altura = 1; altura<=numFilas; altura++){
	            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
	                System.out.print(" ");
	            }
	            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	                case 7:
	                System.out.println("ADIOS");
	                break;
	                default:
	                System.out.println("opcion no valida");
	                break;
	            }
	            
	                
	            }while(opcion!=5);
	        System.out.println("Hasta la vista baby");
	        }
	}