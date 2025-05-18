import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.nextLine();
        String rev="";
      for(int i=str.length()-1;i>=0;i--)
      {
        rev+=str.charAt(i);
      }
      if(str.equals(rev))
      {
        System.out.println("string is palindrome");
      }
      else {
        System.out.println("string is not palindrome");
      }
        
    }
    
}
