class First
{
    int id;
    String name;
    First(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    
    {
        System.out.println("Default constructor ");
    }
}
 public class Second extends First
 {
    int age;
    String city;
    Second(int age,String city)
    {
      super(3, "city");

        this.age=age;
        this.city=city;
    }
    
    {   
     
        System.out.println("parameterized constructor ");  
    }
    void display()
        {
            System.out.println(age+" "+city);
           
        }
        void dis(){
            System.out.println(id+" "+name);
        }
    
    public static void main(String[] args) {
        Second s1=new Second(14, "nagpur");
        First f1=new First(1002, "gaurav");
        s1.display();
        s1.dis();
       // f1.display();
       
       

    }
 }