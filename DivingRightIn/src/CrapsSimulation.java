import java.util.Scanner;
public class CrapsSimulation
	{
	public static void main(String[] args)
		{
		Scanner input=new Scanner(System.in);
		boolean again=true;
		int money=100;
		System.out.println("What's your name?");
		String name=input.nextLine();
		System.out.println("Hello, "+name+"! Good luck!");
		while(again)
			{
			System.out.println("You have $"+money);
			rollDice();
			System.out.println("How much will you bet?");
			int bet=input.nextInt();
			if((sum==2)||(sum==12))
				{
				System.out.println("You lose");
				money=money-bet;
				System.out.println("You have $"+money);
				}
			else if((sum==7)||(sum==11))
				{
				System.out.println("You win");
				money=money+bet;
				System.out.println("You have $"+money);
				}
			else
				{
				System.out.println("Your point is "+sum);
				int point=sum;
				do
					{
					System.out.println("How much will you bet?");
					bet=bet+input.nextInt();
					rollDice();
					if(sum==point)
						{
						System.out.println("You win");
						money=money+bet;
						System.out.println("You have $"+money);
						}
					else if(sum==7)
						{
						System.out.println("You lose");
						money=money-bet;
						System.out.println("You have $"+money);
						}
					}while((point!=sum)&&(sum!=7));
				}
			System.out.println("Play again? Y for yes and n for no.");
			input.nextLine();
			String playAgain=input.nextLine();
			if((playAgain.equals("N"))||(playAgain.equals("n")))
				{
				again=false;
				}
			}
		}
		static int sum;
		public static int rollDice()
			{
			int rollOne=(int)(Math.random()*6)+1;
			int rollTwo=(int)(Math.random()*6)+1;
			sum=rollOne+rollTwo;
			return sum;
			}
	}