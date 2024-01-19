import java.util.Scanner;

public class MaxMinRecursion {
    public static void main(String[] args) {
        int a[] = new int[50];
        int n;
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int i = 0;
        int j = n-1;
        int[] minmax = maxmin_rec(a,i,j);
        System.out.println("Minimum : " + minmax[1] + " " + "Maximum : "+ minmax[0]);
    }

    private static int[] maxmin_rec(int[] a,int i, int j) {

        int min,max;
        if(i==j)
        {
            min = max = a[i];
            return new int[]{max,min};
        }
        if(i==j-1)
        {
            if(a[i]>a[j]) {
                max = a[i];
                min = a[j];
            }
            else{
                max = a[j];
                min = a[i];
            }
            return new int[]{max,min};


        }
        else
        {
            int mid = (i+j)/2; //Divide

            int[] minmax1 = maxmin_rec(a,i,mid);
            int[] minmax2 = maxmin_rec(a,mid+1, j);

            if(minmax1[0]>minmax2[0])
            {
                max = minmax1[0];
            }
            else {
                max = minmax2[0];
            }
            if(minmax1[1]>minmax2[1])
            {
                min = minmax2[1];
            }
            else
            {
                min = minmax1[1];
            }
        }
        return new int[]{max,min};
    }
}
