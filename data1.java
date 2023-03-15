import java.util.Scanner;

public class data1 {
    public static void main(String[] args) {
        
        data2 d1=new data2("");
        d1.method();
d1.print();
    }
}
class data2
{
    String name;
        int id;
        int rollno;
    void method()
    {
        name=n;
        id=i;
        rollno=r;
    }
    void print()
    {
        Scanner s1=new Scanner(System.in);
    String n=s1.nextLine();
    int i=s1.nextInt();
    int r=s1.nextInt();
    
        System.out.println("name"+n+ "id" +i+ "rollno" +r);

    }
}
