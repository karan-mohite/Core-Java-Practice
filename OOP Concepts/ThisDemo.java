public class ThisDemo {
  int i;

  void setValues(int i) {
    this.i = i;
  }

  void show() {
    System.out.println(i);
  }

  public static void main(String[] args) {
    ThisDemo t = new ThisDemo();
    t.setValues(10);
    t.show();
  }
}
