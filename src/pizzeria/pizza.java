package pizzeria;

import java.util.Scanner;

public class pizza {
	static String especialidades[] = {"Hawaiana", "Queso", "Verduras", "Jamon", "Al pastor"};
    static int precioPizza[] = {80, 100, 150, 60, 160};
    static String tamanio[] = {"Chica", "Mediana", "Grande", "individual"};
    static String complementos[] = {"Refresco", "Papas", "nuggets", "helado", "hamburguesa"};
    static int precioComplementos[] = {30, 40, 60, 45, 70};
    static int orden[][];
    static String nombre, direccion, telefono;
    static int nPizzas = 0, nComplementos = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        do {

            System.out.println("------Pizzeria bolbo-----");
            System.out.println(". Bienvenido. ");
            System.out.println("Menu. -");
            System.out.println("- 1. Deseo Ordenar-");
            System.out.println("- 2.Revisar pedido-");
            System.out.println("- 3.Finalizar-");
            System.out.println(". ");
            System.out.println("--------------------------------");
            System.out.println("ELIGE UNA OPCION?");

            opcion = in.nextInt();
            in.nextLine(); // Consume la nueva línea

            switch (opcion) {

                case 1:
                    System.out.println("nombre");
                    nombre = in.nextLine();
                    System.out.println("direccion");
                    direccion = in.nextLine();
                    System.out.println("telefono");
                    telefono = in.nextLine();
                    System.out.println("cuantas pizzas");
                    nPizzas = in.nextInt();
                    System.out.println("cuantas complementos");
                    nComplementos = in.nextInt();
                    orden = new int[nPizzas + nComplementos][3];

                    for (int j = 0; j < nPizzas; j++) {
                        int tam = 0;
                        do {
                            System.out.println("-----------------------------\n");
                            System.out.println("ELIGE TAMAÑO DE LA PIZZA" + (j + 1));
                            for (int i = 0; i < tamanio.length; i++) {
                                System.out.println((i + 1) + " " + tamanio[i].toUpperCase());
                            }
                            System.out.print("\nELIGE UNA OPCION?");
                            tam = in.nextInt();
                            in.nextLine(); // Consume la nueva línea
                            if (tam <= 0 || tam > 5) {
                                System.out.println("\nOPCION INVALIDA-- VUELVE A ELEGIR\n");
                            } else {
                                orden[j][0] = tam;
                            }
                        } while (tam <= 0 || tam > 5);

                        int esp = 0;
                        do {
                            System.out.println("------------------------------------------------------------\n");
                            System.out.println("ELIGE ESPECIALIDAD DE LA PIZZA" + (j + 1));
                            for (int i = 0; i < especialidades.length; i++) {
                                System.out.println((i + 1) + " " + especialidades[i].toUpperCase());
                            }
                            System.out.print("\nELIGE UNA OPCION?");
                            esp = in.nextInt();
                            in.nextLine(); // Consume la nueva línea
                            if (esp <= 0 || esp > 5) {
                                System.out.println("\nOPCION INVALIDA VUELVE A ELEGIR\n");
                            } else {
                                orden[j][1] = esp;
                            }
                        } while (esp <= 0 || esp > 5);

                        int cuantas = 0;
                        do {
                            System.out.println("-----------------------------------------/n");
                            System.out.println("- ---\n");
                            System.out.println("¿CUANTAS DE LA PIZZA " + (j + 1) + "? (1 a 3)");
                            cuantas = in.nextInt();
                            
                            in.nextLine(); // Consume la nueva línea
                            if (cuantas <= 0 || cuantas > 3) {
                                System.out.println("\nVALOR INVALIDO\n");
                            } else {
                                orden[j][2] = cuantas;
                            }
                        } while (cuantas <= 0 || cuantas > 3);
                    }

                    for (int j = nPizzas; j < (nPizzas + nComplementos); j++) {
                        int comple = 0;
                        do {
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("ELIGE COMPLEMENTO" + (j + 1));
                            for (int i = 0; i < complementos.length; i++) {
                                System.out.println((i + 1) + " " + complementos[i].toUpperCase());
                            }
                            System.out.print("\nELIGE UNA OPCION?");
                            comple = in.nextInt();
                            in.nextLine(); // Consume la nueva línea
                            if (comple <= 0 || comple > 4) {
                                System.out.println("\nOPCION INVALIDA-- VUELVE A ELEGIR\n");
                            } else {
                                orden[j][0] = comple;
                            }
                        } while (comple <= 0 || comple > 4);
                        int cuantas = 0;
                        do {
                            System.out.println("------------------------------------------\n");
                            System.out.println("¿CUANTAS DE ESTE COMPLEMENTO " + (j + 1) + "? (1 a 3)");
                            cuantas = in.nextInt();
                            in.nextLine(); // Consume la nueva línea
                            if (cuantas <= 0 || cuantas > 3) {
                                System.out.println("\nVALOR INVALIDO\n");
                            } else {
                                orden[j][1] = cuantas;
                            }
                        } while (cuantas <= 0 || cuantas > 3);
                    }

                    break;

                case 2:
                    imprimirOrden();
                    break;

                default:
                    break;
            }
        } while (opcion != 3);
    }

    public static void imprimirOrden() {
        System.out.println("---------------------ORDEN----------------------");
        int total = 0;
        System.out.println("Nombre:" + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("");
        for (int i = 0; i < orden.length - nComplementos; i++) {
            System.out.println(orden[i][2] + " Pizzas " + tamanio[orden[i][0] - 1] + " de " +
                    especialidades[orden[i][1] - 1] + "\t $" + (precioPizza[orden[i][0] - 1] * orden[i][2]));
            total += (precioPizza[orden[i][0] - 1] * orden[i][2]);
        }
        System.out.println("\nCOMPLEMENTOS\n");
                for (int i = nPizzas; i < orden.length; i++) {
            System.out.println(orden[i][1] + " " + complementos[orden[i][0] - 1] + "\t" +
                    (precioComplementos[orden[i][0] - 1] * orden[i][1]));
            total += (precioComplementos[orden[i][0] - 1] * orden[i][1]);
        }
        System.out.println("\n TOTAL A PAGAR: $" + total);
        System.out.println("gracias por comprar");
        System.out.println("\n------ -FIN ORDEN---\n");
    }
}
