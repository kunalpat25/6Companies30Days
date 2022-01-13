package GoldmanSachs;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Max10In10Million {
    public static void main(String[] args) {
        int n = 10000000;
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = (int)(Math.random()*1000000000 + 1);
        }
        Max10In10Million obj = new Max10In10Million();
        obj.findMax10From10Million(arr, n);
    }
    public void findMax10From10Million(int arr[], int n)
    {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0; i<10; i++)
        {
            heap.add(arr[i]);
        }
        for(int i=10; i<n; i++)
        {
            if(arr[i] > heap.peek())
            {
                heap.poll();
                heap.add(arr[i]);
            }
        }
        Iterator<Integer> itr = heap.iterator();
        System.out.println("Max 10 numbers are : ");
        while(itr.hasNext())
            System.out.print(itr.next() + " ");
    }
}
