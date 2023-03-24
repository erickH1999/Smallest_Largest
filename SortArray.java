/*
  Specifically uses insertion sort since it is the most
  efficient of the elementary sorts
 */

public class SortArray {

  public static int[] Small(int[] array) {

    int exchanges = 0, comparisons = 0;
    int numOfItems = array.length;

    // use insertionSort to sort the list and to remove the first and last elements
    for (int passes = 1; passes < numOfItems; passes++) {
      int element = array[passes];
      int inner = passes - 1;

      while (inner >= 0 && array[inner] > element) {
        array[inner + 1] = array[inner];
        inner = inner - 1;
      }
      array[inner + 1] = element;
    }
    return array;
  }
}
