
// import java.util.*;

// import javax.print.DocFlavor.STRING;
// class LinkList
// {
//     public static void main(String[] args) {
//         List<String> l1 = new LinkedList<String>();
//         {
//             l1.add("zzzz");
//             l1.add("ddd");
//             l1.add("aaa");
//             l1.add("bbb");
//          for(String h:l1)
//          {
//             System.out.println(h);
//          }
//         }
//     }
// }
// {
//     public static void main(String[] args) {
//         List<String>l1= new LinkedList<String> ();
//         {
//             l1.add("ram");
//             l1.add("zzzz");
//             l1.add("ddd");
//             l1.add("aaa");
//             l1.add("bbb");
//             //add element at specific position;
//             l1.add(2,"rhaim");
//             List<String>l2=new LinkedList<String>();
//             l2.add("radhe");
//             l2.add("rushi");
//             //add all element of anotherr linked list
//             l1.addAll(2,l2);
//             // l2.addFirst("GAuti");
//             // l2.addLast("abhi");
//             for(String h:l1)
//             {
//                 System.out.println(h);
//             }
//         }
//     }
// }
// {
//     public static void main(String[] args) {
//LinkedList <String>l1= new LinkedList<String>();
//         {
//                        l1.add("ram");
//                         l1.add("zzzz");
//                         l1.add("ddd");
//                         l1.add("aaa");
//                         l1.add("bbb"); 
//                         System.out.println("show linked list:"+l1);
//                     l1.remove("zzzz");
//                     System.out.println("show linked list:"+l1);
//                     l1.remove(0);
//                     System.out.println("show linked list:"+l1); 
//                     List<String>l2= new LinkedList<String>();  
//                     {
//                         l2.add("mmm");
//                         l2.add("lll");
//                         l1.addAll(l2);
//                         System.out.println("show updated linked list:"+l1); 
//                         l1.removeAll(l2);
//                         System.out.println("show updated linked list:"+l1); 
//                         l1.remove(1);
//                         System.out.println("show updated linked list:"+l1);  
//                     }



//         }
//     }
// }
//decing order linked list
// {
//     public static void main(String[] args) {
//        LinkedList<String>g1=new LinkedList<String>();
//         {
//              g1.add("rohit");
//              g1.add("gill");
//              g1.add("virat");
//              g1.add("sky");
//              Iterator i=g1.descendingIterator();
//              while(i.hasNext())
//              {
//                 System.out.println(i.next());
//              }
//         }
//     }
// }
//user defined linked list

import java.util.*;
//  class Book
// {  
//      int id;  
//     String name,author,publisher;  
//      int quantity;  
//      public Book(int id, String name, String author, String publisher, int quantity) 
//      {  
//         this.id = id;  
//          this.name = name;  
//         this.author = author;  
//          this.publisher =publisher;  
//          this.quantity = quantity;
//      }
//     }
  class Book
  {
    int id;
    String name,author,publisher;
    int qunatity;
    public Book(int id,String name, String author, string publisher,int quantity)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher;
    }
  }