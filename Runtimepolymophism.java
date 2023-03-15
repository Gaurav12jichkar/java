class Sbi
{
void print()
{
    System.out.println("Sbi=7% intrest");
}
}
class Kotak extends Sbi
{
    void print()
    {
        System.out.println("kotak=8% intrest");
    }
}
class Hdfc extends Kotak
{
    void print()
    {
        System.out.println("Hdfc=4% intrest");
    }
}
class panjab_national extends Hdfc
{
    void print()
    {
        System.out.println("panjab=2% intrest");
    }
}
class Runtimepolymophism extends panjab_national
{
    void print()
    {
        System.out.println("cental=6.7% intrest");
    }
    public static void main(String[] args) {
        Sbi s2=new Sbi();
        Sbi s1=new Kotak();
        Kotak k1=new Hdfc();
       // Hdfc h1=new 
        s2.print();
        s1.print();
        k1.print();

    }
}