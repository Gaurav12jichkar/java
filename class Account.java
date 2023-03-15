class TestAccount {
   
    public static void main(String[] args) {
        Account a1=new Account();
        a1.datainsert(112233, "radheshyam", 5000);
        
        a1.deposite(9000);
        a1.withdral(4000);
        a1.display();
    }
   
}


class Account{
    int accountnumber;
    String name;
    int amt;
   
    void datainsert(int a,String n,int am){
        accountnumber=a;
        name=n;
        amt=am;
       
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
