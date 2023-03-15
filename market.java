import java.util.Scanner;

public class market
{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        
       priceve p2=new priceve();
       p2.fruit();
    
       System.out.println("Enter any key for list");
      
    }
}

    class priceve{     
    int price=0;
    Scanner s1=new Scanner(System.in);
    void mango()
    {  
       
        int m=100;
        System.out.println("select the quantity in per kg");
        int qua=s1.nextInt();
         int pri1=100*qua;
         
        System.out.println(+pri1+"mango price");
        price=+pri1;

    } 
    void orange()
    {
        int o=150;
        System.out.println("select the quantity in per kg");
        int qua1=s1.nextInt();
        int pri2=150*qua1;
        
        System.out.println(+pri2+"orange price");
        price=+pri2;
    }
    void tomato()
    {
        int t=40;
        System.out.println("select the quantity in per kg");
        int qua2=s1.nextInt();
        int  pri3=t*qua2;
        System.out.println(+pri3+"tomato price");
     price=+pri3;
    }
    void potato()
    {
        int po=50;
        System.out.println("select the quantity in per kg");
        int qua3=s1.nextInt();
        int pri4=po*qua3;
         
        System.out.println(+pri4+"potato price");
        price=+pri4;

    }
    void total()
    {
    int tax;
    System.out.println(+price+"totalbill");
    System.out.println("total price+gst tax");
    tax=(5*price)/100;
    int total=price+tax;
    System.out.println(total);
    }
    void fruit(){
    System.out.println("LIST OF VEGATABLE & FRUITS");
    
    System.out.println("1.mango=100/kg\n2.Orange=150/kg\n3.tomato=40/kg\n4.potato=50/kg\n5.total bill");
    System.out.println("Choose option");
    int option=s1.nextInt();
    priceve p1=new priceve();
    if(option==1)
    {
     mango(); 
     fruit();
     
     
    }
    else if(option==2)
 
    {
     orange();
     fruit();
     
    }
    else if(option==3)
    {
    tomato();
    fruit();
    }
    else if(option==4)
    {
     potato();
     fruit();
    }
    else if(option==5){
     total();
     fruit();
    }
    else{
     System.out.println("if you want to buy again pls enter y for yes ");
       
    }
 }
 }


   

