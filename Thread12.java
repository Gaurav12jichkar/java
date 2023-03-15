import java.util.*;
class Thread12 extends Thread{
    Scanner s1=new Scanner(System.in);
    int num=s1.nextInt();
    
     public void run()
    {
        if(num>=0)
        {
            System.out.println("number is positve");
        }
        else
        {
            System.out.println("number is negative");
        }
    }




    public static void main(String[] args) {
       
        Thread12 t1=new Thread12();
        
        t1.start();
    }

}