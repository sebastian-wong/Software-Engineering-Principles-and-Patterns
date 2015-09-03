package kwic_abstractdata;

import java.util.ArrayList;
import java.util.Collections;

public class AlphabeticSort {
	
	CircularShift circularShift;
	ArrayList<String> alphabetizedTitles;
	
	public AlphabeticSort(CircularShift shifter)
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
