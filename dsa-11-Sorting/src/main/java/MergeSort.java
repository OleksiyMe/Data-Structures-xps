import java.util.Arrays;

public class MergeSort {


    public static void mergeSort(int[] array) {
        if (array.length < 2) return;   //single item

        int mid = array.length / 2;
        int[] leftArray = Arrays.copyOfRange(array, 0, mid),
                rightArray = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, array);

    }

    public static int[] mergeSortWithReturn(int[] array) {
        if (array.length < 2) return array;   //single item

        int mid = array.length / 2;
        int[] leftArray = Arrays.copyOfRange(array, 0, mid),
                rightArray = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(leftArray);
        mergeSort(rightArray);

        return merge(leftArray, rightArray);

    }

    public static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
    }
    private static int[] merge(int[] leftArray, int[] rightArray) {

        int j = 0;
        int[] result = new int[leftArray.length + rightArray.length];
        for (int i = 0; i < leftArray.length; i++) {
            result[j] = leftArray[i];
            j++;
        }
        for (int i = 0; i < rightArray.length; i++) {
            result[j] = rightArray[i];
            j++;
        }
        return result;
    }


}
