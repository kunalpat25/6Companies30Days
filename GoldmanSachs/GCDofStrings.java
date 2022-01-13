package GoldmanSachs;

import java.util.Scanner;

public class GCDofStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        GCDofStrings obj = new GCDofStrings();
        System.out.println("GCD of " + str1 + " and " + str2 + " is " + obj.gcdOfStrings(str1, str2));
        sc.close();
    }
    public String gcdOfStrings(String str1, String str2)
    {
        int len1 = str1.length();
        int len2 = str2.length();
        String res = "";
        if((str1 + str2).equals(str2+str1))
        {
            res = str1.substring(0, gcd(len1, len2));
        }
        return res;
    }

    public int gcd(int a, int b)
    {
        if(b == 0)
            return a;        
        return gcd(b, a % b);
    }
}
