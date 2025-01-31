//  Single Inheritance
 class A 
 {
        void showA()
        {
            System.out.println("A Class Method..");
        }
    
}
class B extends A
{
    void showB()
    {
        System.out.println("B Class Method..");
    }
    public static void main(String[] args) 
    {
            A obj=new A();
            obj.showA(); 
            
            B ob2=new B();
            ob2.showB();
    }
}
