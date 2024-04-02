/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metordenamiento;

/**
 *
 * @author Chris
 */
public class MInsertionSort {
    public static int[] InsertionOrder(int[] unorderedArray, int numEl) {
        int[] newArray = unorderedArray.clone(); // Clone the original array to keep it unchanged

        for (int i = 1; i < numEl; i++) {
            int key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j] > key) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }
        return newArray;
    }
}
