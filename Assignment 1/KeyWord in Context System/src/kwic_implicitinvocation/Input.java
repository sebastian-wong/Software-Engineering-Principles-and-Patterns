package kwic_implicitinvocation;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class Input {
ArrayList<String> ignoreList;
ArrayList<String> inputTitles;
Shift shift;

public Input()
{
	inputTitles = new ArrayList<String>();
	ignoreList = new ArrayList<String>();
	shift = new Shift();
}
public void insert(String s)
{
	inputTitles.add(s);
	shift.insert(s);
}

public void delete(String s)
{
	inputTitles.remove(s);
	shift.delete(s);
}

public void print()
{
	shift.print();
}

public void readFile(String filename)
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
			insert(line);
		}
		bufferedReader.close();
	}
	catch (IOException e)
	{
		System.out.println("Invalid file name"); 
	}
}

public void insertIgnoreList(String filename)
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
			//change ignore words to lower case
			ignoreList.add(line.toLowerCase());
		}
		bufferedReader.close();
		shift.insertIgnoreList(ignoreList);
	}
	catch (IOException e)
	{
		System.out.println("Invalid file name"); 
	}
	
	
}

//parses commands to insert, delete or add from file
public void readAction(String s)
{
	String firstWord = null;
	if (s.contains(" "))
	{
		firstWord = s.substring(0, s.indexOf(" "));
		//insert title
		if (firstWord.toLowerCase().equals("add") || firstWord.toLowerCase().equals("a"))
		{	
			//add from text file
			if (s.substring(s.length()-1-3,s.length()).equals(".txt"))
			{
				String filename = s.substring(s.indexOf(" ")+1);
				readFile(filename);
				print();
			}
			//add line by line
			else
			{
				String title = s.substring(s.indexOf(" ")+1);
				insert(title);
				print();
			}
		}
		//delete title
		if (firstWord.toLowerCase().equals("delete") || firstWord.toLowerCase().equals("d"))
		{
			String title = s.substring(s.indexOf(" ")+1);
			delete(title);
			print();
		}
		//ignore list
		if (firstWord.toLowerCase().equals("ignore") || firstWord.toLowerCase().equals("i"))
		{
			String filename = s.substring(s.indexOf(" ")+1);
			insertIgnoreList(filename);
		}

	}
	//read from file
	else
	{
		System.out.println("Invalid command"); 
	}
}
}


