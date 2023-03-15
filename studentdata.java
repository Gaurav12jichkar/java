class address
{
String city , state,country;
public address(String city,String state,String country)
{
    this.city=city;
    this.state=state;
    this.country=country;


}
}
  public class studentdata
{
     String s_name;
    int s_id;
    address add;
    public studentdata(String s_name,int s_id,address add )
    {
        this.s_name=s_name;
        this.s_id=s_id;
        this.add=add;
    }
    void display()
    {
        System.out.println(s_name+" "+s_id);
        System.out.println(add.city+" "+add.state+" "+add.country);
    }
    public static void main(String[] args) {
        address a1=new address("nagpur","mh","india");
        studentdata s1=new studentdata("radhe",1001,a1);
        s1.display();
        
    }
}
