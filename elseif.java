import java.util. Scanner;
public class elseif {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();

       // if (age > 50) {
            //System.out.println("you are experienced!");
     //   } else if (age > 40) {
          //  System.out.println("you are better experienced!");
       // } else if (age > 35) {
       // } else {
          //  System.out.println("you are not experienced");
       // }
        switch(age) {
            case 18:
                System.out.println("you are adult");
                break;
            case 25:
                System.out.println("you are healthy");
                break;
            case 35:
                System.out.println("you are not healthy");
                break;
            default:
                System.out.println("you are not adult");
        }
    }
}









