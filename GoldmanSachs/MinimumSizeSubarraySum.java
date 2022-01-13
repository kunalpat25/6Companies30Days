package GoldmanSachs;

import java.util.Scanner;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        MinimumSizeSubarraySum obj = new MinimumSizeSubarraySum();
        System.out.println(obj.minSubarrayLen(arr, target));
        sc.close();
    }
    public int minSubarrayLen(int arr[], int target)
    {
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean flag = true;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
            if(sum >= target)
            {
                flag = false;
                int len = (i-j) + 1;
                min = Math.min(len, min);
                
                while(j<=i && sum >= target)
                {
                    len = (i-j) + 1;
                    min = Math.min(len, min);
                    sum -= arr[j];
                    j++;
                }
            }
        }
        if(flag)
            return 0;
        
        return min;
    }
}
