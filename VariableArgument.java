public class VariableArgument {
//    public static int sum(int...numbers) {
//        int total = 0;
//        for (int n : numbers) {
//            total += n;
//        }
//        return total;
//    }
//        public static void main(String[] args) {
//        System.out.println("sum of two numbers: " + sum(10,20));
//        System.out.println("sum of four numbers: " + sum(2,4,5,6));
//        System.out.println("sum of six numbers: " + sum(6,8,9,5,4,3));
//        }
    public static int findMax(int...values) {
        int max = values[0];
        for (int v : values) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("maximum of(10,20,5): " + findMax(10,20,5));
        System.out.println("maximum of(2,3,4,5,6): " + findMax(2,3,4,5,6));
        System.out.println("maximum of(100,50): " + findMax(100,50));

            }
        }




