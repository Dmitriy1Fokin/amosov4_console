package amosov4_console;

import java.util.ArrayList;

public class Task4 
{
	private static ArrayList<String> arrOfSolutions;
	private static Criterion listOfCriterion;
	
	public static void main(String[] args)
	{
		arrOfSolutions = new ArrayList<>();
		arrOfSolutions.add("Kia rio");
		arrOfSolutions.add("Renault Logan");
		arrOfSolutions.add("Hyundai Solaris");
		showSolutions();
		
		listOfCriterion = new Criterion();
		listOfCriterion.add("qwe", (float)0.2);
		listOfCriterion.add("Клиренс", (float)0.1);
		listOfCriterion.add("Стоимость обслуживания", (float)0.15);
		listOfCriterion.add("Надежность", (float)0.15);
		listOfCriterion.add("Безопасность", (float)0.2);
		listOfCriterion.add("Комплектация", (float)0.1);
		listOfCriterion.add("Ликвидность", (float)0.1);
		
		listOfCriterion.show();
	}
	
	private static void showSolutions()
	{
		int i = 0;
		for (String str : arrOfSolutions) 
		{
			System.out.println(++i + ".\t" + str);
		}
	}
}
