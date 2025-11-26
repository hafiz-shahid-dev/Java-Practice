public class Practice2 {
//    static int factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }
//        public static void main(String[] args) {
//        int n = 6;
//        System.out.println("the value of factorial n is: " + factorial(n));
//        }
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
        public static void main(String[] args) {
        int n = 7;
        System.out.println("fibonacci series:");
        for(int i = 0; i<n; i++){
            System.out.println(fibonacci(i) + " ");

          }
       }
    }

