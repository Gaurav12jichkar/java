import java.util.Scanner;
class blooddonation
{
public static void main(String[] args)
{
System.out.println("enter weight person");
Scanner s1=new Scanner(System.in);
int weight=s1.nextInt();
if(weight>=60)
{
System.out.println("your eligible for blood donation");
}
else
{
System.out.println("your not eligible for blood donation");
}
}
}
 