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
//    static int fibonacci(int n) {
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
//        public static void main(String[] args) {
//        int n = 7;
//        System.out.println("fibonacci series:");
//        for(int i = 0; i<n; i++){
//            System.out.println(fibonacci(i) + " ");
//
//          }
//    static int multiplication(int n) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n*i);
//        }
//        return 1;
//    }
//            public static void main(String[] args){
//        multiplication(7);
//      }
//
//   static void pattern1(int n){
//    for(int i =0; i<n; i++) {
//        for (int j = 0; j < i + 1; j++) {
//        }
//                System.out.println("*");
//            }
//            System.out.println();
//   }
//}
 //   public static void main(String[] args){
//        pattern1(4);
//        }
//      }
//static int sumRec(int n) {
//    if (n == 1) {
//        return 1;
//    }
//    return n + sumRec(n - 1);
//}
//    public static void main(String[] args){
//    int c = sumRec(5);
//    System.out.println(c);
//    }
//    static void printStars(int n){
//        for(int i = n; i>= 1; i--){
//            for(int j = 1; j<= i; j++) {
//            System.out.println("*");
//            }
//        System.out.println();
//        }
//    }
//       public static void main(String[] args) {
//           printStars(4);
//       }
//    static int fibonacci(int n) {
//        if (n == 1 || n == 2) {
//            return n - 1;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }
//        public static void main(String[] args){
//        int result =fibonacci(7);
//        System.out.println(result);
//    }
//    static void pattern_rec(int n){
//        if(n > 0){
//            pattern_rec(n-1);
//            for(int i = 0; i< n; i++){
//                System.out.println("*");
//            }
//            System.out.println();
//        }
//    }
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args){
        double celsius = 25;
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + "`c = " + fahrenheit + "`f = ");
    }

}




