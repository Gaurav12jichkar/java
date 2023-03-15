import java.util.*;

class log_reg {
  static Scanner s1 = new Scanner(System.in);

  public void register() {
    System.out.println("enter your name");
    String name = s1.nextLine();
    System.out.println("enter user name");
    String uname = s1.nextLine();
    System.out.println("enter password");
    int pass = s1.nextInt();
    System.out.println("enter address");
    String add = s1.nextLine();
    System.out.println("enter photoid no");
    int id = s1.nextInt();
    System.out.println("congratulation ! your registration is succesful");

  }

  String nuname = s1.nextLine();
  int npass = s1.nextInt();

  // public void login() {
  //   System.out.println("enter user name and pass word");

  //   if ((nuname == uname) && (pass == npass)) {
  //     System.out.println("login succesfull");
  //   } else {
  //     System.out.println("please enter correct userid and password ");

  //   }

  // }
}

public class builder {
  public static void main(String[] args) {

    log_reg l1 = new log_reg();

    System.out.println("WELCOME TO HOTEL SUNRISE");
    System.out.println("select the one option");
    System.out.println("1.admin");
    System.out.println("2.user");
    System.out.println("1.broker");
    Scanner s2 = new Scanner(System.in);
    int option = s2.nextInt();
    switch (option) {
      case 1: {
        System.out.println("Admin");
        l1.register();
        // l1.login();

        break;
      }
      case 2: {
        System.out.println("user");
        l1.register();
        // l1.login();
        break;
      }
      case 3: {
        System.out.println("broker");
        l1.register();
        // l1.login();
        break;
      }
      default: {
        System.out.println("you eneter wrong choice");
        break;
      }
    }
  }

}
