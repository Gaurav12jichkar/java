import java.util.Scanner;
class Account2
{
    int accountnumber;
    String name;
    int amt;

    Scanner scan1=new Scanner (System.in);
    


    void datainsert()
    {

        System.out.println("enter name");
        name=scan1.nextLine();
        System.out.println("Enter Account no ");
        accountnumber=scan1.nextInt();
        
        System.out.println("enter ammount");
        amt=scan1.nextInt();
       
    }
  
    void deposite(){
        
        System.out.println("Enter ammount for deposite");
        int am=scan1.nextInt();
        amt=amt+am;

        System.out.println(am+" deposited amount");
    }
    void withdral(){
        int am;
        System.out.println("Enter ammount for Withdrawal");
        am=scan1.nextInt();
        if(amt<am){
            System.out.println("insufficient balance");
        }
        else{
            amt=amt-am;
            System.out.println(am+" withdral ammount");
        }
    }

    void display()
    {
        System.out.println("Name=" +name  + "  Acconut No= "+ accountnumber + "   Ammount is " + amt);
        
    }
}

public class TestAccount2 {
   
    public static void main(String[] args) 
    {
        
        Account2 a1=new Account2();
        Scanner scan=new Scanner (System.in);

        System.out.println("How many number ");
        int p=scan.nextInt();

for(int i=1; i<=p ;i++)
{

        
        a1.datainsert();
        a1.deposite();
        a1.withdral();
        a1.display();
}
    }
   
}

import java.util.Scanner;
class Account2{
    int accountnumber;
    String name;
    int amt;
    //int p,i;
    Scanner scan1=new Scanner (System.in);
    


    void datainsert()
    {

        System.out.println("enter name");
        name=scan1.nextLine();
        System.out.println("Enter Account no ");
        accountnumber=scan1.nextInt();
        
        System.out.println("enter ammount");
        amt=scan1.nextInt();
       
    }
  
    void deposite(){
        
        System.out.println("Enter ammount for deposite");
        int am=scan1.nextInt();
        amt=amt+am;

        System.out.println(am+" deposited amount");
    }
    void withdral(){
        int am;
        System.out.println("Enter ammount for Withdrawal");
        am=scan1.nextInt();
        if(amt<am){
            System.out.println("insufficient balance");
        }
        else{
            amt=amt-am;
            System.out.println(am+" withdral ammount");
        }
    }

    void display()
    {
        System.out.println("Name=" +name  + "  Acconut No= "+ accountnumber + "   Ammount is " + amt);
        
    }
}

public class TestAccount2 {
   
    public static void main(String[] args) 
    {
        
        Account2 a1=new Account2();
        Scanner scan=new Scanner (System.in);

        System.out.println("How many number ");
        int p=scan.nextInt();

for(int i=1; i<=p ;i++)
{

        
        a1.datainsert();
        a1.deposite();
        a1.withdral();
        a1.display();
}
    }
   
}


