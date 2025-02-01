public class EncapsulationEmployeeDemo {

    private int emp_id; // Data hiding

    public void setEmpid(int eid) // setter method
    {
        emp_id = eid;
    }

    public int getEmpid() // getter method
    {
        return emp_id;
    }
}

class company {
    public static void main(String[] args) {
        EncapsulationEmployeeDemo e = new EncapsulationEmployeeDemo();
        e.setEmpid(101);
        System.out.println(e.getEmpid());
    }
}
