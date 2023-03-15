class Demo
{
    Demo()
    {
        System.out.println("demo is default constructor");
    }
}
public class Demo4 extends Demo
{
    Demo4()
    {
        super();
        System.out.println("this is demo4 constructor");
    }
    {
        System.out.println("instance block");
    }
    public static void main(String[] args) {
        Demo4 d1=new Demo4();
        Demo4 d2=new Demo4();
    }
}

