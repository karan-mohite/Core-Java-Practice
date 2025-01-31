class superKeywordDemo {
    int a = 10;
}

class karan extends superKeywordDemo {
    int a = 20;

    void show(int a) {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        karan ob = new karan();
        ob.show(30);
    }
}
