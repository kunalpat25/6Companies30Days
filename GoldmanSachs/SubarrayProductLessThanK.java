package GoldmanSachs;

import java.util.*;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextLong();
        }
        SubarrayProductLessThanK obj = new SubarrayProductLessThanK();
        int res = obj.countSubArrayProductLessThanK(arr, n, k);
        System.out.println(res);
        sc.close();
    }

    public int countSubArrayProductLessThanK(long arr[], long n, long k)
    {
        long prod=1;
        int l = 0;
        int res = 0;
        for(int r=0; r<n; r++)
        {
            prod *= arr[r];            
            if(prod >= k)
            {
                while(l<r && prod>=k)
                {
                    prod = prod/arr[l];
                    l++;
                }
            }            
            if(prod < k)
            {
                long len = (r-l) + 1;
                res += len;
            }
        }        
        return res;
    }
}
