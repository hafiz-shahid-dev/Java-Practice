// class Employee {
//     int salary;
//     String name;
//
//     int getSalary() {
//         return salary;
//     }
//
//     String getName() {
//         return name;
//     }
//
//     void setName(String newName) {
//         name = newName;
//     }
// }
//    public class Practice4 {
//    public static void main(String[] args) {
//        Employee emp1 = new Employee();
//        emp1.name = "Ali";
//        emp1.salary = 5000;
//        System.out.println("Employee NAME:" + emp1.getName());
//        System.out.println("Employee:" + emp1.getSalary());
//        emp1.setName("Ahmad");
//        System.out.println("Updated Name:" + emp1.getName());
//
//    }
//class CellPhone{
//    public void ring() {
//        System.out.println("Ringing...");
//    }
//    public void vibrate() {
//        System.out.println("Vibrating...");
//    }
//    public void silent() {
//        System.out.println("Silent mode on...");
//    }
//
//    }
//    public class Practice4 {
//        public static void main(String[] args) {
//            CellPhone phone = new CellPhone();
//            phone.ring();
//            phone.vibrate();
//            phone.silent();
//        }
//    }
//class Square {
//    int side;
//
//    void setSide(int s) {
//        side = s;
//    }
//
//    int area() {
//        return side * side;
//    }
//
//    int perimeter() {
//        return 4 * side;
//    }
//}
class Rectangle {
    int length;
    int width;
    void setValues(int length, int w) {
        length = 1;
        width = w;
    }
    int area() {
        return length * width;
    }
    int perimeter() {
        return 2 * (length + width);
    }
}











