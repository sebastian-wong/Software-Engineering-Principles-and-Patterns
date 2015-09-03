package kwic_abstractdata;


public class Outputs {
	AlphabeticSort finalOutput;
	
	public Outputs(AlphabeticSort alphabetized)
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
