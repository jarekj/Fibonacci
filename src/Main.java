public class Main {

    public static void main(String[] args) {
        System.out.println(FibonacciReq(5));
        System.out.println(FibonacciReq(8));
        System.out.println(FibonacciReq(10));
        System.out.println(FibonacciReq(18));
        System.out.println(FibonacciIter(8));
        System.out.println(FibonacciIter(10));
        System.out.println(FibonacciIter(18));

    }

    public static int FibonacciReq(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return FibonacciReq(n - 1) + FibonacciReq(n - 2);
        }
    }

    public static int FibonacciIter(int n) {
        int[] tab = new int[n + 1];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i <= n; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        return tab[n];
    }
}
