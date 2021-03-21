/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author martin lema
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("******************************* " + " \n"
                + "|  BubbleSort |" + "\n"
                + "******************************************* " + "\n"
                + "| student:Martín Lema | " + "\n"
                + "| University of the Armed Forces Espe | " + "\n"
                + "| geospatial engineering career | " + "\n"
                + "*******************************************");
        int[] integersToSort = {9,7,3,1,4};

        System.out.println("UNSORTED INTEGERS");
        printArray(integersToSort);
        sortByBubbleSort(integersToSort);
        System.out.println("-------------------------------->");
        printArray(integersToSort);

        int[] integersToSort2 = {42,30,-5,7,1,50};

        System.out.println("UNSORTED INTEGERS");
        printArray(integersToSort2);
        sortByBubbleSort(integersToSort2);
        System.out.println("");
        printArray(integersToSort2);
    }
    public static void sortByBubbleSort(int integers[]) {

        //for (int i = 0; i < integers.length - 1; i++) {
        //
        //}
        int n = integers.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (integers[j] > integers[j + 1]) {
                    //swap
                    temp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = temp;
                }
                System.out.print("SORTING----------------------------------- --> ");
                printArray(integers);

            }
            System.out.println("");
        }

    }
    public static void printArray(int[] integers) {
        int n = integers.length;
        for (int i = 0; i < n; i++) {
            System.out.print(integers[i] + " , ");
        }
        System.out.println("");
    }

}
 