package kwic_implicitinvocation;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MasterControl {
Input input;
	
public MasterControl(){
	input = new Input();
}

public void inputs(String line) throws FileNotFoundException, IOException{ 
	input.readAction(line);
}

}
