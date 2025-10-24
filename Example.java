import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
//        System.out.println("Enter numbers (0 to stop):");
//        while (true) {
//            System.out.println("Enter a number:");
//            number = sc.nextInt();
//            if (number == 0) {
//                System.out.println("you entered 0. loop stopped!");
//                break;
//            }
//            System.out.println("you entered: " + number);
//        }
//    }
//}

        System.out.println("Enter 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter number" + i + ": ");
            number = sc.nextInt();
            if (number % 2 == 0) {
                continue;
            }
            System.out.println("you entered  number: " + number);
        }
    }
}
