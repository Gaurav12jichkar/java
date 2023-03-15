import java.util.Scanner;
public class method {
    public static void main(String[] args) {
        method2 m1= new method2();
    m1.print();
    }
}
class method2
{
    void print(){
        Scanner s1=new Scanner(System.in);
    String name= s1.nextLine();
    int rollno =s1.nextInt();
    int id =s1.nextInt();
    
    System.out.println(" rollno: "+rollno);
    System.out.println( "id:"+id);
    System.out.println("name:"+name);
}
}
