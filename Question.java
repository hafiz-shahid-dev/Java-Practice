import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
//          int a = 11;
//          if(a=11){
//          }
//}
//         Question 2
//         byte m1, m2, m3;
//          Scanner sc = new Scanner(System.in);
//           System.out.println("Enter your marks in physics");
//           m1 = sc.nextByte();
//           System.out.println("Enter your marks in chemistry");
//            m2 = sc.nextByte();
//         System.out.println("Enter your marks in biology");
//          m3 = sc.nextByte();
//         float ave = (m1+m2+m3)/3.0f;
//          System.out.println("your overall percentage is:" + ave);
//         if(ave>=40 && m1>=33 && m2>=33 && m3>=33) {
//              System.out.println("you are promoted");
//          }
//              else {
//                 System.out.println("you are not promoted");
//             }
//             }
//          }
//
//          Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter amount in lakhs");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<2.5) {
//            tax = tax + 0;
//        }
//        else if (income>2.5 && income<=5) {
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5 && income<=10) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.02f * (income-5f);
//        }
//        else if(income>10) {
//        tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.02f * (10.0f - 5f);
//            tax = tax + 0.03f * (income - 10.0f);
//        }
//        System.out.println("total tax paid by empolyee is:" + tax);
//
//        Question 4
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch(day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("not day");
//        }

   //Question 5
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a year: ");
      int year = sc.nextInt();
      if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
          System.out.println(year + " is a leap year");
      }
      else {
          System.out.println(year + " is not a leap year");
      }
        }

    }

