import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       // String str = "HELLO";
       System.out.println("enter a string:");
       String str = s.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
    }
    
}

