package kwic_abstractdata;

public class MasterController{
	
	// default constructor
	public MasterController()
	{
		
	}
	
	public void startKwic(String titlesFileName, String ignoreFileName) 
	{
	    Input input = new Input(titlesFileName,ignoreFileName);
		Storage storage = new Storage(input);
		CircularShift circularShift = new CircularShift(storage);
		circularShift.setup();
		circularShift.shiftSentence();
		AlphabeticShift alphabeticShift = new AlphabeticShift(circularShift);
		alphabeticShift.alphabetizeInAscendingOrder();
		Outputs output = new Outputs(alphabeticShift);
		output.printResults();
	}	

}
