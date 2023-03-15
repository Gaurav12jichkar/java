class super1
{
    void p1()
    {
        System.out.println("hello");
    }
    
}
class super2 extends super1{
    void p2()
    {
        System.out.println("namaste");
    }
    void p3()
    {
        System.out.println("chal bhai kam hai");
    }
    void print()
    {
        p1();
        p2();
        p3();
    }
}
class super3 extends super2
{
    public static void main(String[] args) {
        super3 s11=new super3();
        s11.print();
    }
}