package GoldmanSachs;

import java.util.*;

public class ArrayPairSumDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayPairSumDivisibility obj = new ArrayPairSumDivisibility();
        System.out.println(obj.canPair(arr, k));
        sc.close();
    }
    public boolean canPair(int[] arr, int k) {
        if(arr.length%2 != 0)
            return false;
            
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++)
        {
            int rem = ((arr[i] % k) + k) % k;
            if(map.containsKey(rem))
                map.put(rem, map.get(rem) + 1);
            else
                map.put(rem, 1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int rem = entry.getKey();
            int freq = entry.getValue();
            
            if(rem == 0 || 2*rem == k)
                if(freq%2 != 0)
                    return false;
                else
                    continue;
            
            if(map.containsKey(k-rem))
            {
                int freq2 = map.get(k-rem);
                if(freq != freq2)
                    return false;
            }
            else
                return false;
        }
        
        return true;
    }
}
