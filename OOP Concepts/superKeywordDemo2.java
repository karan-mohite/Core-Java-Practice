class superKeywordDemo2 {
    
    superKeywordDemo2()
    {
        System.out.println("I am in the class A");
    }
}
class Kajal extends superKeywordDemo2
{
    Kajal()
    {
        super();
        System.out.println("I am in the class B");
    }
    public static void main(String[] args) {
        Kajal kl=new Kajal();

    }
}   
