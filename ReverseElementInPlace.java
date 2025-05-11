import java.util.Scanner;
public class ReverseElementInPlace {
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
    System.out.println("Enter an index from which you want to reverse:");
    int start = s.nextInt();
    int end=n-1;
    if(start>=0 && end<arr.length && start<end)
    {
    while(start<end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    System.out.println("Array after reversing from given index");
    for(int i=0;i<n;i++)
    {
       System.out.println(arr[i]);
    }
}
else{
    System.out.println("Invalid Index");
}


}
}

