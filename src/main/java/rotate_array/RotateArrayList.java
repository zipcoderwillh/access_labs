package rotate_array;

import java.util.ArrayList;

/**
 * Created by willhorton on 1/25/16.
 */
public class RotateArrayList<Object> extends ArrayList<Object> {

    private void rotate(int rotateDistance) {

        Object temp;

        for(int i = 0; i < rotateDistance; i++) {
            temp = remove(0);
            add(temp);
        }

    }

    public static void main(String[] args) {

        /********************************************************************
         * Note: instructions state no unit test required for this assignment
         ********************************************************************/

        // Initialize list with integers
        RotateArrayList<Integer> testList = new RotateArrayList<>();
        for(int i = 0; i < 10; i++) {
            testList.add(i);
        }

        // Print out original list
        System.out.println("Original list is:");
        for(Integer num : testList) {
            System.out.printf("%d, ", num);
        }

        // Rotate
        testList.rotate(4);
        System.out.println("\n\nRotating list by 4");

        // Print out new list
        System.out.println("\nRotated list is:");
        for(Integer num : testList) {
            System.out.printf("%d, ", num);
        }


    }

}
