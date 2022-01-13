package GoldmanSachs;

import java.util.* ;

public class PrintAnagramsTogether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] stringList = new String[n];
        for(int i=0; i<n; i++)
        {
            stringList[i] = sc.next();
        }

        PrintAnagramsTogether pat = new PrintAnagramsTogether();
        List<List<String>> ans = pat.anagrams(stringList);
        
        for(List<String> list : ans)
        {
            for(String str : list)
            {
                System.out.print(str + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public List<List<String>> anagrams(String[] string_list) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        
        for(String str : string_list)
        {
            String key = str;
            key = sortString(key);
            ArrayList<String> temp;
            if(map.containsKey(key))
            {
                temp = map.get(key);
            }
            else 
            {
                temp = new ArrayList<>();
            }
            temp.add(str);
            map.put(key, temp);
        }
        
        List<List<String>> res = new ArrayList<>();
        
        for(Map.Entry<String, ArrayList<String>> entry : map.entrySet())
        {
            res.add(entry.getValue());
        }
        
        return res;
    }
    
    public String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}