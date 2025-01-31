public class Employee {

    String name;
    int emp_id;

    Employee(String name, int emp_id) {
        this.name = name;
        this.emp_id = emp_id;
        System.out.println(this.emp_id + " " + this.name);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Karan", 101);
        Employee e2 = new Employee("Vishal", 102);
    }
}
