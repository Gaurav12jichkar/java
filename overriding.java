class demo
{
    void run()
    {
        System.out.println("demo class method");
    }

}
class overriding
{
    void run()
    {
        System.out.println("main class method call in overriding");
    }
    public static void main(String[] args) {
        overriding o2=new overriding();
        o2.run();
    }
}