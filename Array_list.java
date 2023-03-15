import java.util.*;
//public class Array_list
// {
// public static void main(String[] args) {
//     ArrayList<String>l1=new ArrayList<String>();
//     l1.add("gaurav");
//     l1.add("allu");
//     l1.add("time");
//     System.out.println(l1);
//     l1.add("lala");
//     System.out.println(l1);
// }
// }
//Using itrrator
// {
//     public static void main(String[] args) {
//         ArrayList<String>l2=new ArrayList<String>();
//         l2.add("mango");
//         l2.add("apple");
//         l2.add("greaps");
//         l2.remove("mango");
//         for(String h:l2)
//         {
//             System.out.println(h.);
//         }

//     }
//}


//get and set method
// {
//     public static void main(String[] args) {
//         ArrayList<Integer>l1=new ArrayList<Integer>();
//         l1.add(1);
//         l1.add(2);
//         l1.add(3);
//         l1.add(4);
//         l1.add(5);
//         System.out.println("element"+l1.get(3));
//         l1.set(3,7);
//         for(int t:l1)
//         {
//             System.out.println(t);
//         }
//     }
// }
//sort array list
//String
// {
//     public static void main(String[] args) {
//         ArrayList<String>s1=new ArrayList<String>();
//         s1.add("rahul");
//         s1.add("cat");
//         s1.add("vijay");
//         s1.add("rahim");
//         Collections.sort(s1);
//         System.out.println(s1);
//     }
// }
//Integer sort
/*{
public static void main(String[] args) {
    ArrayList<Integer>i1=new ArrayList<Integer>();
    i1.add(51);
    i1.add(27);
    i1.add(35);
    i1.add(99);
    i1.add(23);
    i1.add(27);
    Collections.sort(i1);
    for(Integer number:i1)
    {
        System.out.println(number);
    }
}
}*/
//by itretor interface
//{
/*public static void main(String[] args) {
    ArrayList<String>s1=new ArrayList<String>();
    s1.add("virat");
    s1.add("rohit");
    s1.add("shubhman");
    s1.add("sky");
    ListIterator<String>s2=s1.listIterator(s1.size());
     while(s2.hasPrevious())
     {
         String s=s2.previous();
         System.out.println(s);
     }
     System.out.println();
     //normal each loop
     for(int i=0;i<s1.size();i++)
    {
        System.out.println(s1.get(i));
    }
    System.out.println();
    //for each
  s1.forEach(a->
  {
System.out.println(a);
  });
}
}*/
//USER DEFINED ARRAY LIST
class Student
{
 int rollno;
 String name;
 int age;
 Student(int r,String n,int a)
 {
    rollno=r;
    name=n;
    age= a;

 }
}
public class Array_list
{
    public static void main(String[] args) {
        Student s1=new Student(10002,"Aaalu", 20);
        Student s2 =new Student(1003, "rahim", 30);
        Student s3=new Student(2003, "roodj", 21);
        ArrayList<Student>ss=new ArrayList<Student>();
        ss.add(s1);
        ss.add(s2);
        ss.add(s3);
        for( Student h:ss)
        {
            System.out.println(h.age+" "+h.name+" "+h.rollno);
        }
    }
}