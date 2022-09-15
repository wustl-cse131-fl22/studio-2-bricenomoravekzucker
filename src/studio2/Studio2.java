package studio2;

import java.util.Scanner;

public class Studio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much would you like to start with?");
		int startAmount = scanner.nextInt();
		System.out.println("What would you like to set your odds to?");
		double odds = scanner.nextDouble();
		System.out.print("What would you like to set your win limit to?");
		int winLimit = scanner.nextInt();
		int i = 0;
		while ((startAmount > 0) && (startAmount <= winLimit))
		{
			if (Math.random()<= odds) 
			{
				startAmount = startAmount + 1;
				System.out.println("Round " + i + " you won!" + " Current Balance: " + startAmount);
			}
			else 
			{
				startAmount = startAmount - 1;
				System.out.println("Round " + i + " you lost!" + " Current Balance: " + startAmount);
			}
			i++;
		}

		if (startAmount <= 0)
		{
			System.out.println("Ruin!");
		} 
		else
		{
			System.out.println("Win!");
		}
		//hello


	}

}



