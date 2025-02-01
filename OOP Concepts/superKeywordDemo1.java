class superKeywordDemo1 {
    void m1() {
        System.out.println("I am in the super class ");
    }

}

class Vishal extends superKeywordDemo1 {
    void m1() {
        System.out.println("i am in class vishal");
    }

    void show() {
        m1();
        super.m1();
    }

    public static void main(String[] args) {
        Vishal ob = new Vishal();
        ob.show();
    }
}
