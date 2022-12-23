import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int[] array=new int[]{7,2,4,6,1,9,-1};
        System.out.println("\nunsorted \t\t\t\t"+Arrays.toString(array));
        System.out.println("BubbleSort \t\t\t\t"+Arrays.toString(BubbleSort.bubbleSort(array)));
        array=new int[]{1,-4,6,3,100,97};
        System.out.println("\nunsorted \t\t\t\t"+Arrays.toString(array));
        System.out.println("SelectionSort \t\t\t"+Arrays.toString(SelectionSort.selectionSort(array)));
        array=new int[]{1,-4,6,3,100,97};
        System.out.println("\nunsorted \t\t\t\t"+Arrays.toString(array));
        System.out.println("InsertionSort \t\t\t"+Arrays.toString(InsertionSort.insertionSort(array)));
        array=new int[]{1,-4,6,3,100,97};
        System.out.println("\nunsorted \t\t\t\t"+Arrays.toString(array));
        MergeSort.mergeSort(array);
        System.out.println("MergeSort \t\t\t\t"+Arrays.toString(array));
        array=new int[]{1,-4,6,3,100,97};
        System.out.println("\nunsorted \t\t\t\t"+Arrays.toString(array));
        JD1MergrSort.mergeSort(array);
        System.out.println("MergeSort(JD1) \t\t\t"+Arrays.toString(array));

        array=new int[]{7,2,4,6,1,9,-1};
        System.out.println("\nunsorted \t\t\t\t"+Arrays.toString(array));
        JD1Quicksort.qSort(array,0,array.length-1);
        System.out.println("QuickSort(JD1) \t\t\t"+Arrays.toString(array));



    }
}
