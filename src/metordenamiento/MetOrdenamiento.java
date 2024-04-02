/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metordenamiento;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class MetOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opcion1 = "Bubble Sort";
        String opcion2 = "Quick Sort";
        String opcion3 = "Merge Sort";
        String opcion4 = "Selection Sort";
        String opcion5 = "Shell Sort";
        String opcion6 = "Insertion Sort";

        System.out.println("Programa que contiene metodos de ordenamiento");
        System.out.println("A continuacion se le muestra una lista con los metodos de ordenacion disponibles");
        System.out.println("Por favor elija uno ");
        System.out.println("1." + opcion1);
        System.out.println("2." + opcion2);
        System.out.println("3." + opcion3);
        System.out.println("4." + opcion4);
        System.out.println("5." + opcion5);
        System.out.println("6." + opcion6);
        /*Scanner for option*/
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ha elegino" +opcion1);
                int unordered1[] = DatosEntrada();
                /*Method Selector*/
                MethodSelector(unordered1, opcion, opcion1);
                break;
            case 2:
                System.out.println("Ha elegido" +opcion2);
                int unordered2[]=DatosEntrada();
                MethodSelector(unordered2, opcion,opcion2);
                break;
            case 3:
                System.out.println("Ha elegido" +opcion3);
                int unordered3[]=DatosEntrada();
                MethodSelector(unordered3, opcion,opcion3);
                break;
            case 4:
                System.out.println("Ha elegido" +opcion4);
                int unordered4[]=DatosEntrada();
                MethodSelector(unordered4, opcion,opcion4);
                break;
            case 5:
                System.out.println("Ha elegido" +opcion5);
                int unordered5[]=DatosEntrada();
                MethodSelector(unordered5,opcion,opcion5);
                break;
            case 6:
                System.out.println("Ha elegido" +opcion6);
                int unordered6[]=DatosEntrada();
                MethodSelector(unordered6, opcion,opcion6);
                break;
        }

    }

    public static int[] DatosEntrada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor Ingrese el tamano del array");
        int arraySize = sc.nextInt();
        /*init ArrayCreate*/
        int[] UnorderedArray = ArrayCreate.NewArray(arraySize);
        /*Print Unordered Array */
        System.out.println("El array creado y desordenado es:");
        ArrayPrint.PrintArray(arraySize, UnorderedArray);
        return UnorderedArray;
    }

    public static void MethodSelector(int[] UnorderedArray, int opcion, String nameOpcion) {
        /*Save Array length */        
        int sizeArray=UnorderedArray.length;
        
        switch(opcion){
            case 1:
                /*bubble Sort*/
                int[] OrderedArray1 = MBubble.BubbleOrder(sizeArray, UnorderedArray);
                System.out.println("El array ordenado por" +nameOpcion+ "es:");
                ArrayPrint.PrintArray(sizeArray, OrderedArray1);
                break;
            case 2:
                /*Quick Sort*/
                int[] OrderedArray2 = MQuickSort.MquickSort(UnorderedArray);
                System.out.println("El array ordenado por" +nameOpcion+ "es:");
                ArrayPrint.PrintArray(sizeArray, OrderedArray2);
                break;
            case 3:
                /*Merge Sort*/
                int[] OrderedArray3 = MMergeSort.MSorted(UnorderedArray);
                System.out.println("El array ordenado por" +nameOpcion+ "es:");
                ArrayPrint.PrintArray(sizeArray, OrderedArray3);
                break;
            case 4:
                /*Selection Sort*/
                int[] OrderedArray4 = MSelectionSort.SelectionOrder(UnorderedArray, sizeArray);
                System.out.println("El array ordenado por" +nameOpcion+ "es:");
                ArrayPrint.PrintArray(sizeArray, OrderedArray4);
                break;
            case 5:
                /*Shell sort*/
                int[] OrderedArray5 = MShellSort.ShellOrder(UnorderedArray, sizeArray);
                System.out.println("El array ordenado por" +nameOpcion+ "es:");
                ArrayPrint.PrintArray(sizeArray, OrderedArray5);
                break;
            case 6:
                /*Insertion Sort*/
                int[] OrderedArray6 = MInsertionSort.InsertionOrder(UnorderedArray, sizeArray);
                System.out.println("El array ordenado por" +nameOpcion+ "es:");
                ArrayPrint.PrintArray(sizeArray, OrderedArray6);
                break;
        }
    }
}
