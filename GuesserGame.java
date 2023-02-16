import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}	
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	boolean flag = true;
	
	String username1 = "huzaifa@gmail.com";
	String password1 = "huzaifa";
	
	String username2;
	String password2;
	
	public int setUserDetails(String username2, String password2) {
		int x = 0;
		if(username2.equalsIgnoreCase(username1) && password2.equals(password1)) {
			System.out.println("Already Registered");
			x = 0;
		}
		else 
		{
			this.username2 = username2;
			this.password2 = password2;
			x = 1;
		}
		return x;
	}
	
	
	
	boolean checkUser(String username1, String password1) {
		if(this.username1.equalsIgnoreCase(username1)) {
			if(this.password1.equals(password1)) {
			System.out.println("Successfully signedin.");
			flag = true;
			
			}else {
				System.out.println("Invalid User");
				flag = false; 
			}
		}else if(this.username2.equalsIgnoreCase(username1)) {
			if(this.password2.equals(password1)) {
			System.out.println("Successfully signedin.");
			flag = true;
			
			}
			else {
				System.out.println("Invalid User");
				flag = false; 
			}
		}
		else {
			System.out.println("Invalid User Details.");
			flag = false;
		}
		return flag;
		
		
	}
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}

	
	
}


public class GuesserGame {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			Umpire u=new Umpire();
			
			int checkUser = 0;
			
			System.out.println("Please type 1 if you already signup. if not then type 2 signup");
			int num = sc.nextInt();
			
			if(num == 2) {
			System.out.println("Set the username");
			String username2 = sc.next();
			
			System.out.println("Set the password");
			String password2 = sc.next();
			
			u.username2 = username2;
			u.password2 = password2;
			
			checkUser =u.setUserDetails(username2, password2);
			
			if(checkUser == 1)
			{
			System.out.println("Please Enter the username");
			String username1 = sc.next();
			
			System.out.println("Please Enter the Password");
			String password1 = sc.next();
			
			
			
			boolean check = u.checkUser(username1, password1);
			if(check) {
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.compare();
			}
			}
			}
			
			if(num == 1) {
				
				System.out.println("Please Enter the username");
				String username1 = sc.next();
				
				System.out.println("Please Enter the Password");
				String password1 = sc.next();
				
				
				
				boolean check = u.checkUser(username1, password1);
				if(check) {
				u.collectNumFromGuesser();
				u.collectNumFromPlayers();
				u.compare();
				}
			}
			
			
			
			
			
			
	}

}
	
