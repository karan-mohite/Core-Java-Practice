public class StringBufferDemo {
    public static void main(String[] args) {
        // StringBuffer sb=new StringBuffer("karan java");
        // System.out.println(sb.capacity());

        // sb.append("Karan");
        // System.out.println(sb.capacity());

        // sb.append("deepak javaa");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        // System.out.println(sb.append(" Vishal"));
        // System.out.println(sb.charAt(3));
        // System.out.println(sb.delete(3, 6));
        // System.out.println(sb.deleteCharAt(3));

        // StringBuffer sb1=new StringBuffer("karan");
        // StringBuffer sb2=new StringBuffer("karan");
        // System.out.println(sb1.equals(sb2));

        // StringBuffer sb1=new StringBuffer("karan");
        // System.out.println(sb1.indexOf("a"));
        // System.out.println(sb1.lastIndexOf("a"));
        // System.out.println(sb1.insert(3, "vishal"));
        // System.out.println(sb1.replace(3, 6, "deep"));
        // System.out.println(sb1.reverse());
        // System.out.println(sb1.subSequence(3, 6));
        // System.out.println(sb1.substring(3,9));
        // System.out.println(sb1.);

        // StringBuffer sb1=new StringBuffer();
        // System.out.println(sb1.capacity());
        // sb1.ensureCapacity(100);
        // System.out.println(sb1.capacity());

        // StringBuffer sb1=new StringBuffer("karan");
        // sb1.setCharAt(2, 'c');
        // System.out.println(sb1);

        StringBuffer sb1 = new StringBuffer();
        // sb1.setLength(4);
        sb1.ensureCapacity(100);
        sb1.append("hello");
        sb1.trimToSize();
        System.out.println(sb1.capacity());
    }
}
