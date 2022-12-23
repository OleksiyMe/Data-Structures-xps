import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class MethodsCompare {

    public static void main(String[] args) {
        int powerOf10=9;
        int numberOfElements=(int)Math.pow(10,powerOf10);
        long searchFor=1000000000;
        long start=System.currentTimeMillis();
        long[] numbers = new long[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            numbers[i] = i;
        }
        long stop =System.currentTimeMillis();
        System.out.println();
        System.out.println("numberOfElements = " + numberOfElements);
        System.out.println("Time to fill array: "+(stop-start));
        System.out.println("searchFor = " + searchFor);

//        start=System.currentTimeMillis();
//        BinarySearch.binarySearchIterative(numbers, searchFor);
//        stop =System.currentTimeMillis();
//        System.out.println("Binary search iteractive:  " + (stop-start) + " milis");

//        start=System.currentTimeMillis();
//        BinarySearch.binarySearchRecursive(numbers, searchFor);
//        stop =System.currentTimeMillis();
//        System.out.println("Binary search recursive:  " + (stop-start) + " nanos");
//
//        start=System.currentTimeMillis();
//        ExponentialSearch.exponentialSearch(numbers, searchFor);
//        stop =System.currentTimeMillis();
//        System.out.println("Exponential search:  " + (stop-start) + " milliseconds");




    }


}
