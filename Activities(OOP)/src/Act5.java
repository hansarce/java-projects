import java.util.Scanner;
import java.util.Arrays;
public class Act5 {
public static Scanner sc = new Scanner(System.in);
	static void calculator(char symbol) {
	 switch(symbol) {	 
 		case '+':
 			 
 			int i,sum = 0; 
 			int numbers = 100;
 			int nmbr[]  = new int[numbers];
 			System.out.println("=====================================");
 			System.out.println("Addition Operation.(input 0 to end.)");
 			
 			for(i = 0; i<nmbr.length; i++){
 				System.out.println("Input numbers: ");
 				nmbr[i] = sc.nextInt(); 
 				sum = sum +nmbr[i];
 					if(nmbr[i]==0) {
 						System.out.println("Result = " + sum);
 break;
 				 }
 					
 			}
 break;
 		
 		case '-':
 			
 			int j, sum1 = 0; 
 			int numbers1 = 100; 
 			int nmbr1[] = new int[numbers1];
 			System.out.println("=====================================");
 			System.out.println("Subtraction Operation.(input 0 to end.)");
 			
 			for (j=0; j<nmbr1.length; j++) {
 				System.out.println("Input numbers: ");
 				nmbr1[j] = sc.nextInt();
 				sum1 = nmbr1[j] - sum1 ;
 					if(nmbr1[j]==0) {
 						System.out.println("Result = "+sum1);
 break;
 					}
 			}
 		
 break;
 
 		case '*':
 				
 			int g;
 			int sum2 = 1; 
 			int numbers2 = 100;
 			int nmbr2[] = new int[numbers2];
 			System.out.println("=====================================");
 			System.out.println("Multiplication Operation.(input 1 to end.)");
 			
 			for (g = 0; g<nmbr2.length; g++) {
 				System.out.println("Input numbers: ");
 				nmbr2[g] = sc.nextInt();
 				sum2 =  sum2 * nmbr2[g];
 					
					if (nmbr2[g]==1) {
 						System.out.println("Result = "+sum2);
 break; 
					}
 			}
 break;
 		case '/':
 			
 			int h; 
 			int numbers3 = 100;
 			double sum3 = 1; 
 			int nmbr3[] = new int[numbers3];
 			System.out.println("=====================================");
 			System.out.println("Division Operation.(input 1 to end.)");
 			
 			for (h = 0; h<nmbr3.length; h++) {
 				System.out.println("Input numbers: ");
 				nmbr3[h] = (int) sc.nextDouble();
 				sum3 = nmbr3[h] /sum3 ;
 				
 				if(nmbr3[h]==1) {
 					System.out.println("Result ="+sum3);
 break; 
 				}
 			}
 			
}	  
}
	 public static void main(String[] args) {
		char nxtoperation = 'y'; 
		System.out.println("=====================================");
		System.out.println("            MINI CALCULATOR          ");
		System.out.println("=====================================");
		while(nxtoperation == 'Y'|| nxtoperation == 'y') { 
		System.out.println("Enter an operation you want.");
		System.out.println("[+]Addition");
		System.out.println("[-]Subtraction");
		System.out.println("[*]Multiplication");
		System.out.println("[/]Division");
		System.out.println("=====================================");
		
		char symbol = sc.next().charAt(0);
		calculator(symbol);
		
		System.out.println("=====================================");
		System.out.println("Do you want to use another operation?(Y/N)");
		char nxtoperation1 = sc.next().charAt(0);
			if (nxtoperation1=='N' || nxtoperation1 =='n') {
				System.out.println("Thank you for using the 'Mini Calculator'! ");
				break;
			}
		 }
	 }
 
}
