class operation
{
    int operation(int n)
    {
  return n*n;
    }
}
public class circle {
    operation o1;
    double pi=3.14;

    double area(int radius)
    {
        o1=new operation();
        int resquare=o1.operatio(radius);
        return pi*resquare;
    }
    public static void main(String[] args) {
        circle c1=new circle();
        double result=c1.area(10);
        System.out.println(result);
    }
}