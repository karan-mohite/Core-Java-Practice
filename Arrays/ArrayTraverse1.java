public class ArrayTraverse1 {

    public static void main(String[] args) {
        int a[] = { 10, 20, 30 };
        // for(int i=0;i<a.length;i++)
        // {
        // System.out.println(a[i]+" ");
        // }

        // for (int i : a) {
        // System.out.println(i + " ");
        // }

        // int i=0;
        // while (i<a.length)
        // {
        // System.out.print(a[i]+" ");
        // i++;
        // }

        int i = 0;
        do {
            System.out.print(a[i] + " ");
            i++;
        } while (i < a.length);
    }
}
