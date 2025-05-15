import java.util.Scanner;
public class Pair_with_sum {
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
    System.out.println("Enter sum:");
    int sum = s.nextInt();
    System.out.println("Pair with Sum:");
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)

        {
            if(arr[i]+arr[j]==sum)
            {
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
            
        }
    }
    
}
}
