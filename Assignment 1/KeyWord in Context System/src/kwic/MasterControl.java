package kwic;

import java.util.Scanner;

public class MasterControl{
	
	public static void main(String args[]) 
	{
		String inputTitles;
		String inputIgnoreWords;
		
		System.out.println("Please enter the name of the text file containing the list of titles. (E.g : titles.txt) ");
		Scanner scanner = new Scanner(System.in);	
		inputTitles = scanner.nextLine();
		System.out.println("Please enter the name of the text file containing the list of words to ignore. (E.g : ignore.txt)");
		inputIgnoreWords = scanner.nextLine();
		scanner.close();
		
		Input input = new Input(inputTitles,inputIgnoreWords);
		Storage storage = new Storage(input);
		CircularShift circularShift = new CircularShift(storage);
		circularShift.setup();
		circularShift.shiftSentence();
		AlphabeticShift alphabeticShift = new AlphabeticShift(circularShift);
		alphabeticShift.alphabetizeInAscendingOrder();
		Output output = new Output(alphabeticShift);
		output.printResults();
	}	

}
