package kwic;
import java.util.ArrayList;

public class CircularShift {

	Storage storage;
	ArrayList<String> titles;
	ArrayList<String> wordsToIgnore;
	ArrayList<String> shiftedTitles;
	
	public CircularShift(Storage words)
	{
		storage = words;
	}
	
	public void setup()
	{
		titles = storage.getStoredTitles();
		wordsToIgnore = storage.getStoredIgnoreWords();
	}
	
	public void Shift()
	{
		for (int i = 0; i < titles.size(); i++)
		{
			String sentence = titles.get(i);
			for (int j=0; j < sentence.length(); j++)
			{
				
			}
		}
	}
	
	
	//public void insert(String s)
	//{
		//ArrayList<String> sentence = new ArrayList<String>(Arrays.asList(s.split(" ")));
		//for (int i =0; i < sentence.size() ; i++)
		//{
			//if (!ignoreList.contains(sentence.get(0))){
		//		alphabetize.insert(sentence);
			//}
			//String temp = sentence.get(0);
			//removes current first element
			//sentence.remove(0);
			//adds removed element to the back
			//sentence.add(temp);		
		//}
	}
	
	
	
