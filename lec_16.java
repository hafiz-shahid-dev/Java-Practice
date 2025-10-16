import java.util.Scanner;
public class lec_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter a number");
     //   int num = sc.nextInt();
    //    if (num % 2 == 0)
     //   System.out.println(num + "is a even. ");
    //   else{
      // System.out.println(num + "is a odd. ");


        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num>= 0) 
            System.out.println(num + "is a positive");
            else {
                System.out.println(num + "is a negative");
        }
    }
}

