/* 
1) Anonymous Arrays is an array that has no name .
2) Created and initialized in single line .
3) It can be single and multidimensional .
4) Below program two dimensional array is used thats why two for loop is used 
5) It can be used only once .
6) It can be used as an argument in method.
*/
public class AnonymousArraysDemo {

    public static void main(String[] args) {
        AnonymousArraysDemo.sum(new int[][] { { 10, 20, 30 }, { 40, 50 } });
    }

    static void sum(int[][] no) {
        int total = 0;
        for (int ii[] : no) {
            for (int i : ii) {
                total = total + i;
            }
        }
        System.out.println("Sum is " + total);
    }
}
