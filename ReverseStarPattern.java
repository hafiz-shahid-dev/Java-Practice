public class ReverseStarPattern {
    static void printStars(int n){
        for(int i = n; i>= 1; i--){
            for(int j = 1; j<= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printStars(4);
    }
}


