public class TypeConversionMethod {
    public static void main(String[] args) {
        String name = "Deepak";
        // Case Conversion Method
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Type Conversion Method
        int a = 10, b = 20;
        System.out.println(a + b);
        String s1 = String.valueOf(a); 
        String s2 = String.valueOf(b);
        System.out.println(s1 + s2);

        char[] c = name.toCharArray();
        System.out.println(c);
        System.out.println();
    }
}
