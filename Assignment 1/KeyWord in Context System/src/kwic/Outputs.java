package kwic;

public class Outputs {
	AlphabeticShift finalOutput;
	
	public Outputs(AlphabeticShift alphabetized)
	{
		finalOutput = alphabetized;
	}
	
	public void printResults()
	{
		for (String output: finalOutput.getAlphabetizedTitles())
		{
			System.out.println(output);
		}	
	}
}
