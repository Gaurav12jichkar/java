import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter rollno,name,marks ,grade");
        String name=sc.nextLine();
        int rollno=sc.nextInt();//used to read datatypes of  lines
        double marks=sc.nextDouble();
        char grade=sc.next().charAt(0);
        System.out.println("name"+name);
        System.out.println("rollno"+rollno);
        System.out.println("marks"+marks);
        System.out.println("grade"+grade);
    }
    
}
