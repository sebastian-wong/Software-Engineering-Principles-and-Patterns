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
		System.out.println("Please enter architecture to be chosen : \nPress 1 for Implicit Invocation"
				+ "\nPress 2 for Abstract Data"); 
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine())
		{ 
			String architecture = scanner.nextLine();
			//Implicit Invocation
			if (architecture.equals("1"))
			{
				try
				{
				startKwicImplicitInvocation();
				}
				catch(FileNotFoundException e)
				{
					System.out.println("Input text files cannot be found.");
					continue;
				}
				catch(IOException e)
				{
					System.out.println("Error in user inputs");
					continue;
				}
				
				break;
			}
			//Abstract Data
			else if (architecture.equals("2"))
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
				System.out.println("Please enter architecture to be chosen : \nPress 1 for Implicit Invocation"
						+ "\nPress 2 for Abstract Data"); 
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
	public static void startKwicImplicitInvocation() throws IOException, FileNotFoundException
	{
		MasterControl masterKwicImplicit = new MasterControl();
		System.out.println("Please enter the name of the text file containing the list of words to ignore (E.g : ignore.txt)");
		Scanner scanner = new Scanner(System.in);
		masterKwicImplicit.insertIgnoreList(scanner.nextLine());
		System.out.println("------------------------COMMANDS---------------------------");
		System.out.println("add 'title' : adds a single title");
		System.out.println("add 'filename' : adds a list of titles from a file");
		System.out.println("delete 'shifted title' : deletes a title from list if its a permutated title");
		System.out.println("delete 'original title' : deletes all permutations of original titles");
		System.out.println("\nPlease enter the choice of action add/delete(case sensitive): ");
		while(scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			masterKwicImplicit.inputs(line);
			System.out.println("------------------------COMMANDS---------------------------");
			System.out.println("add 'title' : adds a single title");
			System.out.println("add 'filename' : adds a list of titles from a file");
			System.out.println("delete 'shifted title' : deletes a title from list if its a permutated title");
			System.out.println("delete 'original title' : deletes all permutations of original titles");
			System.out.println("\nPlease enter the choice of action add/delete(case sensitive): ");
		}
		
		scanner.close();
	}
	
	public static void messageToUser(String msg)
	{
		System.out.println(msg);
	}
}
