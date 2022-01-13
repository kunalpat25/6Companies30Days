package GoldmanSachs;

import java.util.Scanner;

public class KidGettingDamagedToy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        KidGettingDamagedToy obj = new KidGettingDamagedToy();
        System.out.println(obj.findKidThatGetsDamagedToy(n,m,k));
        sc.close();
    }
    public int findKidThatGetsDamagedToy(int n, int m, int k)
    {
        if(m <= n-k+1)
        {
            return m+k-1;
        }

        m = m - (n-k+1);
        return (m%n == 0) ? n : (m % n) ;
    }
}
