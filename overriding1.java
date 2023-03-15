class bhavaesh
{
   static void data()
    {
        System.out.println("bhaveshdata");
    }
   static void storage()
    {
        System.out.println("bhaveshstorage");   
    }
}
class rahul extends bhavaesh
{
   static void data()
    {
        System.out.println("rahuldata");
    }
    static  void storage()
    {
        System.out.println("rahulstorage");   
    }
}
class radheshyam extends rahul
{
    static void data()
    {
        System.out.println("radhedata");
    }
    static  void storage()
    {
        System.out.println("radhestorage");   
    }
}
class overriding1 extends radheshyam
{
    public static void main(String[] args) {
        overriding1 o2=new overriding1();
        o2.data();
        o2.storage();
    }
}