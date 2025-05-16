import java.util.Scanner;
public class FindDuplicate {
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
    System.out.println("Duplicate elements are:");
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
        if(arr[i]==arr[j])
        {
           boolean printed=false;
        for(int k=0;k>i;k++)
        {
            if(arr[k]==arr[i])
            {
                printed=true;
                break;
            }
        }
        if(!printed)
        {
            System.out.println(arr[i]);
        }
        break;

        }

    }
}
}
}
