public class Practice3 {
    class Student {
        String name;
        int age;
        double marks;


        void showData() {
            System.out.println("name :" + name);
            System.out.println("age :" + age);
            System.out.println("marks :" + marks);
        }
    }

    public class Main {
        public void main(String[] args) {
            Student s1 = new Student();
            s1.name = "ali";
            s1.age = 20;
            s1.marks = 77.7;
            s1.showData();
        }
    }
}