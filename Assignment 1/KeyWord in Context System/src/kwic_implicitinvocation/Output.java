package kwic_implicitinvocation;
import java.util.ArrayList;

/** This module contains the final data to be printed out
 * 	@author Chew Yi Xiu
 */
public class Output {
ArrayList<String> shiftedTitles;

public Output()
{
	shiftedTitles = new ArrayList<String>();
}
public void insert(ArrayList<String> list)
{
	shiftedTitles = new ArrayList<String> (list);
}

public void delete(ArrayList<String> list)
{
	shiftedTitles = new ArrayList<String> (list);
}

public void print()
{
	for(String s: shiftedTitles){
				System.out.println(s); 
	}
}
}

