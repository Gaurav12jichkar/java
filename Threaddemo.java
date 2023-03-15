 public class Threaddemo extends Thread{
    public void run()
    {
    System.out.println("thread is calling");
    }
    public static void main(String[] args) 
    {

     Threaddemo t1=new Threaddemo();
       
    
            t1.run();
            
       
    }
}