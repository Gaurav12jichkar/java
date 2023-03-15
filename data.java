import java.util.Scanner;
class data
{
public static  void main(String[] args)
{

Scanner s1=new Scanner(System.in);
System.out.println("enter first name");
String firstname=s1.nextLine();
System.out.println("enter middlename");
String middlen=s1.nextLine();
System.out.println("enter lastname");
String lastn=s1.nextLine();
System.out.println("enter emailid");
String email_id=s1.nextLine();
System.out.println("enter city");
String city=s1.nextLine();

System.out.println("enter age");
int age=s1.nextInt();
System.out.println("enter mobileno");
int mob=s1.nextInt();
System.out.println("first name:-"+firstname);
System.out.println( "middle name:-"+middlen);
System.out.println( "last name:-"+lastn);
System.out.println("emailid:-"+email_id);
System.out.println("city:-"+city);
System.out.println("age:-"+age);
System.out.println("mobileno:-"+mob);

}
}
