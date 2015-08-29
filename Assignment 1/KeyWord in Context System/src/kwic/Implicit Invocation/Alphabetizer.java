package implicitInvocation;
import java.util.ArrayList;
import java.util.Collections;

public class Alphabetizer {
ArrayList<String> sortedList;
Output output;

public Alphabetizer()
{
	sortedList = new ArrayList<String>();
	output = new Output();
}
//Insertion of a title
public void insert(String title)
{
	sortedList.add(title);
	Collections.sort(sortedList);
	output.insert(sortedList);
}

public void delete(String title)
{
	sortedList.remove(title);
	Collections.sort(sortedList);
	output.delete(sortedList);
}

public void print()
{
	output.print();
}
}
