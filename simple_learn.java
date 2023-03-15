import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//1 implicite data type conversion
// public class simple_learn
// {
//     public static void main(String[] args) {
//         int a=20;
//         System.out.println("int representatin"+a);
//         long b=a;
//         System.out.println("long data type repres."+b);
//         float c=b;
//         System.out.println("float conversion"+c);
//     }  
// }
//2.explicite data type conversion
// public class simple_learn
// {
//  public static void main(String[] args) {
//     double a=50.5033;
//     System.out.println("double repre"+a);
//     float f=(float)a;
//     System.out.println("float representation"+f);
//     long b=(long)a;
//     System.out.println("long representation"+b);
//     int c=(int)b;
//     System.out.println("integer representation"+c);
// }
// }
//3 .hello program in java
// public class simple_learn
// {
//     public static void main(String[] args) {
//         System.out.println("Hello wirld");
//     }

// }
//4.array in java
// public class simple_learn
// {
//     public static void main(String[] args) {
//         int [] arr=new int [5];
//         arr[0]=11;
//         arr[1]=22;
//         arr[2]=33;
//         arr[3]=34;
//         System.out.println("index position 0"+arr[0]);
//         System.out.println("index position 1,2,3:"+arr[1]+" "+arr[2]+" "+arr[3]);
//     }
// }
//5.ternary operator in java
// public class simple_learn
// {
//     public static void main(String[] args) {
//         int a=7;
//         int b=4;
//         int result;
//         result=a > b ? a:b;
//         System.out.println(result);
//     }
// }
//6.switch statement
// public class simple_learn
// {
//     static String name;
//     public static void main(String[] args) {
//         int month=6;
        
//         switch(month)
//         {
//             case 1:
//             name="jan";
//             break;
//             case 2:
//             name="feb";
//             break;
//             case 3:
//             name="march";
//             break;
//             case 4:
//             name="april";
//             break;
//             case 5:
//             name="may";
//             break;
//             case 6:
//             name="june";
//             break;
//             case 7:
//             name="july";

// break;
//         }
//         System.out.println(name);
//     }
// }
//7.two diamensional array
// public class simple_learn
// {
// public static void main(String[] args) {
//     int arr[][]={{2,3,4},{3,6,3},{4,5,6}};
//     for(int i =0;i<3;i++)
//     {
//         for(int j=0;j<3;j++)
//         {
//             System.out.println(arr[i][j]+" ");
//         }
//         System.out.println();
//     }
// }
// }
//8.3d arrya matrix
// public class simple_learn
// {
//     public static void main(String[] args) {
//         int [][][] arr={{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}}; 
//     //System.out.println(arr[1][1][1]);
//     for(int i =0;i<2;i++)
//     {
//         for(int j=0;j<2;j++)
//         { 
//           for(int k=0;k<3;k++){
//             System.out.println(arr[i][j][k]+" ");
//           }
            
//         }
       
//     }
//     System.out.println();
//     }
// }
// 9. enhance for loop Statment
// public class simple_learn
// {
//     public static void main(String[] args) {
//         int[]num={2,3,47,6,54,67,99};
//        int count=0;
//         for(int i:num)
//         {
//             System.out.println(i);
//             count++;
//         }
// System.out.println("count"+count);
//     }
    
// }
//10.coollection in java
//array list
// public class simple_learn
// {
//     public static void main(String[] args) {
        
    
// List<Integer>l1=new ArrayList<>();
//     for(int i=1;i<=6;i++)
//     {
//         l1.add(i);
//     }
//     System.out.println(l1);
    
//     l1.remove(4);
//     System.out.println(l1); 
//     Iterator i=l1.iterator();
//     while(i.hasNext())
//     {
//         System.out.println(i.next());
//     }
// }
// }
//11.linked list.
// public class simple_learn
// {
//     public static void main(String[] args) {
//         LinkedList<String>l1=new LinkedList<String>();
        
//        l1.add("abc");
//        l1.add("bxa");
//        l1.addFirst("ratt");
//        l1.addLast("gaurav");
//        System.out.println(l1);
//        l1.remove(2);
//        System.out.println(l1);
//        //all proprty allso work in remove .
        
//     }
// }
//12.set 
// public class simple_learn
// {
//     public static void main(String[] args) {
//         HashSet<String>h1=new HashSet<>();
//         h1.add("a");
//         h1.add("f");
//         h1.add("d");
//         System.out.println(h1);
//         h1.remove("f");
//         System.out.println(h1);
//         System.out.println("e is present or not="+h1.contains("e"));
//     }
// }
//13.tree set
// public class simple_learn
// {
// public static void main(String[] args) {
//     TreeSet<String>t1=new TreeSet<>();
//     t1.add("apple");
//     t1.add("mango");
//     t1.add("carret");

//     System.out.println(t1);
    
// }
// }
//hasmap
// public class simple_learn{
//     public static void main(String[] args) {
//         HashMap<String,Integer>m1=new HashMap<>();
//         m1.put("a", 12);
//         m1.put("s", 23);
//         m1.put("ss",19);
//         System.out.println("size of map:-"+m1.size());
//         System.out.println(m1);
//         if(m1.containsKey("s"))
//         {
//             Integer s=m1.get("a");
//             System.out.println("value for key"+s);
//         } 
//     }
// }
//Tree map in java.
//   class simple_learn{
//     public static void main(String[] args) {
//         TreeMap<Integer,String>t1=new TreeMap<>();
//         t1.put(3, "A");
//         t1.put(2, "B");
//         t1.put(1, "C");
//         System.out.println(t1);
//     }
//   }
//Stacks in java
//  public class simple_learn
// {
//    public static void main(String[] args) {
//     Stack<String>s1=new Stack<>();
//     s1.push("america");
//     s1.push("germany");
//     s1.push("india");
//     System.out.println("stack" +s1);
//     s1.pop();
//     System.out.println("stack" +s1);
//     s1.peek();
//     System.out.println("stack" +s1);
//    } 
// }
//the que interface
// public class simple_learn
// {
//     public static void main(String[] args) {
//       Queue<String>q1=new PriorityQueue<>();
//       q1.add("india");
//       q1.add("germany");
//       q1.add ("america");
//       System.out.println("orignal que"+q1);
//       q1.remove();
//       System.out.println("queue" +q1); 
//     }
// }
//classes and objects//
// public class simple_learn
// {
//     static int age;
//     static int id;
//     static String name;
//     public simple_learn(String n,int a,int i)
//     {
//        this. name=name;
//        this. age=age;
//        this. id=id;

        
//     }
//     public void setname(String name)
//     {
//         simple_learn.name=name;
//     }    
//     public void setage(int age)
//     {
//         simple_learn.age=age;
//     }
//     public void setid(int id)
//     {
//         simple_learn.id=id;
//     }
//     public static String getname()
//     {
//         return name;
//     }
//     public static int getage()
//     {
//         return age;
//     }
//    public static int getid()
//    {
//     return id;
//    }
//     public  static String getdisplay()
//     {
//         return("studentname"+getname()+"studentage"+getage()+" studentid"+getid());
        
//     }
// public static void main(String[] args) {
//     simple_learn s1=new simple_learn("gaurav", 020, 0222);
//     System.out.println(getdisplay());
 
// }
// }
//constructor//
// public class simple_learn
// {
//     int height;
//     int width;
//     int depth;
//     simple_learn(int height,int width,int depth)
//     {
//         this.height=height;
//         this.width=width;
//         this.depth=depth;
//     }
//     simple_learn(int height,int width)
//     {
//         this.height=height;
//         this.width=width;
//         depth=10;
//     }
//     simple_learn(int diamension)
//     {
//         height=diamension;
//         width=diamension;
//         depth=diamension;
//     }
//     simple_learn(){
//         height=10;
//         width=10;
//         depth=10;
//     }
//     int volume()
//     {
//         return height*width*depth;
//     }
//     public static void main(String[] args) {
//         int volume;
//         simple_learn s1=new simple_learn(12, 07, 17);
//         volume=s1.volume();
//         System.out.println("volume of cubeoid:"+volume);
//         simple_learn s2=new simple_learn(20, 20);
//         volume=s2.volume();
//         System.out.println("volume of cubeoid:"+volume);
//         simple_learn s3=new simple_learn(23);
//         volume=s3.volume();
//         System.out.println("volume of cubeoid:"+volume);
//         simple_learn s4=new simple_learn(30);
//         volume=s4.volume();
//         System.out.println("volume of cubeoid:"+volume);
//     }
// }
//15.streams.
class simple_learn
{
    public static void main(String[] args) {
         List<Integer>a1=new ArrayList<Integer>();
         {
            a1.add(12);
            a1.add(23);
            a1.add(24);
         }
      //one way to show square of list.
         List<Integer>l1=a1.stream().map(x->x*x*x).collect(Collectors.toList());
         System.out.println(l1);
        }
    }
         //another way to show.
//          List<Integer>l1=new ArrayList<Integer>();
//          {
//             for(Integer i:a1)
//             {
//                 l1.add(i*i);
//             }
//             System.out.println(l1);
//          }

//     }
// }
//stream filtre
// class simple_learn
// {
//     public static void main(String[] args) {
//          List<Integer>a1=new ArrayList<Integer>();
//          {
//             a1.add(12);
//             a1.add(23);
//             a1.add(24);
//             a1.add(24);
//             Set<Integer>s1=a1.stream().map(x->x*x).collect(Collectors.toSet());
//             System.out.println(s1);
//          }
//         }
//     }
//filterlist
// class simple_learn
// {
//     public static void main(String[] args) {
        
//         List<String>s1=new ArrayList<>();
        
//             s1.add("rohit");
//             s1.add("shubhman");
//             s1.add("virat");
//             s1.add("sky");
//             System.out.println(s1);
//         //     List<String>s2=new ArrayList<>();
//         //     for(String p:s1)
//         //     {
//         //       if( p.startsWith("v"))
//         //       {
//         //         s2.add(p);
//         //       }
//         //     }
//         //  System.out.println(s2);
//another method.
//         List<String>s2=s1.stream().filter(s->s.startsWith("r")).collect(Collectors.toList());

//         System.out.println(s2);
//     }
// }
//sorting of set trick using stream.
// class simple_learn{
//     public static void main(String[] args) {
//         List <String>l1=new ArrayList<>();
//         l1.add("ram");
//         l1.add("shyam");
//         l1.add("amol");
//         l1.add("bhushan");
//         List<String>s1=l1.stream().sorted().collect(Collectors.toList());
//         System.out.println(s1);
//     }
// }
//STREAM REDUCE IN JAVA.
//if user want to do operation on list(add,sub,mul.etc)
//then they can used reduce function in stream.
//demonstate reduce function.
//identity=an element which is the intial value of an reduce function .
//acumulator=a function take two parameter.
//a partial result of reduction operation and the next element of stream.
//combiner=a fuction used to store partial result of an elment in reduce function.
// class simple_learn{
//     public static void main(String[] args) {
//         List<Integer>l1=new ArrayList<>();
//         l1.add(10);
//         l1.add(60);
//         l1.add(70);
//         System.out.println(l1);
//         int sum=l1.stream().reduce (0, (ans,i)->ans*i);
//         System.out.println(sum);
//     }
// }
//ACCESS modifier in java.
//access

/*modifier|class  |package | subclass| world |
 *--------|-------|--------|---------|-------|
 * public |yes    |yes     |yes      |yes    |
 * protec.|yes    |yes     |yes      |no     |
 * not dif|yes    |yes     |no       |no     |
 * private|yes    |no      |no       |no     |
 * ___________________________________________
*/
//INHERITANC
//  class Bike{
//     protected int gear;
//     protected int speed;
//     public  Bike(int gear,int speed)
//     {
//  this. gear=gear;
//   this.speed=speed;
//     }
//     public void setgear(int newvalue)
//     {
//       this.  gear=newvalue;
//     } 
//     public void upspeed(int inspeed )
//     {
//        this. speed+=inspeed;
//     }
//     public void breakspeed(int despeed)
//     {
//        this. speed-=despeed;
//     }
// }


// class Mouten extends Bike
// { 
//     public int height;
//    public Mouten( int gear,int speed,int height)
//     {
// super(gear, speed);
//  this.height=height;
//     }
//     public void setheight(int value)
//     {
//        this. height=value;
//     }

// }
// class simple_learn{
//     public static void main(String[] args) {
//         Mouten m1= new Mouten(20, 10, 1);
//         System.out.println("gear"+m1.gear+"spped"+m1.speed+" height"+m1.height);
//         m1.upspeed(2);
//         System.out.println(+m1.speed);
        
        
//     }
// }
//en capsualtion
// class simple_learn
// {
//     private int a;
//      public void setA (int num)
//     {
//      a=num;
//     }
//    public int getA()
//    {
//     return a;
//    }
//    public static void main(String[] args) {
//     simple_learn s1=new simple_learn();
//     s1.setA(5);
//     System.out.println(s1.getA());
//    }
// }
//abstraction/abstract method /abstract class.
// 
//interface
//multiple inheritance.
// interface Drawable{  
//   void draw();  
//   }  
//   //Implementation: by second user  
//   class Rectangle implements Drawable
//   {  
//   public void draw()
//   {
//     System.out.println("drawing rectangle");
//   }  
//   }  
//   class Circle implements Drawable{  
//   public void draw()
//   {
//     System.out.println("drawing circle");
//   }  
//   }  
//   //Using interface: by third user  
//   class simple_learn{  
//   public static void main(String args[]){  
//   Drawable d=new Circle();
//   Drawable d1=new Rectangle(); //In real scenario, object is provided by method e.g. getDrawable()  
//   d.draw();  
//   d1.draw();
//   }
// }
//METHOD OVERLOADING
// class simple_learn{
//   int  multiply(int a,int b)
//   {
//     return( a*b);
//   }
//   int multiply(int a, int b,int c)
//   {
//     return(a*b*c);
//   }
//   double multiply(double a,double b,double  c)
//   {
//     return(a*b*c);
//   }
//   public static void main(String[] args) {
//     simple_learn s1=new simple_learn();
//    System.out.println(s1.multiply(10, 20)); 
//    System.out.println(s1.multiply(2, 033, 03));
//    System.out.println(s1.multiply(2.3, 5.6, 6.7));
//   }
// }
//method overriding
// class Vehicle{  
//   //defining a method  
//   void run(){System.out.println("Vehicle is running");}  
// }  
// //Creating a child class  
// class simple_learn extends Vehicle{  
//   //defining the same method as in the parent class  
//   void run(){System.out.println("Bike is running safely");}  
  
//   public static void main(String args[]){  
//   simple_learn obj = new simple_learn();//creating object  
//   obj.run();//calling method  
//   }  
// }  
//static keyword in java.
//Java Program to demonstrate the use of static variable  
// class Student{  
//   int rollno;//instance variable  
//   String name;  
//   static String college ="ITS";//static variable  
//   //constructor  
//   Student(int r, String n){  
//   rollno = r;  
//   name = n;  
//   }  
//   //method to display the values  
//   void display (){System.out.println(rollno+" "+name+" "+college);}  
// }  
// //Test class to show the values of objects  
// public class simple_learn{  
// public static void main(String args[]){  
// Student s1 = new Student(111,"Karan");  
// Student s2 = new Student(222,"Aryan");  
// //we can change the college of all objects by the single line of code  
// //Student.college="BBDIT";  
// s1.display();  
// s2.display();  
// }  
// }  
//Static method
//Java Program to demonstrate the use of a static method.  
// class Student{  
//   int rollno;  
//   String name;  
//   static String college = "ITS";  
//   //static method to change the value of static variable  
//   static void change(){  
//   college = "BBDIT";  
//   }  
//   //constructor to initialize the variable  
//   Student(int r, String n){  
//   rollno = r;  
//   name = n;  
//   }  
//   //method to display values  
//   void display(){System.out.println(rollno+" "+name+" "+college);}  
// }  
// //Test class to create and display the values of object  
// public class simple_learn{  
//  public static void main(String args[]){  
//  Student.change();//calling change method  
//  //creating objects  
//  Student s1 = new Student(111,"Karan");  
//  Student s2 = new Student(222,"Aryan");  
//  Student s3 = new Student(333,"Sonoo");  
//  //calling display method  
//  s1.display();  
//  s2.display();  
//  s3.display();  
//  }  
// }  
// Java static nested class'
//1 
// public class simple_learn{  
//   static int data=30;  
//   static class Inner{  
//    static void msg(){
//     System.out.println("data is "+data);
//   }  
//   }  
//   public static void main(String args[]){  
//   simple_learn.Inner.msg();//no need to create the instance of static nested class  
//   }  
// }  