package New;

import java.util.*;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
Scanner scan = new Scanner(System.in);
System.out.print("Enter a name: ");
String n = scan.nextLine();
System.out.print("Hi " + n);

Random gen = new Random();
String[] phrases = {"\n" + 
		" __  __         \n" + 
		"/\\ \\/\\ \\  __    \n" + 
		"\\ \\ \\_\\ \\/\\_\\   \n" + 
		" \\ \\  _  \\/\\ \\  \n" + 
		"  \\ \\ \\ \\ \\ \\ \\ \n" + 
		"   \\ \\_\\ \\_\\ \\_\\\n" + 
		"    \\/_/\\/_/\\/_/\n" + 
		"                \n" + 
		"                \n" + 
		"", "\n" + 
				" __  __          ___    ___             \n" + 
				"/\\ \\/\\ \\        /\\_ \\  /\\_ \\            \n" + 
				"\\ \\ \\_\\ \\     __\\//\\ \\ \\//\\ \\     ___   \n" + 
				" \\ \\  _  \\  /'__`\\\\ \\ \\  \\ \\ \\   / __`\\ \n" + 
				"  \\ \\ \\ \\ \\/\\  __/ \\_\\ \\_ \\_\\ \\_/\\ \\L\\ \\\n" + 
				"   \\ \\_\\ \\_\\ \\____\\/\\____\\/\\____\\ \\____/\n" + 
				"    \\/_/\\/_/\\/____/\\/____/\\/____/\\/___/ \n" + 
				"                                        \n" + 
				"                                        \n" + 
				" "};
System.out.print(phrases[gen.nextInt(2)]);


	}

}
