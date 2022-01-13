package GoldmanSachs;

import java.util.Scanner;

public class MissingAndRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        MissingAndRepeating obj = new MissingAndRepeating();
        int ans[] = obj.findMissingAndRepeating(arr);
        System.out.println("Repeating number is: " + ans[0] + " and missing number is : "+ ans[1]);
        sc.close();
    }
    public int[] findMissingAndRepeating(int arr[])
    {
        int[] res = new int[2];
        for(int i=0; i<arr.length; i++)
        {
            int num = Math.abs(arr[i]);

            if(arr[num-1] > 0)
                arr[num-1] = -arr[num-1];
            else
                res[0] = num;
        }

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > 0)
                res[1] = i+1;
        }

        return res;
    }
}
