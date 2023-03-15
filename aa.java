class a1
{
    void print()
    {
        System.out.println("hey hello my name is a1");
    }
}
class b1
{
    void print()
    {
        System.out.println("hey hello my name is b1");      
    }
}
class  c1
{
    void print()
    {
        System.out.println("hey hello my name is c1");
    }
}
interface aa extends c1,b1,a1{
    public static void main(String[] args) {
        aa a2=new aa();
        a2.a1();
        a2.b1();
        a2.c1();
    }
}
