package kwic;

public class Output {
	AlphabeticShift finalOutput;
	
	public Output(AlphabeticShift alphabetized)
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
