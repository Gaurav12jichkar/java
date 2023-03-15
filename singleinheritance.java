class singleinheritance{
    int a=100;

}
class singleinheritance1 extends singleinheritance
{
    int b=200;
    public static void main(String[] args) {
       singleinheritance1 s1=new singleinheritance1();
       System.out.println(s1.a);
       System.out.println(s1.b);
    }
}