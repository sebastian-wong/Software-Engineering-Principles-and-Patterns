package kwic;
import java.util.ArrayList;

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

	public ArrayList<String> getStoredTitles()
	{
		return storedTitles;
	}

	public ArrayList<String> getStoredIgnoreWords()
	{
		return storedIgnoreWords;
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

}

