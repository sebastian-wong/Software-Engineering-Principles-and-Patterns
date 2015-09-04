package kwic_abstractdata;

/** This module accesses the alphabetic sort module
 * to retrieve data to be printed out to the user
 * @author Sebastian Wong Zhi Qian
 *
 */

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
