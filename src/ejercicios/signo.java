package ejercicios;

import java.util.Scanner;

public class signo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        
        int mes = scanner.nextInt();

        
        int dia = scanner.nextInt();

        
     String epoca="";
    String signo = "";

    switch (mes) {
        case 1: 
            if (dia >= 1 && dia <= 19) {
                signo = "Capricornio";
            } else {
                signo = "Acuario";
            }
        epoca="invierno";
            break;

        case 2: 
            if (dia >= 1 && dia <= 18) {
                signo = "Acuario";
            } else {
                signo = "Piscis";
            }
        epoca="invierno";
            break;

        case 3:
        if (dia>=21){
            epoca="primavera";
        }else{
            epoca="invierno";
        }
            if (dia >= 1 && dia <= 20) {
                signo = "Piscis";
            } else {
                signo = "Aries";
            }
            break;

        case 4: 
            if (dia >= 1 && dia <= 19) {
                signo = "Aries";
            } else {
                signo = "Tauro";
            }
        epoca="primavera";
            break;

        case 5: 
            if (dia >= 1 && dia <= 20) {
                signo = "Tauro";
            } else {
                signo = "Géminis";
            }
        epoca="primavera";
            break;

        case 6: 
        if(dia>=21){
            epoca="verano";
        }else{
            epoca="primavera";
        }
            if (dia >= 1 && dia <= 20) {
                signo = "Géminis";
            } else {
                signo = "Cáncer";
            }
            break;

        case 7: 
            if (dia >= 1 && dia <= 22) {
                signo = "Cáncer";
            } else {
                signo = "Leo";
            }
        epoca="verano";
            break;
        

        case 8: 
            if (dia >= 1 && dia <= 22) {
                signo = "Leo";
            } else {
                signo = "Virgo";
            }
        epoca="verano";
            break;

        case 9: 
        if(dia>=21){
            epoca="otoño";
        }else{
            epoca="verano";
        }
            if(dia >= 1 && dia <= 22) {
signo = "Virgo";
} else {
signo = "Libra";
}
break;


    case 10: 
        if (dia >= 1 && dia <= 22) {
            signo = "Libra";
        } else {
            signo = "Escorpio";
        }
        epoca="otoño";
        break;

    case 11: 
        if (dia >= 1 && dia <= 21) {
            signo = "Escorpio";
        } else {
            signo = "Sagitario";
        }
        epoca="otoño";
        break;

    case 12:
        if(dia>=21){
            epoca="invierno";
        }else{
            epoca="otoño";
        }
        if (dia >= 1 && dia <= 21) {
            signo = "Sagitario";
        } else {
            signo = "Capricornio";
        }
        break;
}
System.out.println(signo);
     System.out.println(epoca);
}
 
}
