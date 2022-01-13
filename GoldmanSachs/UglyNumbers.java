package GoldmanSachs;

import java.util.Scanner;

public class UglyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        UglyNumbers un = new UglyNumbers();
        System.out.println(un.getNthUglyNo(n));
        sc.close();
    }
    long getNthUglyNo(int n) {
        long[] ugly = new long[n];
        ugly[0] = 1;
        int i2=0,i3=0,i5=0;
        long nm2, nm3, nm5;
        for(int i=1; i<n; i++)
        {
            nm2 = ugly[i2] * 2;
            nm3 = ugly[i3] * 3;
            nm5 = ugly[i5] * 5;
            
            ugly[i] = Math.min(nm2, Math.min(nm3, nm5));
            
            if(ugly[i2] * 2 == ugly[i])
                i2++;
                
            if(ugly[i3] * 3 == ugly[i])
                i3++;
                
            if(ugly[i5] * 5 == ugly[i])
                i5++;
        }
        return ugly[n-1];
    }
}
