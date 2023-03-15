import java.util.*;
class Queue
{
public static void main(String[] args) {
    PriorityQueue<String>q1=new PriorityQueue<String>();
    {
        q1.add("rohit");
        q1.add("virat");
        q1.add("sky");
        q1.add("sachin");
       q1.add("buvi");
       // System.out.println("head"+q1.element());
       // System.out.println("head"+q1.peek());
        // for(String t:q1)
        // {
        //     System.out.println(t);
        // }
        Iterator l1=q1.iterator();
        while(l1.hasNext())
        {
            System.out.println(l1.next());
        }
    }
}
}