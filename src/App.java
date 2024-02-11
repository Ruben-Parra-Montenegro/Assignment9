public class App {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int number = Integer.parseInt(args[0]);
        for (int i = 0; i < number; i++) {

            System.out.println(Fibonacci(i));

        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");

    }

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int sum = a + b;
        while (n > 1) {
            sum = a + b;
            a = b;
            b = sum;
            n--;
        }
        return sum;
    }

}
// java --enable-preview -jar Assignment9.jar 2