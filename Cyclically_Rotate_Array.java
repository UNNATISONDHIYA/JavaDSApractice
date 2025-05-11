import java.util.Scanner;
public class Cyclically_Rotate_Array {
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
    System.out.println("Enter an index from which you want to rotate:");
    int start = s.nextInt();
    if(start>=0 && start<n)
    {
    System.out.println("Array after rotation");
    for(int i=0;i<n;i++)
    {
       System.out.println(arr[(start+i)%n]);
    }
}
    else{
        System.out.println("Invalid Index");
    }
}

}