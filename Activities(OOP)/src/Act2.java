import java.util.Scanner;
public class Act2 {
	static void Age_vote(int age, String name) {
		 
		if (age >= 18) {
			
			System.out.println("========================================================");
			System.out.println("  "+name+", "+age+"                                     ");
			System.out.println("                                                        ");
			System.out.println("             You are eligible to vote!                  ");
			System.out.println("========================================================");
		}
		else {
			System.out.println("========================================================");
			System.out.println("  "+name+", "+age+"                                     ");
			System.out.println("                                                        ");
			System.out.println("	Sorry, You're not eligible to vote.			        ");
			System.out.println("========================================================");
		}
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			Age_vote(age, name);
		}
			
		}
	

