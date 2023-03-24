// Author: Erick Huerta
/*
   The purpose of this program is to find the average of an array of numbers
   excluding the smallest and largest numbers of the array
*/

/*

 */


import java.util.Arrays;
import java.util.Scanner;

public class Smallest_Largest {

  public static int[] array = new int[10];
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    // create an instance of the Remove class and Sort class
    SortArray object_sort = new SortArray();
    Remove_Average object_remove = new Remove_Average();

    for (int index = 0; index < 10; index++) {
      System.out.println("Please add an element (please avoid duplicates) : ");
      array[index] = scan.nextInt();
    }

    System.out.println("The list (before sorting) : " + Arrays.toString(array));

    SortArray.Small(array);

    System.out.println("The array after sorting (after sorting) : " + Arrays.toString(array));

    Remove_Average.Process(array);


  }
}
