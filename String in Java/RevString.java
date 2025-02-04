 
public class RevString {
    public static void main(String[] args) {
        String rev=" ";
        String s="Karan";
        for(int i=s.length()-1;i>=0;i--)
                {
                    rev=rev+s.charAt(i);
                }
                System.out.println("Reverse String is:"+rev);
            }                    
}
