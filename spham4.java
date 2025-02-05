// Steven Pham
import java.util.Scanner;
public class spham4
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which of the following do you like best?");
		System.out.println("1. Apples\n2. Trees\n3. Programming\n 4. Coffee");
		System.out.println("Enter an integer to choose, for example, '1'");
		int choice;
		while (true)
		{
			choice = keyboard.nextInt();
			if (choice > 0 && choice < 5) break;
			System.out.println("Incorrect! pick 1-4 only.");
		}
		switch (choice)
		{
			case 1:	System.out.println("Apples are very juicy");
			break;
			case 2: System.out.println("Trees provide us a lot of oxygen!");
			break;
			case 3: System.out.println("This is a program so that figures");
			break;
			case 4: System.out.println("I drink coffee everyday I go to school in the morning");
			break;
		}
	}
}
