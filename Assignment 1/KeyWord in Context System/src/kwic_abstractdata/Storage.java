package kwic_abstractdata;
import java.util.ArrayList;

/** The storage class contains the list of titles and ignore words.
 * It provides an interface for the circular shift module to access
 * and retrieve the required data.
 * @author Sebastian Wong Zhi Qian
 *
 */


public class Storage {

	ArrayList<String> storedTitles;
	ArrayList<String> storedIgnoreWords;
	Input input;

	public Storage(Input lines)
	{
		Input input = lines;
		storedTitles = new ArrayList<String>();
		storedIgnoreWords = new ArrayList<String>();
		storedTitles = input.getListOfTitles();
		storedIgnoreWords = input.getListOfIgnoredWords();
	}
	
	public int getSizeOfStoredTitles()
	{
		return storedTitles.size();
	}

	public int getSizeOfStoredIgnoreWords()
	{
		return storedIgnoreWords.size();
	}
	
	public String getTitle(int index)
	{
		return storedTitles.get(index);
	}
	
	public String getIgnoreWord(int index)
	{
		return storedIgnoreWords.get(index);	
	}
	
	public Boolean checkIfWordIsIgnored(String word)
	{
		if (storedIgnoreWords.contains(word))
		{
			return true;
		}
		else
			return false;
	}

	public ArrayList<String> getStoredTitles()
	{
		return storedTitles;
	}

	public ArrayList<String> getStoredIgnoreWords()
	{
		return storedIgnoreWords;
	}
}

