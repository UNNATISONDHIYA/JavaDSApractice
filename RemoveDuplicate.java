import java.util.Scanner;
class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.nextLine();
        String newstr="";
        for(int i=0;i<str.length();i++)
        {
        char c=str.charAt(i);
        if(newstr.indexOf(c)==-1)
        {
            newstr=newstr+c;
        }
    }
    System.out.println(newstr +" ");
    }
    
}

