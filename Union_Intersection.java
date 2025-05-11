import java.util.Scanner;
public class Union_Intersection {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size of first array:");
    int n = s.nextInt();
    int[] arr1 = new int[n];
    System.out.println("Enter elements for first Array:");
    for(int i=0;i<n;i++)
    {
        arr1[i] = s.nextInt();  
    }
    System.out.println("Enter size of second array:");
    int m =s.nextInt();
    int[] arr2 = new int[m];
    System.out.println("Enter elements for second Array:");
    for(int i=0;i<m;i++)
    {
        arr2[i] = s.nextInt();
    }

    // Print Union
    System.out.print("Union: ");
    for (int i = 0; i < n; i++) {
        System.out.print(arr1[i] + " ");
    }
    for (int i = 0; i < m; i++) {
        boolean found = false;
        for (int j = 0; j < n; j++) {
            if (arr2[i] == arr1[j]) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.print(arr2[i] + " ");
        }
    }
    System.out.println();

    // Print Intersection
    System.out.print("Intersection: ");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                break;
            }
        }
    }
    System.out.println();
    
}
}
    

