import java.util.Scanner;
public class Kth_Max_Min_Element {
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
    System.out.println("Enter the value of k:");
    int k =s.nextInt();
    //sort array
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    if(k>0 && k<=n)
    {
    int kmin=arr[k-1];
    int kmax=arr[n-k];
    System.out.println("kth min element is:" +kmin);
    System.out.println("kth max element is:" +kmax);
    }
    else{
        System.out.println("Invalid value of k");
    }

}
}