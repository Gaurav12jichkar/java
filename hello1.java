public class hello1 {
    public static void main(String[] args) {
        System.out.println("hello");
        hello2 h2= new hello2();
        System.out.println(h2.a);
        h2.print();
        
    }
    
    }

class hello2{
    int a=10;
    int b=30;
    void print()
    {
        int a=20;
        int b=30;
        System.out.println(a+b);
    }
}
