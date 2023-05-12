package paquetedos;

import java.util.Scanner;
import paqueteuno.Ejecutor;

public class Menu {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion;
        int numero;
        int indice;
        int[] arreglo = null;
        boolean bandera = true;

        try {
            while (bandera) {
                System.out.print("""
                                 
                           -----------------------------------------------
                                           Menú de Arreglo
                           -----------------------------------------------
                            Digita el número del método:
                                1. Crear un Arreglo
                                2. Ingresar Datos en un Arreglo
                                3. Presentar Datos en un Arreglo
                                4. Búsqueda de un Elemento
                                5. Eliminación de un Elemento
                                6. Ordenamiento Burbuja
                                7. Ordenamiento QuickSort
                                8. Salir
                           -----------------------------------------------
                           """);
                System.out.print("> ");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1 -> {
                        arreglo = Ejecutor.crear();
                    }
                    case 2 ->
                        Ejecutor.insertar(arreglo);
                    case 3 ->
                        Ejecutor.presentar(arreglo);
                    case 4 -> {
                        System.out.print("\n¿Qué numero desea buscar?\n> ");
                        numero = entrada.nextInt();
                        indice = Ejecutor.busquedaSecuencial(arreglo,
                                numero);
                        System.out.printf("El número %s se encuentra en el indice: %d\n", numero, indice);
                    }
                    case 5 -> {
                        System.out.print("\n¿Qué numero desea eliminar?\n> ");
                        numero = entrada.nextInt();
                        Ejecutor.eliminar(arreglo, numero);
                        System.out.println("Número eliminado correctamente.");
                    }
                    case 6 -> {
                        Ejecutor.burbuja(arreglo);
                        System.out.print("\nAquí tienes tu arreglo ordenado mediante Burbuja:\n> [");
                        for (int i = 0; i < arreglo.length; i++) {
                            if (i != arreglo.length - 1) {
                                System.out.print(" " + arreglo[i] + ",");
                            } else {
                                System.out.print(" " + arreglo[i]);
                            }
                        }
                        System.out.print(" ]\n");
                    }

                    case 7 -> {
                        Ejecutor.quickSort(arreglo, 0, arreglo.length - 1);
                        System.out.print("\nAquí tienes tu arreglo ordenado mediante QuickSort:\n> [");
                        for (int i = 0; i < arreglo.length; i++) {
                            if (i != arreglo.length - 1) {
                                System.out.print(" " + arreglo[i] + ",");
                            } else {
                                System.out.print(" " + arreglo[i]);
                            }
                        }
                        System.out.print(" ]\n");
                    }
                    default ->
                        bandera = false;
                }

            }

        } catch (NullPointerException e) {
            System.out.println("> Primero debes crear un arreglo.");
        } catch (Error e) {
            System.out.println("> Algo terrible ha sucedido!!");
        }
    }

}

// @author Alexito y Cebejasito
