interface aa
{
    void a();
}
interface bb
{
   void b();
}
interface cc
{
    void c();
}
class cd implements aa,bb,cc
{
   public void a()
    {
        System.out.println("hello am a");
    }
    public void b()
    {
        System.out.println("hello am b");

    }
    public void c()
    {
        System.out.println("hello am c");
    }
}
class dd extends cd 
{
    void e()
    {
        System.out.println("hello am e");
    }
}
class child
{
    public static void main(String[] args) {
        dd d1=new dd();
        d1.a();
        d1.b();
        d1.c();
        d1.e();
    }
}