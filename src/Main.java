import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner arrayScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] unsortedArray = getIntegers(5);
        int[] sortedArray = sortArray(unsortedArray);
        printArray(sortedArray);

    }

    public static int[] getIntegers(int arraySize) {
        System.out.println("input " + arraySize + " integers\r");
        int[] localArray = new int[arraySize];
        for (int i = 0; i < localArray.length; i++) {
            localArray[i] = arrayScanner.nextInt();
        }
        return localArray;
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array,array.length); //uses java inbuilt method to copy the array values of
        // up to specified number of index and assigns to new variable

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false; //end while loop if flag not reset to true
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " contents " + array[i]);
        }
    }
}
