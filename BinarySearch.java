import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args)
    {
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
        int i = 0;
        int j = n-1;
        System.out.println("Found position : " + binary_search(arr,i,j,x));
    }

    private static int binary_search(int[] arr, int i,int j, int x) {
        if (i == j) {
            if (x == arr[i])
                return i;
            else
                return -1;
        } else {
            int mid = (i + j) / 2; // divide

            if (arr[mid] == x)
                return mid;
            else {
                if (x > arr[mid]) {
                    i = mid + 1;
                    return binary_search(arr, mid+1, j, x);
                } else {
                    return binary_search(arr, i, mid-1, x);
                }
            }
        }

    }
}
