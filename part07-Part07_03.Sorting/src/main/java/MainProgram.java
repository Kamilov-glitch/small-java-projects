import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println("asdasd");
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int smallestIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int num1 = array[index2];
        array[index2] = array[index1];
        array[index1] = num1;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int num = array[i];
            int index = indexOfSmallestFrom(array, i);
            int smallest = array[indexOfSmallestFrom(array, i)];
            array[i]  = smallest;
            array[index] = num;
            System.out.println(Arrays.toString(array));
        }
    }

}
