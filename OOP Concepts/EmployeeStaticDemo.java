public class EmployeeStaticDemo {
    int empid;
    String name;
    static String company = "TIBCO";

    EmployeeStaticDemo(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    void display() {
        System.out.println(empid + " " + name + " " + company);
    }

    public static void main(String[] args) {
        EmployeeStaticDemo e1 = new EmployeeStaticDemo(10, "Karan");
        e1.display();
        EmployeeStaticDemo e2 = new EmployeeStaticDemo(20, "Vishal");
        e2.display();
    }
}
