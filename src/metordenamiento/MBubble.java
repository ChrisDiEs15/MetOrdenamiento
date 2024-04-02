/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metordenamiento;
/**
 *
 * @author Chris
 */
public class MBubble {
     public static int[] BubbleOrder(int numEl, int[] unorderedArray) {
        int[] newArray = unorderedArray; 

        for (int i = 0; i < numEl - 1; i++) {
            for (int j = 0; j < numEl - i - 1; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
    }
    
}
