import java.util.Scanner;
class elseif
{
public static void main(String[] args)
{
System.out.println("Enter your marks");
Scanner s1=new Scanner(System.in);
int marks=s1.nextInt();
if(marks<=34)
{
System.out.println("FAIL");
}
else if(marks>=35 && marks<=55)
{
System.out.println("pass with c greade");
}
else if(marks>=56 && marks<=75)
{
System.out.println("pass with B greade");
}
else if(marks>=76 && marks<=90)
{
System.out.println("pass with A greade");
}
else if(marks>=91 && marks<=100)
{
System.out.println("pass with A+ greade");
}
}
}





