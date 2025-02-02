public class MethodOverridingDemo1 {

    Object show()
    {
        System.out.println("1");
        return null;
    }
    
}
class Overrriding extends MethodOverridingDemo1
{
    String show()
    {
        System.out.println("2");
        return null;
    }
    public static void main(String[] args) {
        MethodOverridingDemo1 m=new MethodOverridingDemo1();
        m.show();

        Overrriding o=new Overrriding();
        o.show();
    }
}