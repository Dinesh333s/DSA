import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int x,n;
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        n = sc.nextInt();

        System.out.println("Enter "+n+" array element :");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nEnter element want to found:");
        x = sc.nextInt();
        System.out.println(linear_search(arr,n,x));
    }

    private static int linear_search(int[] arr, int n, int x) {

        for (int i=0;i<n;i++)
        {
            if(x==arr[i])
            {
                System.out.println("\nFound Index :"+ i);
                return i;
            }

        }
        return (-1);
    }

}
