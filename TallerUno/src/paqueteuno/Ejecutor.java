package paqueteuno;

import java.util.Scanner;

public class Ejecutor {

    public static int[] crear() {
        Scanner entrada = new Scanner(System.in);
        try {

            System.out.print("\nIngrese el tamaño del arreglo:\n> ");
            int tamanio = entrada.nextInt();

            int[] arr = new int[tamanio];
            System.out.println("Arreglo creado con éxito.");
            return arr;

        } catch (Error e) {
            System.out.println("El arreglo ya existe.");
        }
        return null;
    }

    public static void insertar(int[] x) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.print("\nIngresa el elemento de la posicion " + i + ":\n> ");
            x[i] = entrada.nextInt();
        }
    }

    public static void presentar(int[] x) {
        System.out.print("\nAquí tienes tu arreglo:\n> [");
        for (int i = 0; i < x.length; i++) {
            if (i != x.length - 1) {
                System.out.print(" " + x[i] + ",");
            } else {
                System.out.print(" " + x[i]);
            }
        }
        System.out.print(" ]\n");
    }

    public static int busquedaSecuencial(int[] x, int num) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void eliminar(int[] x, int num) {
        int pos = busquedaSecuencial(x, num);

        for (int i = pos; i < x.length - 1; i++) {
            x[i] = x[i + 1];
        }
        x[x.length - 1] = 0;

    }

    public static void burbuja(int[] array) {
        int aux;

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        System.out.print("\nAquí tienes tu arreglo ordenado mediante Burbuja:\n> [");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(" " + array[i] + ",");
            } else {
                System.out.print(" " + array[i]);
            }
        }
        System.out.print(" ]\n");

    }

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }

        System.out.print("\nAquí tienes tu arreglo ordenado mediante QuickSort:\n> [");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(" " + arr[i] + ",");
            } else {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.print(" ]\n");
    }

    public static int partition(int arr[], int begin, int end) {

        int pivot = arr[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }

}

// @author Alexito y Cebejasito
