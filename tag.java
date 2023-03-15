//mutliple inheritance

interface A
{
    void create();
}
interface B
{
    void show();
}
class C implements A,B 
{
    public void create(){
        System.out.println("create method");
    }
    public void show()
    {
        System.out.println("show  method");   
    }
}
class tag
{
    public static void main(String[] args) {
        C c1=new C();
        c1.create();
        c1.show();
    }
}