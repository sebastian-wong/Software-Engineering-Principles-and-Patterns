package kwic_abstractdata;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class Input {

	ArrayList<String> listOfTitles;
	ArrayList<String> listOfIgnoredWords;

	// constructor
	public Input (String titleFileName, String ignoreFileName)
	{
		listOfTitles  = new ArrayList<String>();
		listOfIgnoredWords = new ArrayList<String>();
		readFile(titleFileName , listOfTitles);
		readFile(ignoreFileName , listOfIgnoredWords);
	}

	public void readFile(String filename, ArrayList<String> list)
	{
		try
		{
			File file = new File(filename);
			//set file path to bin
			FileReader fileReader = new FileReader("input/" + file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			// Repeat until all lines are read
			while ((line = bufferedReader.readLine()) != null)
			{
				list.add(line);
			}
			bufferedReader.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getListOfTitles()
	{
		return listOfTitles;
	}

	public ArrayList<String> getListOfIgnoredWords()
	{
		return listOfIgnoredWords;
	}

}
