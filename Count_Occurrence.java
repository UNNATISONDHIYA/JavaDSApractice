import java.util.Scanner;
public class Count_Occurrence {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n = s.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter elements:");
    for(int i=0;i<n;i++)
    {
        arr[i] = s.nextInt();
    }
    System.out.println("Enter element to find its occurrence:");
    int x = s.nextInt();
    int count = 0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==x)
        {
            count++;
        }
    }
    System.out.println("Occurrence of " +x+":" +count);
}
}
