import java.util.Scanner;
public class Act3 {
	static void grd_systm(int grd) {

	switch(grd) {	
		case 100: 
			System.out.println("Wow, You're  outstanding!  ");
			System.out.println("         You Passed!       ");
			break;
			
		case 99: case 98: case 97: case 96: case 95: 
		case 94: case 93: case 92: case 91: case 90:
			System.out.println("Wow, You're Great!   ");
			System.out.println("         You Passed!       ");
break;
		case 89: case 88: case 87: case 86: case 85: 
		case 84: case 83: case 82: case 81: case 80:
			System.out.println("Wow, You're Good !   ");
			System.out.println("         You Passed!       ");
break;
		case 79: case 78: case 77: case 76: case 75: 
			
				System.out.println("Do better next time!");
				System.out.println("      You Passed!       ");
break;
				
		case 74: case 73: case 72: case 71: case 70:
			
			System.out.println("Better luck next time!");
			System.out.println("          You Failed!       ");
break;
			
		
		default:
			
			System.out.println("Try to do better! :> ");
			System.out.println("          You Failed!        ");
break;
			
	}

			
	}
	public static void main(String[] args) {
		char loop = 'y';
		Scanner sc = new Scanner(System.in);
		while(loop=='y'||loop=='Y') {
		System.out.println("Enter your grade: ");
		int grd = sc.nextInt();
		System.out.println("=================================");
		System.out.println("         GRADING CHECKER         ");
		System.out.println("=================================");
		System.out.print("    "); grd_systm(grd);
		System.out.println("=================================");	
		System.out.println("Do you want to check your grades again?(Y/N)");
		char loop1 = sc.next().charAt(0);
			if(loop1 == 'N'||loop1=='n') {
				System.out.println("Thank you for using our Grades Checker!");
			}
		}
	
		
	}

}
