class add
{
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        add a1=new add();
        a1.sum(20,30);
        a1.sum(34,30,45);
    }
}