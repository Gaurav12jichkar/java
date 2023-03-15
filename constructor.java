class constructor
{
    constructor()
    {
        System.out.println("Default constructor");
    }
    constructor(int a)
    {
      System.out.println("parameterized constructor");
     System.out.println(a);
    }
    public static void main(String[] args) {
        constructor c1=new constructor();
        constructor c2=new constructor(2);
        
    }
}