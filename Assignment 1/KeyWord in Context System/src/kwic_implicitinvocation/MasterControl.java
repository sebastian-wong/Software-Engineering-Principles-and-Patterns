package kwic_implicitinvocation;

public class MasterControl {
Input input;
	
public MasterControl(){
	input = new Input();
}

public void inputs(String line){ 
	input.readAction(line);
}

}
