class parameterizeddemo{
    int id;
    int rollno;
    String name;
    String address;

    parameterizeddemo(int id,int rollno, String name,String address)
    {
this.id=id;
this.rollno=rollno;
this.name=name;
this.address=address;
System.out.println(id+" " +rollno+" "+name+" "+address);
    }
    public static void main(String[] args) {
        parameterizeddemo p1=new parameterizeddemo(2, 234, "gaurav", "nagpur");
    
    }
}