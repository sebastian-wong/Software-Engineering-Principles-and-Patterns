package kwic_implicitinvocation;

import java.io.FileNotFoundException;
import java.io.IOException;

/** This module passes the user input to Input module 
 *	@author Chew Yi Xiu
 */

public class MasterControl {
Input input;
	
public MasterControl(){
	input = new Input();
}

public void inputs(String line) throws FileNotFoundException, IOException{ 
	input.readAction(line);
}

public void insertIgnoreList(String line) throws FileNotFoundException, IOException{ 
	input.insertIgnoreList(line);
}
}
