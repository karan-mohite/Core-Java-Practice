public class Employee1 {

    String name;
    int emp_id;

    Employee1(String name, int emp_id) {
        this.emp_id = emp_id;
        this.name = name;
    }

    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Karan", 101);
        Employee1 e2 = new Employee1("vishal", 102);
        System.out.println(e1.name + " " + e1.emp_id);
        System.out.println(e2.name + " " + e2.emp_id);
    }
}
