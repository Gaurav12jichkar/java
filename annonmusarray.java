 public class annonmusarray
{
   static void print(int array1[])
    {
        for (int i=0;i<array1.length;i++)
        {
            System.out.println(array1[i]);
        }
    }
    public static void main(String[] args) {
        print(new int []{10,20,30,40});
    }
}