import  java .util.Scanner;
class evenodd

{
public static void main(String[] args)
{ 
System.out.println("any number");
Scanner s1=new Scanner(System.in);
int a=s1.nextInt();
if(a%2==0)
{
System.out.println(" is even number");
}
else
{
System.out.println("is odd number");
}
}
}