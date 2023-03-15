public class Exceptionhandling
 {
//     public static void main(String[] args) {
//         try {
//             int a=40/0;
//         } catch (Exception e) {
//         System.out.println("finally block");
//         }
//     }
// }
// {
//     public static void main(String[] args) {
//         try {
//             String abc=null;
//             System.out.println(abc.length());
//         } catch (Exception e) {
//         System.out.println("finding lenghth not possible");
//         }
//     }
// }
public static void main(String[] args) {
    try {
        int a[]=new int [5];
        a[10]=50;
    } 
    catch(ArrayIndexOutOfBoundsException e)
    {
    System.out.println(" array out of box exception");
    }
    
}
// public static void main(String[] args) {
//     try {
//         String xyz="ABC";
//         int i=Integer.parseInt(xyz);
//     } catch (Exception e) {
//     System.out.println("no. formate  exception");
//     }
// }
// public static void main(String[] args) {
//     int i=20;
//     int j=0;
//     int temp;
//     try {
//         temp=i/j;
//     } catch (Exception e) {
//         System.out.println(e);
//         System.out.println("you can not divide by zero");
//         System.out.println(i/(j+4));
//     }
// }
//multiple catch block
// public static void main(String[] args) {
    
//     try {
//         int a[]=new int [5];
//         a[5]=10/0;
//     } 
   

    // catch(ArrayIndexOutOfBoundsException e)
    // {
    // System.out.println(" nnnnexception");
    // }
    
//      catch(ArithmeticException e)
//     {
//        System.out.println("Arithmatic exceptin");
//     }
//     catch (Exception e) 
//     {
//         System.out.println("exception");
        
//     }
//     System.out.println("other ");
// }
 }

