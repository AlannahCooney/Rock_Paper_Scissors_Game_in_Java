//Program to write Rock, Paper, Scissors as a game in which you play against the computer
//Author Alannah Cullinane Cooney
// 15th of October 2018

import java.util.Random;
import java.io.*;

public class RockPaperScissors{ 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		
		//Algorithm
		//1: Declare variables num1, num2, num3, outcome type int
		//2.Generate num1 and num2 using Random class 
		//3:Welcome to the game
		//4: Display what each number is 	
		//5: Ask user input
		//6: Compare user input to the cpu choice
		
		
		//1: Declare variables num1, num2, num3, outcome type int
		int rock = 1;
		int paper = 2;
		int scissors = 3;
		int cpuInput;
		int userInput;
		
		//2.Generate num1 and num2 using Random class 
				Random rnd = new Random();//create and instance of Random class
				cpuInput= 1+rnd.nextInt(3);// range 1-3
				
		//3:Welcome to the game
				System.out.println("Welcome to the Rock, Paper and Scissors Game");
				
		//4: Display what each number is 		
				 System.out.println("Rock =1, Paper =2, Scissors =3");
		
		//5: Ask for user input 
				System.out.println("Please enter a number");
				userInput = Integer.parseInt(br.readLine());
				
				System.out.print("Cpu Input:"+ cpuInput);
				
		//6: Compare user input to the cpu choice
				if(userInput ==cpuInput)
				{
					//7:Display the result 
				//If user enters the same Input as the user "Draw"
					System.out.println("Draw");
				}
				
			  
				//: Compare user Input to the cpu Input
				else if (userInput ==1 && cpuInput ==3)
				{
					// If user defeats cpu Input display "You Win" else display "You lose"
					System.out.println("Rock breaks Scissors" + "\nYou Win");
				}
				else if (userInput ==1 && cpuInput ==2)
				{
				System.out.println("Paper covers Rock" + "\nYou Lose");
				}
				else if(userInput ==2 && cpuInput ==1)
				{
				System.out.println("Paper covers rock" + "\nYou Win");
				}
				else if (userInput ==2 && cpuInput ==3)
				{
				System.out.println("Scissors cuts paper" + "\n You Lose");
				}
				//:Compare user Input to the cpu Input 
				else if(userInput ==3 && cpuInput ==2)
				{
					System.out.println("Scissors cuts paper" + "\nYou Win");
				}
				else if(userInput ==3 && cpuInput ==1)
				{
				 System.out.println("Rock breaks Scissors" + "\nYou Lose");
				}
				}

}

				