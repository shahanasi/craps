import java.util.Scanner;

public class DivingRightIn
	{
public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("whats your name");
		String name=input.nextLine();
		System.out.println("how old are you");
		int age=input.nextInt();
		System.out.println("whats your birth year");
		int year=input.nextInt();
		System.out.println("hello, "+name);
		if(age<=16){
			System.out.println("you're 16 or younger");
		}
		else if(age==17){
			System.out.println("you're 17");
		}
		else{
			System.out.println("you're 18 or older");
		}
		int count=0;
		for(int i=0; i<=age; i++){
			if(i==1){
				System.out.println("you were "+i+" year old in "+(i+year));
			}
			else{
			System.out.println("you were "+i+" years old in "+(i+year));
			}
			if((i+year)%4==0){
				count=count+1;
			}
		}
		System.out.println("your age in dog years is "+(age*7)+" years");
		System.out.println("you've lived through "+count+" leap years");
	}
	}