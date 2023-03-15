class testAccount {
    String name;
    int Accountno;
    int ammount;
    
    
   

    
    void data_insert(String n,int ac,int amt)
    {
        name=n;
        Accountno=ac;
        ammount=amt;

    }
    void deposite(int am1){
        ammount=ammount+am1;
        System.out.println(am1+"deposited amount");
    }
    void withdral(int am2){
        if(ammount<am2){
            System.out.println("insufficient balance");
        }
        else{
            ammount=ammount-am2;
            System.out.println(am2+"withdral ammount");
        }
    }
    void display()
    {
        System.out.println("name="   +name+     "accountno"  +Accountno+  "balance"  +ammount);
    }



}

class Account {
   
    public static void main(String[] args) {
        testAccount a1=new testAccount();
        testAccount b1=new testAccount();
        testAccount c1=new testAccount();
    Account d1=new Account();
        a1.data_insert( "radheshyam",112233, 5000);
        
        a1.deposite(9000);
        a1.withdral(4000);
        a1.display();
        b1.data_insert( "gaurav",112233, 6000);
        b1.deposite(3000);
        b1.withdral(2000);
        b1.display();
    }
   
}
