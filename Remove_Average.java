// Author: Erick Huerta

/* Class that finds the average of an array if first modifies
 to have the first and last elements removed
*/

public class Remove_Average {

    public static void Process(int[] array) {

        for (int index = 0; index <  array.length - 1; index++) {

            if (index == 0) {
                array[index] = 0;
            }

            if (index == array.length - 1) {
                array[index] = 0;
            }

        }

        int count = 0;
        double average = 0;
        int numofItems = 0;

    while (count < array.length - 1) {

        if (array[count] != 0) {
            numofItems++;
        }

        average += array[count];
        count++;
    }
        average = average / numofItems;

        System.out.println("The average of the array: " + average);
    }

}

