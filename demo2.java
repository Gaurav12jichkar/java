//abstract class
abstract class demo1
{
    abstract void print();

}
class demo2 extends demo1
{
    void print ()
    {
        System.out.println("this is normal method");
    }
    public static void main(String[] args) {
        demo1 d1=new demo2();
        d1.print();
    }
    
    
}