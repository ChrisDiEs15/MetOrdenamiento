/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metordenamiento;
import java.util.Random;
/**
 *
 * @author Chris
 */
public class ArrayCreate {
    /*Random create*/
     public static int[] NewArray(int numEl) {
         /*Init Random*/
        Random randEl= new Random();
        /*Init Array*/
        int[] newArray = new int[numEl];
        for (int i = 0; i < numEl; i++) {
            int nwEl = randEl.nextInt(100);
            newArray[i] = nwEl;
        }
        return newArray;
    }
}
