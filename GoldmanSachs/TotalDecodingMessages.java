package GoldmanSachs ;

import java.util.Scanner;

public class TotalDecodingMessages 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        TotalDecodingMessages obj = new TotalDecodingMessages();
        System.out.println(obj.countWays(str));
        sc.close();
    }
    public int countWays(String str)
    {
        int modulo = 1000000007;
        int n = str.length();
        int[] dp = new int[n+1];
        
        if(str.charAt(0) == '0')
            return 0;
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i=2; i<=n; i++)
        {
            dp[i] = 0;
            
            if(str.charAt(i-1) > '0')
                dp[i] = dp[i-1] ;
            
            if(str.charAt(i-2) == '1' || str.charAt(i-2) == '2' && str.charAt(i-1) < '7')
                dp[i] = (dp[i] + dp[i-2]) % modulo;
            
        }
        
        return dp[n];
    }
}