/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: Decison structres to help user to fix wifi problems 
 * Due: 09/12/2022
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: __Diego Lopez________
*/

import java.util.Scanner;
public class Wifi {

	public static void main(String[] args) {
		
		final String name = "Diego Lopez"; // constant 
		final String IA = "Invalid Answer";
		Scanner stdin = new Scanner(System.in); // make scanner 
		System.out.println("If you have a problem with "
				+ "internet connectivity this WiFi Diagnosis might work. ");
		System.out.println("Reboot the computer and try to connect.");
		System.out.println("Did that fix the problem ? (Yes or No)"); 
		String x1 = stdin.nextLine(); // readline
		if(x1.equals("No")|| x1.equals("no")){
			System.out.println("Reboot the router and try to connect");
			System.out.println("Did that fix the problem ? (Yes or No)");
			String x2 = stdin.nextLine(); // readline
			if(x2.equals("No")|| x2.equals("no"))
			{
				System.out.println("Make sure the cables connecting the router"
						+ "are firmly plugged in and power is getting to the router.");
				System.out.println("Did that fix the problem ? (Yes or No)");
				String x3 = stdin.nextLine(); // readline
				if(x3.equals("No")|| x3.equals("no"))
				{
					System.out.println("Move the computer closer to the "
							+ "router and try to conect");
					System.out.println("Did that fix the problem ? (Yes or No)");
					String x4 = stdin.nextLine(); // readline
					if(x4.equals("No")|| x4.equals("no"))
					{
						System.out.println("Contact your ISP"); // final option
						System.out.println("Done");
						System.out.println(name);
						
					}
					else if(x4.equals("Yes") || x4.equals("yes")) // options 
					{
						System.out.println("Done");
						System.out.println(name);
					}
					else {
						System.out.println(IA);
						System.out.println(name);
					}
					
				}
				else if(x3.equals("Yes")|| x3.equals("yes")) // option if the third option is a yes
				{
					System.out.println("Done");
					System.out.println(name);
				}
				else {
					System.out.println(IA);
					System.out.println(name);
				}
			}
			else if(x2.equals("Yes")|| x2.equals("yes"))// option if the second question is a yes
			{
				System.out.println("Done");
				System.out.println(name);
			}
			else {
				System.out.println(IA);
				System.out.println(name);
			}
			
		}
		else if (x1.equals("Yes")|| x1.equals("yes")) // option if the first question is a yes
		{
			System.out.println("Done");
			System.out.println(name);
		}
		else 
		{
			System.out.println(IA);
			System.out.println(name);
		}
		
		
		

	}

}
