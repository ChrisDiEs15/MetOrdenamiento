/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metordenamiento;

/**
 *
 * @author Chris
 */
public class MSelectionSort {
    public static int[] SelectionOrder(int[] unorderedArray, int numEl) {
        int[] newArray = unorderedArray; 
        /*look for the minus element*/
       for (int i = 0; i < numEl - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numEl; j++) {
                if (newArray[j] < newArray[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap newArray[i] and newArray[minIndex]
            int temp = newArray[i];
            newArray[i] = newArray[minIndex];
            newArray[minIndex] = temp;
        }
        
        return newArray;
    }
    
}
