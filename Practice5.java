 class Employee {
    int id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class Practice5 {
    public static void main(String[] args) {
        Employee shahid = new Employee();
        shahid.setName("hafiz shahid");
        System.out.println(shahid.getName());
        shahid.setId(345);
        System.out.println(shahid.getId());
    }
}
