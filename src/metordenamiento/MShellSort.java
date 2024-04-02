/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metordenamiento;

/**
 *
 * @author Chris
 */
public class MShellSort {
    public static int[] ShellOrder(int[] unorderedArray, int numEl) {
        int[] newArray = unorderedArray.clone(); // Clone the original array to keep it unchanged

        int gap = 1;
        while (gap < numEl / 3) {
            gap = gap * 3 + 1;
        }

        while (gap > 0) {
            for (int i = gap; i < numEl; i++) {
                int temp = newArray[i];
                int j = i;
                while (j >= gap && newArray[j - gap] > temp) {
                    newArray[j] = newArray[j - gap];
                    j -= gap;
                }
                newArray[j] = temp;
            }
            gap = (gap - 1) / 3;
        }

        return newArray;
    }
    
}
