import java.util.Arrays;
import java.util.Scanner;

public class Straight_maxmin {
    public static void main(String[] args)
    {
        int n;
        int a[] = new int[10];

        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int[] result = StraightMaxMin(a,n);
        int min = result[1],max = result[0];
        System.out.println(min+" "+max);
    }

    private static int[] StraightMaxMin(int[] a,int n) {
        int max,min;
        max = min = a[0];
        for(int i = 1;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min = a[i];
        }
        return new int[]{max,min};
    }
}
