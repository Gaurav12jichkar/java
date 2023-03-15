class threadl1 extends  Thread
{
    
public void run()
{
    for(int i=1;i<=10;i++)
    {
       
    
    if(i%2==0)
    {
        System.out.println("even"+i);
    }
}
  for(int i=1;i<=10;i++)
  {
     if(i%2!=0)
    {
        System.out.println("odd"+i);
    }
    }
}
public static void main(String[] args) {
    threadl1 t1=new threadl1();
t1.start();
}
}