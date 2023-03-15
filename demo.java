public class demo {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.rollno=112;
        p1.id=012233;
        p1.name="gaurav";
        System.out.println(+p1.rollno+" "+p1.id+" "+p1.name);
        
    }
    
}
class pen{
    int rollno;
    int id;
    String name;
}