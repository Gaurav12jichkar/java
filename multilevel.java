public class multilevel {
int a=20;
    
}
class multilevel2 extends multilevel{
    int b=40;
}
class multilevel3 extends multilevel2{
    int c=60;
    public static void main(String[] args) {
        multilevel3 m1=new multilevel3();
        System.out.println(m1.a);
        System.out.println(m1.b);
        System.out.println(m1.c);
    }
}
