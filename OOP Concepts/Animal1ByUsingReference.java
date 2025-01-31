public class Animal1ByUsingReference {
    String color;
    int age;

    public static void main(String[] args) {
        Animal1ByUsingReference al = new Animal1ByUsingReference();
        al.color = "Red";
        al.age = 10;
        System.out.println(al.color + " " + al.age);
    }
}
