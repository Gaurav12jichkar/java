import java.util.Scanner;
class info{
    public  void data()
    {
        System.out.println("enter student name");
        Scanner s1 = new Scanner(System.in);
        String name = s1.nextLine();
        System.out.println(name);
        System.out.println("enter student mother name");
        String mname = s1.nextLine();
        System.out.println(mname);
        System.out.println("enter college name ");
        String college = s1.nextLine();
        System.out.println(college);
        System.out.println("enter exam category");
        String exam = s1.nextLine();
        System.out.println(exam);
        System.out.println("enter roll no");
        int rollno=s1.nextInt();
        System.out.println(rollno);
        System.out.println("enter enrollment no");
        int enno=s1.nextInt();
        System.out.println(enno);
       
        System.out.println();
        System.out.println("enter the subject marks ");
        System.out.println("pactical marks should be less than 30 or equal to||subject marks should be less than 70 or equal");
        System.out.println("enter marks of computer graphics");
        System.out.println("pratical marks of computer graphics");
        int pcg=s1.nextInt(); 
       
        System.out.println("subject marks of computer graphics");
        int scg=s1.nextInt();
        System.out.println("enter marks of data structure");
        System.out.println("pratical marks of data structure");
        int pds=s1.nextInt(); 
        System.out.println("subject marks of data structure");
        int sds=s1.nextInt();
        System.out.println("enter marks of c++");
        System.out.println("pratical marks of c++");
        int pc=s1.nextInt(); 
        System.out.println("subject marks of c++");
        int sc=s1.nextInt();
        System.out.println("enter marks of html");
        System.out.println("pratical marks of html");
        int pht=s1.nextInt(); 
        System.out.println("subject marks of html");
        int sht=s1.nextInt();
        System.out.println("enter marks of css");
        System.out.println("pratical marks of css");
        int pcs=s1.nextInt(); 
        System.out.println("subject marks of css");
        int scs=s1.nextInt();
        System.out.println("enter marks of java");
        System.out.println("pratical marks of java");
        int pja=s1.nextInt(); 
        System.out.println("subject marks of java");
        int sja=s1.nextInt();
        int tcg=pcg+scg;
        int tds=pds+sds;
        int tc=pc+sc;
        int tht=pht+sht;
        int tcs=pcs+scs;
        int tja=pja+sja;
    

    
    
    
        System.out.println("                                             RASHTSANT  TUKDOJI MAHARAJ UNVERSITY NAGPUR");
        System.out.println();
        System.out.println();
        System.out.println("                                                      statment of marks");
        System.out.println("                                                (faculty of science & tenology)");
        System.out.println("                                                 Bachlor of computer application");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("student name:-");
        System.out.println(name);
        System.out.println("mother name:-"+ mname +       "enrolment no:-"+ enno);
        System.out.println("college name:-"+ college+      "roll no"+rollno);
        System.out.println("Exam category:-"+ exam);
        System.out.println();
        
        
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|      |                       |                                                               |                                                                         |");
        System.out.println("| sr.  | SUBJECT               |                        MARKS SCHEME                           |                                 MARKS AWARDED                           |");
        System.out.println("| no.  |                       | -----max----|------max----|    max       |     min     |  TU     |    IA    |  PU       |    PI        |  total marsk                   |");
        System.out.println("|      |                       | TU    |IA   |  PU  | PI   |   marks      |     marks   |                                               |                                |");
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|      |                       |                            |                                                                                                            |");
        System.out.println(  "|  1.  | computer graphics     | 70    |30   |  --  | --   |    100       |   35        | " +scg+ "| "+pcg +"|  --     |   --        | "          +tcg+                  "|"); 
        System.out.println(  "|  2.  | data structure        | 70    |30   |  --  | --   |    100       |   35        | " +sds+ "| "+pds +"|  --     |   --        | "          +tds+                  "|"); 
        System.out.println(  "|  3.  | c++                   | 70    |30   |  --  | --   |    100       |   35        | " +sc+ " | "+pc +" |  --     |   --        | "          +tc+                   "|"); 
        System.out.println(  "|  4.  | Html                  | 70    |30   |  --  | --   |    100       |   35        | " +sht+ "| "+pht +"|  --     |   --        | "          +tht +                 "|"); 
        System.out.println(  "|  5.  | css                   | 70    |30   |  --  | --   |    100       |   35        | " +scs+ "| "+pcs +"|  --     |   --        | "          +tcs+                  "|"); 
        System.out.println(  "|  6.  | java                  | 70    |30   |  --  | --   |    100       |   35        | " +sja+ "| "+pja +"|  --     |   --        | "          +tja +                 "|"); 
        System.out.println("________________________________________________________________________________________________________________________________________________________________________");
        
         
      
        



    }
}

 public class Markssheet  {

    public static void main(String[] args) {
       info i=new info();
       i.data();
       
       
       


    }
}
 