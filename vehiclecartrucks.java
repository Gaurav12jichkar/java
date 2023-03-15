interface vehicles
{
    void vehicle();
}
interface cars
{
void cars();
}
interface trucks
{
void trucks();
}
class gaurav implements vehicles,cars,trucks
{
   public void vehicle()
    {
        System.out.println("Engine\nWheels\nhorns");
    }
   public void cars()
    {
        System.out.println("Engine \n wheels\nhorns\npetorl");
    }
   public void trucks()
    {
        System.out.println("Engine \n wheels\nhorns\ndiesel");  
    }
}
 


class gaurav1 extends gaurav{
   public void msg()
    {
        System.out.println("Hey alll msg printed");
    }
}
class vehiclecartrucks
{
    public static void main(String[] args) {
        
    
    gaurav1 g1=new gaurav1();
    g1.vehicle();
    g1.cars();
    g1.trucks();
    }
}