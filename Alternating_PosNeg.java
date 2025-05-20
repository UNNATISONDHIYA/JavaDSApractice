import java.util.Scanner;
public class Alternating_PosNeg {
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
    int[] pos = new int[n];
    int[] neg = new int[n];
    int posindex=0,negindex=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]>=0)
        {
            pos[posindex]=arr[i];
            posindex++;
        }
        else{
            neg[negindex]=arr[i];
            negindex++;
        }
    }
    int i=0,p=0,q=0;
    while(p<posindex && q<negindex)
    {
        arr[i++]=pos[p++];
        arr[i++]=neg[q++];
    }
    while(p<posindex)
    {
        arr[i++]=pos[p++];
    }
    while(q<negindex)
    {
        arr[i++]=neg[q++];

    }
    System.out.println("Array:");
    for(int j=0;j<n;j++)
    {
       System.out.println(arr[j]);
    }
}
}

