public class MethodOverridingDemo3 {
    void show()throws RuntimeException
    {
        System.out.println("1");
    }
}
class CPM extends MethodOverridingDemo3
{
    void show()
    {
        System.out.println("2");
    }
    public static void main(String[] args) {
        MethodOverridingDemo3 m=new MethodOverridingDemo3();
        m.show();

        CPM c=new CPM();
        c.show();
    }
}
