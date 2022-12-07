import java.util.Scanner;
public class Act_4 {
 static void metric(double kg, double hgt) {
	 	System.out.println("============================================");
		System.out.println("                METRIC MEASURES             ");
				
		double bmi = 1; 
	 	double hgt2 = 1;
	 	hgt2 = hgt * hgt; 
	 	bmi = kg / hgt2; 
		if(bmi<18.5) {
			System.out.println("============================================");
			System.out.println("Your bmi is "+ String.format("%.2f", bmi)+" and you're Underweight!");
			System.out.println("============================================");
		}
		else if(bmi<=24.9) {
			System.out.println("============================================");
			System.out.println("Your bmi is "+String.format("%.2f", bmi) +" and you're Normal!    ");
			System.out.println("============================================");
		}
		else if(bmi<=29.9) {
			System.out.println("============================================");
			System.out.println("Your bmi is "+ String.format("%.2f", bmi) +" and you're Overweight!");
			System.out.println("============================================");
		}
		else if(bmi<50) {
			System.out.println("============================================");
			System.out.println("Your bmi is "+ String.format("%.2f", bmi) +" and you're Obese!     ");
			System.out.println("============================================");
		}
		else {
			System.out.println("Invalid output!");
		}
	 
 }
static void standard(double lbs, double inches) {
	System.out.println("============================================");
	System.out.println("              STANDARD MEASURES             ");

	double bmi = 1;
	double formula = 1;
	double xtra = 703;
 	double hgt2 = 1;
 	hgt2 = inches * inches; 
 	formula = lbs / hgt2; 
 	bmi = formula * xtra;
	if(bmi<18.5) {
		System.out.println("============================================");
		System.out.println("Your bmi is "+ String.format("%.2f", bmi)+" and you're Underweight!");
		System.out.println("============================================");
	}
	else if(bmi<=24.9) {
		System.out.println("============================================");
		System.out.println("Your bmi is "+String.format("%.2f", bmi) +" and you're Normal!    ");
		System.out.println("============================================");
	}
	else if(bmi<=29.9) {
		System.out.println("============================================");
		System.out.println("Your bmi is "+ String.format("%.2f", bmi) +" and you're Overweight!");
		System.out.println("============================================");
	}
	else if(bmi<=50) {
		System.out.println("============================================");
		System.out.println("Your bmi is "+ String.format("%.2f", bmi) +" and you're Obese!     ");
		System.out.println("============================================");
	}
	else {
		System.out.println("Invalid output!");
	}
	
}
 
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	  char loop = 'y';
	 
	 	System.out.println("============================================");
		System.out.println("               BMI CALCULATOR               ");
		System.out.println("============================================");
		while(loop =='Y'||loop == 'y') {
		System.out.println("What type of Measurement you want to use?   ");
		System.out.println("[S]Standard                                 ");
		System.out.println("[M]Metric                                   ");
		System.out.println("[H]Help                                     ");
		char measurement = sc.next().charAt(0);

		
			if(measurement == 'M'|| measurement == 'm') {
				System.out.println("============================================");
				System.out.println("Enter your height(m): ");
				double hgt = sc.nextDouble();
				System.out.println("Enter your weight(kg.):     ");
				double kg = sc.nextDouble();
				metric(kg,hgt);

			}
			if(measurement == 'S'|| measurement == 's') {
				System.out.println("============================================");
				System.out.println("Enter your height(in.): ");
				double inches = sc.nextDouble();
				System.out.println("Enter your weight(lbs.):     ");
				double lbs = sc.nextDouble();
				standard(lbs,inches);

			}
			if(measurement == 'h'|| measurement =='H') {
				System.out.println("BMI");
				System.out.println("Body mass index (BMI) is a measure of body fat ");
				System.out.println("based on height and weight that applies to adult men and women.");
				
				System.out.println("");
				System.out.println("English System of Measurement");
				System.out.println("Feet to decimals");
				System.out.println("1 inch = 0.08");
				System.out.println("1 feet = 1.00 ");
				System.out.println("1 feet = 12 inches");
				System.out.println("============================================");
			}
			System.out.println("Do you want to use BMI Calculator again?(Y/N)");
			char loop1 = sc.next().charAt(0);			
				if(loop1 == 'n'||loop1 == 'N') {
					System.out.println("Thank you for using BMI Calculator!");
					break;
				}
				
		}
		}
}
