public class methodoveloding {
      static void method2(int id,double marks)
      {
        System.out.println("num"+id+"marks"+marks);
      }
      static void method2(int id,String name)
      {
        System.out.println("num"+id+"name"+name);
      }

      public static void main(String[] args) {
        method2(234, 45);
        method2(45, "gaurav");
      }
}
