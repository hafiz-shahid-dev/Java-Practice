public class Example2 {
    public static void main(String[] args) {
//        int n = 5;
//        int i = 1;
//        int factorial = 1;
//        while (i <= n) {
//            factorial *= i;
//            i++;
//            System.out.println(factorial);
//        }

//        int n = 8;
//        int sum = 0;
//        for(int i=1; i<=10; i++){
//             sum += n*i;
//             System.out.println(sum);
//        }
//        int []marks;
//       marks =  new int [5];
//       marks[0] = 100;
//       marks[1] = 90;
//       marks[2] = 80;
//       marks[3] = 70;
//       marks[4] = 60;
//       System.out.println(marks[3]);
//
//    }
//        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Number:" + numbers[i]);
//        }
//        String[] names = {"ismaee  l", "hafiz","ali"};
//        for(String name : names) {
//            System.out.println("Name:" + name);
//        }
                int[][] numbers = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
                for (int i = 0; i < numbers.length; i++) {
                    for (int j = 0; j < numbers[i].length; j++) {
                        System.out.print(numbers[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }

