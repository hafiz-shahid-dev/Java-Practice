public class Overloading {
    //    public static int add (int a, int b) {
//        return a + b;
//    }
//    public static int add(int a, int b, int c) {
//        return a + b + c;
//    }
//    public static double add(double a, double b ) {
//        return a + b;
//    }
//        public static void main(String[] args){
//        System.out.println("Sum of two integers: " + add(5,10));
//        System.out.println("Sum of three integers: " + add(5,10,15));
//        System.out.println("Sum of two double: " + add(5.5,10.3));
//    }
    public static double area(double side) {
        return side * side;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static double area(int radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("area of square: " + area(5.0));
        System.out.println("area of rectangle: " + area(5.0, 3.0));
        System.out.println("area of circle: " + area(7));
    }
}



