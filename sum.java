class addition
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static float add(float e,float f)
    {
        return  e+f;
    }
}
class sum{
    public static void main(String[]args)
    {
        System.out.println(addition.add(2,4));
        System.out.println( addition.add(2,3));
    }
}