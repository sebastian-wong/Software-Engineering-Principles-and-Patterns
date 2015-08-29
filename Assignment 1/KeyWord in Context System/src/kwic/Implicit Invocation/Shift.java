package implicitInvocation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Shift {
Alphabetizer alphabetize;
ArrayList<String> ignoreList;

//maps original title to all shifted titles
HashMap<String,String> mappedTitle;

public Shift()
{
	alphabetize = new Alphabetizer();
	mappedTitle = new HashMap<String,String>();
	ignoreList = new ArrayList<String>(); 
}
//Insert ignore list
public void insertIgnoreList(ArrayList<String> list)
{		
	ignoreList = new ArrayList<String>(list);
}
//Insertion of a title
public void insert(String originalTitle)
{	
	if (ignoreList.isEmpty())
	{
		System.out.println("Ignore list is empty!"); 
		return;
	}
	
	else
	{
		//List of words delimited by whitespace
		ArrayList<String> words = new ArrayList<String>(Arrays.asList(originalTitle.split(" ")));
		for (int i =0; i < words.size() ; i++)
		{		
				//check if first word of list is not a ignore word
				if (!ignoreList.contains(words.get(0).toLowerCase()))
				{
					StringBuilder shiftedTitle = new StringBuilder();
					for (String word: words)
					{
						shiftedTitle.append(word + " ");
					}
					
					//remove last whitespace
					String shifted = shiftedTitle.toString().trim();
					//call insert in alphabetize
					alphabetize.insert(shifted);
					//insert original title and shifted title in a map
					mappedTitle.put(shifted, originalTitle);
				}
			
				else
				{
					//word is a ignore word change to lower case
					words.set(0, words.get(0).toLowerCase());
				}
					
				String temp = words.get(0);
				//removes current first element
				words.remove(0);
				//adds removed element to the back
				words.add(temp);		
			}
	}
}


public void delete(String title)
{
	for(Iterator<HashMap.Entry<String, String>> it = mappedTitle.entrySet().iterator(); it.hasNext();)
	{
		HashMap.Entry<String, String> entry = it.next();
		//deletes shifted titles that are mapped to original titles 
		if (entry.getValue().equals(title))
		{
			alphabetize.delete(entry.getKey());
			it.remove();
		}
		//deletes shifted titles
		else if (entry.getKey().equals(title))
		{
			alphabetize.delete(entry.getKey());
			it.remove();
		}
		
	}
}

public void print()
{
	alphabetize.print();
}

}

