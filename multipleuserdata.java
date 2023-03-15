public class Account {
    String name;
    int Accountno;
    int ammount;
    
    
   

    
    void data_insert(string n,int ac,int amt)
    {
        name=n;
        Accountno=ac;
        ammount=amt;

    }
    void deposite(int am1){
        amt=amt+am1;
        System.out.println(am1+"deposited amount");
    }
    void withdral(int am2){
        if(amt<am2){
            System.out.println("insufficient balance");
        }
        else{
            amt=amt-am2;
            System.out.println(am2+"withdral ammount");
        }
    }
    void display()
    {
        System.out.println("name="   +name+     "accountno"  +accountnumber+  "balance"  +amt);
    }



}

class TestAccount {
   
    public static void main(String[] args) {
        Account a1=new Account();
        Account b1=new Account();
        Account c1=new Account();
    Account d1=new Account();
        a1.datainsert(112233, "radheshyam", 5000);
        
        a1.deposite(9000);
        a1.withdral(4000);
        a1.display();
        b1.datainsert(111111, "gaurav", 6000);
        b1.deposite(3000);
        b1.withdral(2000);
        b1.display();
    }
   
}
