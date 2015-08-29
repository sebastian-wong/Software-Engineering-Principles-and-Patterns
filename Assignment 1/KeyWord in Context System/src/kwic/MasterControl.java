import implicitInvocation.Input;

import java.util.*;

public class MasterControl {


public static void main(String[] args) {
	
	Input input = new Input();
	
	System.out.println("Please enter filename with list of words to ignore : ignore [filename]"); 
	Scanner scan = new Scanner(System.in);
		
	while (scan.hasNextLine())
	{ 
		input.readAction(scan.nextLine());
		System.out.println("Please enter your choice of action (add/delete/print):"); 
	}
	
	scan.close();
}

}
