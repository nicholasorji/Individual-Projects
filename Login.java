package New;

import java.util.Scanner;

public class Login {

static String user;
static String pass;
static String loginuser;
static String loginpass;
static boolean login = true;
static boolean check = false;
static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {
		// TODO Auto-generated method stub


	System.out.print("Enter you username:");
	String loginuser = scan.nextLine();
	System.out.print("Enter you password:");
	String loginpass = scan.nextLine();
	
	
	System.out.print("Thank you for logging in");
	while(login) {
		
		check = false;
		System.out.println(" ------------------ \n" + "Username: \n");
        user = scan.nextLine();
        System.out.println("Password: \n");
        pass = scan.nextLine();
		
        if(loginuser.equals(user) && (loginpass.equals(pass))) {
        
        	check = true;
        login = false;
        System.out.print("Success");
        }
        else {
        	
        	check = false;
        	System.out.print("Incorrect. Please try again");
        	
        }
	}
	
}

}
