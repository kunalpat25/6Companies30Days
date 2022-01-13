package GoldmanSachs;

import java.util.*;

public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        RunLengthEncoding rle = new RunLengthEncoding();
        System.out.println(rle.encode(str));
        sc.close();
    }
    String encode(String str)
	{
        int n = str.length();
        int i = 0;
        String res = "";
        while(i < n)
        {
            char c = str.charAt(i);
            res += "" + c;
            int count = 1;
            i++;
            while(i<n && str.charAt(i) == c)
            {
                i++;
                count++;
            }
            res += "" + count;
        }
        return res;
	}
	
}
