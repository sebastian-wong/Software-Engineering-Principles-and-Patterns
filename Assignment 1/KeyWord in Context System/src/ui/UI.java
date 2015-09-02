package ui;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;




//import kwic_implicitinvocation.MasterControl;
import kwic_abstractdata.MasterController;
import kwic_implicitinvocation.MasterControl;

public class UI{

	public static void main(String[] args)
	{
		System.out.println("Please enter architecture to be chosen:"); 
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine())
		{ 
			String architecture = scanner.nextLine();
			if (architecture.toLowerCase().equals("implicit invocation"))
			{
				startKwicImplicitInvocation();
				break;
			}
			else if (architecture.toLowerCase().equals("abstract data"))
			{
				try
				{
					startKwicAbstractData();
				}
				catch(FileNotFoundException e)
				{
					System.out.println("Input text files cannot be found.");
				}
				catch(IOException e)
				{
					System.out.println("Error in user inputs");
				}
				break;
				
			}
			else{
				System.out.println("Please enter architecture to be chosen:"); 
			}
		}
		scanner.close();
	}
	public static void startKwicAbstractData() throws IOException, FileNotFoundException
	{
		String inputTitles;
		String inputIgnoreWords;
		System.out.println("Please enter the name of the text file containing the list of titles. (E.g : titles.txt) ");
		Scanner scanner = new Scanner(System.in);	
		inputTitles = scanner.nextLine();
		System.out.println("Please enter the name of the text file containing the list of words to ignore. (E.g : ignore.txt)");
		inputIgnoreWords = scanner.nextLine();
		scanner.close();
		MasterController masterKwicAbstractData = new MasterController();
		masterKwicAbstractData.startKwic(inputTitles,inputIgnoreWords);
	}
	public static void startKwicImplicitInvocation()
	{
		MasterControl masterKwicImplicit = new MasterControl();
		System.out.println("Please enter the name of the text file containing the list of words to ignore. (E.g : ignore ignore.txt)");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			masterKwicImplicit.inputs(line);
			System.out.println("Please enter the choice of action (add/delete): ");
		}
	}
}
