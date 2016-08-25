import java.util.Scanner;
public class NumberGuessingGame
	{
public static void main(String[] args)
	{
		Scanner userInput=new Scanner(System.in);
		System.out.println("What's your name?");
		String name=userInput.nextLine();
		System.out.println("Hello, "+name);
		boolean stillGuessing=true;
		int counter=0;
		while(stillGuessing){
		System.out.println("Pick a number between 1 and 5");
		int userGuess=userInput.nextInt();
		int secretNumber=(int)(Math.random()*3)+1;
		if(userGuess<secretNumber){
			System.out.println("You're too low");
			counter=counter+1;
		}
		else if(userGuess>secretNumber){
			System.out.println("You're too high");
			counter=counter+1;
		}
		else{
			stillGuessing=false;
			System.out.println("Perfect!");
			counter=counter+1;
			if(counter==1){
				System.out.println("You got it in 1 attempt!");
			}
			else{
				System.out.println("You got it in "+counter+" attempts");
			}
		}
		}
	}
	}