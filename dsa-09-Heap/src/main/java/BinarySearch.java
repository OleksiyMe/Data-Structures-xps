import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

int[] numbers =new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i]=i;
        }
        Arrays.toString(numbers);
        System.out.println(binarySearchIterative(numbers,6));
    }

    public static int binarySearchIterative(int[] array, int data) {

        int left = 0, right = array.length - 1;

        while (left < right) {

            int middle = (left + right) / 2;
            if (array[middle] == data) return middle;
            if (data < array[middle]) right = middle - 1;
            else left = middle + 1;

        }
        return -1;

    }
}
