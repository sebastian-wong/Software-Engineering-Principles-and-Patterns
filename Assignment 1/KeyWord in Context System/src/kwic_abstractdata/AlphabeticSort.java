package kwic_abstractdata;

import java.util.ArrayList;
import java.util.Collections;

/** This module accesses the circular shift module using
 * the provided interface to create a list of sorted titles.
 * This module also provides an interface for the output module
 * to retrieve relevant data.
 * @author Sebastian Wong Zhi Qian
 *
 */
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
