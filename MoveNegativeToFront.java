import java.util.Scanner;
public class MoveNegativeToFront {
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
    int[] temp = new int[n];
    int index=0;
    for(int i=0;i<n;i++)
    {
        if (arr[i]<0)
        {
            temp[index]=arr[i];
            index++;
        }
    }
    for (int i=0;i<n;i++)
    {
        if (arr[i]>=0)
        {
            temp[index]=arr[i];
            index++;
        }
    }
    for (int i=0;i<n;i++)
    {
        arr[i]=temp[i];
    }

    System.out.println("Rearranged Array:");
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]);
    }
}
}
