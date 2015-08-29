package kwic;

import java.util.ArrayList;
import java.util.Collections;

public class AlphabeticShift {
	
	CircularShift circularShift;
	ArrayList<String> alphabetizedTitles;
	
	public AlphabeticShift(CircularShift shifter)
	{
		alphabetizedTitles = new ArrayList<String>();
		circularShift = shifter;
	}
	
	public void alphabetizeInAscendingOrder()
	{
		alphabetizedTitles = circularShift.getCircularShiftedTitles();
		Collections.sort(alphabetizedTitles);
	}
	
	public ArrayList<String> getAlphabetizedTitles()
	{
		return alphabetizedTitles;
	}
	
}
