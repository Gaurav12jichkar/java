import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

  class Billgenration
{
   private String productName;
   private int quantity;
   private double price;
   private double totalammount;
 Billgenration(String productName,int quantity,double price,double totalammount)
 {
    this.productName=productName;
 this.quantity=quantity;
 this.price=price;
 this.totalammount=totalammount;
}
 public String getproductName()
 {
return productName;
 }
 public int getquantity()
 {
    return quantity;
 }
 public double getprice(){
    return price;
 }
 public double gettotalammount()
 {
    return totalammount;
 }
 public static  void display()
 {
System.out.print("\nname      Quantity     price      totalprice\n");
 }
 public void display2()
 {
System.out.format("\n%-9s %8d %10.2f  %10.2f\n",productName,quantity,price,totalammount);
 }
}
public  class Billgenration1
{
    public static void main(String[] args)
     {
        String productName1=null;
        int quantity1=0;
        double price1=0.0d;
        double totalammount1=0.0d;
        double overallprice=0.0d;  
        char choice='\0';
        Scanner s1=new Scanner(System.in);
    ArrayList<Billgenration>b1=new ArrayList<Billgenration>();
   do 
   {
    System.out.println("enter the product details");
    System.out.println("name");
    productName1=s1.nextLine();
    System.out.println("quantity");
    quantity1=s1.nextInt();
    System.out.println("price");
    price1=s1.nextDouble();
   
    totalammount1+=price1*quantity1;
    overallprice=totalammount1;
    System.out.println("overallprice"+overallprice);
    b1.add(new Billgenration(productName1,quantity1,price1,totalammount1));
    System.out.println("you want more item");
    choice =s1.next().charAt(0);
    s1.nextLine();
    }
    while(choice=='y'||choice=='Y' );
    Billgenration.display();
    for( Billgenration b:b1){
        b.display2();
    }
}
}