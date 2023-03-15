class s1
{

String colour="green";
}
class s2 extends s1{
    String colour="yellow";
    void print(){
        System.out.println(colour);
        System.out.println(super.colour);
    }
}
class test12 extends s2{
    
    public static void main(String[] args) {
        test12 t1=new test12();
    //   System.out.prinln( t1.colour);
    //    System.out.prinln(t1.super.colour);
    t1.print();
    }
}