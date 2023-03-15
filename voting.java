import java .util.Scanner;
class voting
{
public static void main(String[]args)
{

System.out.println("enter the country");
System .out.println("enter the age ");
Scanner s1=new Scanner (System.in);
String country=s1.nextLine();
int age=s1.nextInt();

if( age>=18 && "india".equals(country))
{
System.out.println("your eligible for voting");
}
else
{
 System.out.println("your not eligible for voting");
}
}
}