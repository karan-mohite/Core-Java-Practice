class Test
{
    Test(ThisDemo6 td)
    {
        System.out.println("Test class constructor");
    }
}
class ThisDemo6
 {
    void m1()
    {
        Test t=new Test(this);
    }
    public static void main(String[] args)
    {
        ThisDemo6 t=new ThisDemo6();
        t.m1();
    }   
}
