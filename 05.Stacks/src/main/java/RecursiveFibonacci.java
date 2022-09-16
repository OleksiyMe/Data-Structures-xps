public class RecursiveFibonacci {
    public RecursiveFibonacci() {
    }

    public static void main(String[] args) {
        System.out.println(fib(30L));
    }

    public static long fib(long n) {
        if (n == 0L) {
            return 0L;
        } else {
            return n == 1L ? 1L : fib(n - 1L) + fib(n - 2L);
        }
    }
}