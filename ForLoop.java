import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
//        int n = 10;
//        for(int i = 1; i<=n; i++) {
//            System.out.println(i);
//        }
        System.out.println("Enter a positive number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++ ) {
            sum += i;
            System.out.println("the sum of first "+ n+  "natural numbers is:" + sum);
        }


   }


}
