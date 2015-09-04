package kwic_implicitinvocation;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class Input {
ArrayList<String> ignoreList;
Shift shift;

public Input()
{
	ignoreList = new ArrayList<String>();
	shift = new Shift();
}
public void insert(String s)
{
	shift.insert(s);
}

public void delete(String s)
{
	shift.delete(s);
}

public void print()
{
	shift.print();
}

public void readFile(String filename) throws FileNotFoundException, IOException
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

public void insertIgnoreList(String filename) throws FileNotFoundException, IOException
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

//parses commands to insert, delete or add from file
public void readAction(String s) throws FileNotFoundException, IOException
{
	String firstWord = null;
	if (s.contains(" "))
	{
		firstWord = s.substring(0, s.indexOf(" "));
		//insert title
		if (firstWord.toLowerCase().equals("add"))
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
		if (firstWord.toLowerCase().equals("delete"))
		{
			String title = s.substring(s.indexOf(" ")+1);
			delete(title);
			print();
		}

	}
	//read from file
	else
	{
		IOException e = new IOException();
		throw e;
	}
}
}


