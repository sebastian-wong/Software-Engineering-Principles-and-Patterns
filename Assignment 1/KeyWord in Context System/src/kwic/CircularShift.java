package kwic;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.StringBuilder;

public class CircularShift {

	Storage storage;
	ArrayList<String> wordsToIgnore;
	ArrayList<String> shiftedTitles;

	public CircularShift(Storage data)
	{
		shiftedTitles = new ArrayList<String>();
		storage = data;
	}

	public void setup()
	{
		wordsToIgnore = storage.getStoredIgnoreWords();
	}

	public void shiftSentence()
	{
		// for every title in the list
		for (int i = 0; i < storage.getSizeOfStoredTitles(); i++)
		{
			String sentence = storage.getTitle(i);
			// splitting sentence into a list of words on whitespace
			ArrayList<String> words = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
			// for every word in a title
			for (int j=0; j < sentence.length(); j++)
			{
				// always check the first word of the sentence
				// is present in the ignore list
				if (!wordsToIgnore.contains(words.get(0).toLowerCase()))
				{
					StringBuilder shiftedSentence = new StringBuilder();
					// Reconstructing the split sentence
					for (String word : words)
					{
						shiftedSentence.append(word + " "); 
					}
					// remove the additional whitespace in the end
					shiftedTitles.add(shiftedSentence.toString().trim());
				}
				// circular shift
				String wordToBeShifted = words.get(0);
				words.remove(0);
				words.add(wordToBeShifted);
			}
		}
	}

}



