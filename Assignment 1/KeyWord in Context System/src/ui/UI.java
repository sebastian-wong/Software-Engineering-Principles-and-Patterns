package ui;
import java.util.Scanner;

//import kwic_implicitinvocation.MasterControl;
import kwic_abstractdata.MasterController;

public class UI{

	public static void main(String[] args) {
		System.out.println("Please enter architecture to be chosen:"); 
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine())
		{ 
			String architecture = scanner.nextLine();
			if (architecture.equals("Implicit Invocation")){
				startKwicImplicitInvocation();
				break;
			}
			else if (architecture.equals("Abstract Data")){
				startKwicAbstractData();
				break;
			}
			else{
				System.out.println("Please enter architecture to be chosen:"); 
			}
		}
		scanner.close();
	}
	public static void startKwicAbstractData()
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

	}
}
