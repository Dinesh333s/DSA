import java.util.Scanner;

public class PowerOf_N_element {
    public static void main(String[] args) {
        int a , n;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        n = sc.nextInt();
        if(a>1 && n>0)
        {
            System.out.println(powerOfN(a,n));
        }
    }

    private static int powerOfN(int a, int n) {
        int combine, total;
        if(n==1)
        {
            return a;
        }
        else {
            int mid = n/2; //divide

            int conquer = powerOfN(a,mid); //conquer

            combine = conquer * conquer;
        }
        if(n%2==1) {
            total = combine * a;
            return total;
        }
        else {
            return combine;
        }
    }
}
