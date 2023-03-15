

//overloding 
class rahul
{
  static  void info(String name,String address,String city)
{
 System.out.println(name+" "+address+" " +city+"");
}
}
class gaurav extends rahul
{
  static void info(String name,String address,String city)
  {
   System.out.println(name+" "+address+" " +city+"");
  }
   
}
class rushi extends gaurav
{
  static void info(String name,String address,String city)
  {
   System.out.println(name+" "+address+" " +city+"");
  }
}
class result extends rushi
{
    public static void main(String[]args)
     {
        
        result r1=new result();
        r1.info("RADHE", "PATANSAO", "NAGPUR");
        r1.info("gaurav","waki","nagpur");
        r1.info("rushi","wekjj","pune");
        // System.out.println(rahul.info("rahul", "u", "puner"));
        // System.out.println(gaurav.info("gaurav", "p", "nagpur"));
        // System.out.println(rushi.info("rushi", "n", "gdg"));
    }
}