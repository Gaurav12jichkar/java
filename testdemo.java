abstract class stan
{
    abstract void print();
    stan()
    {
      System.out.println("rahim mc lala");


    }

}
class stan2 extends stan
{
    void print()
    {
        System.out.println("This is stan 2");
    }
}
class stan3 extends stan
{
    void print()
    {
        System.out.println("this is stan3");
    }
}
class testdemo
{
    public static void main(String[] args) {
        
    
    stan s1=new stan3();
    s1.print();
    }
}