package task_first;
import java.util.*;
public class Guessing_game {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		
		int max_attempts=10;
		int attempts=0;
		int round=0;
		int totalScore=0;
		System.out.println("welcomes to the Number Guessing Game!");
		while(true)
		{		
			
			int generated_number=random.nextInt(100)+1;
					boolean guessing=true;
					
		while(attempts<max_attempts  ) {
			System.out.println("enter the number between 0to 100");
			int user_guess=sc.nextInt();

			attempts++;
		
		if(user_guess<generated_number) {
			System.out.println("Too Low!");
		}
		else if(user_guess>generated_number) {
			System.out.println("Too High!");
		}else {
			System.out.println("Correct! you guessed the numbermin "+attempts+" attempts");
		totalScore= totalScore+attempts;
		
		break;
		}
		}
		
		System.out.println("GAME OVER! your total score is : "+ totalScore);
		break;
		}
		
	}
	
		}


