class newconstructor
{
    static int count=0;
    newconstructor()
    {
        System.out.println("default constructor");
        count++;
    }
    public static void main(String[] args) {
        newconstructor c1=new newconstructor();
        newconstructor c2=new newconstructor();
        System.out.println(count);

    }
}