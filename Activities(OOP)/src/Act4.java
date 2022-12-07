import java.util.Scanner;
public class Act4 {
	static Scanner sc = new Scanner(System.in);
	static void elements(int choice) {
		
		if(choice == 1) {
			
		}
		else if(choice == 2) {
			System.out.println("Select a group: ");
			System.out.println("=======================================");
			System.out.println("[1]Group 1A        [10]Group 10        ");
			System.out.println("[2]Group 2A        [11]Group 1B        ");
			System.out.println("[3]Group 3B        [12]Group 2B        ");
			System.out.println("[4]Group 4B        [13]Group 3A		   ");
			System.out.println("[5]Group 5B        [14]Group 4A        ");
			System.out.println("[6]Group 6B        [15]Group 5A        ");
			System.out.println("[7]Group 7B        [16]Group 6A        ");
			System.out.println("[8]Group 8         [17]Group 7A        ");
			System.out.println("[9]Group 8B        [18]Group 8A        ");
			System.out.println("=======================================");
			int grp = sc.nextInt();
			
		}
		else if(choice == 3) {
			System.out.println("Select a period: ");
			System.out.println("=======================================");
			System.out.println("[1]Period 1                            ");
			System.out.println("[2]Period 2                            ");
			System.out.println("[3]Period 3                            ");
			System.out.println("[4]Period 4                            ");
			System.out.println("[5]Period 5                            ");
			System.out.println("[6]Period 6                            ");
			System.out.println("[7]Period 7                            ");
			System.out.println("=======================================");
			
		}
		else if(choice == 4) {
			System.out.println("Select a Family: ");
			System.out.println("=======================================");
			System.out.println("[1]Alkali Metals                       ");
			System.out.println("[2]The Alkaline Earth Metals           ");
			System.out.println("[3]Rare Earth Metals:Lanthanides       ");
			System.out.println("[4]Rare Earth Metals:Actinides         ");
			System.out.println("[5]The Transition Metals               ");
			System.out.println("[6]Post Transition Metals              ");
			System.out.println("[7]The Metalloids                      ");
			System.out.println("[8]The Halogens                        ");
			System.out.println("[9]Noble Metals                        ");
			System.out.println("[10]Noble Gases                        ");
			System.out.println("=======================================");
			int family = sc.nextInt();
				if (family == 1) {
					System.out.println("=======================================");
					System.out.println("3  - Lithium      11 - Sodium    ");
					System.out.println("19 - Potassium    37 - Rubidium  ");
					System.out.println("55 - Cesium       87 - Francium  ");
					System.out.println("=======================================");
					
				}
				if(family == 2) {
					System.out.println("=======================================");
					System.out.println("4  - Beryllium    12 - Magnesium       ");
					System.out.println("20 - Calcium      38 - Strontium       ");
					System.out.println("56 - Barium       88 - Radium          ");
					System.out.println("=======================================");
				}
				if(family == 3) {
					System.out.println("=======================================");
					System.out.println("57 - Lanthanum    58 - Cerium          ");
					System.out.println("59 - Praseodymium 60 - Neodymium       ");
					System.out.println("61 - Promethium   62 - Samarium        ");
					System.out.println("63 - Europium     64 - Gadolinium      ");
					System.out.println("65 - Terbium      66 - Dysprosium      ");
					System.out.println("67 - Holmium      68 - Erbium          ");
					System.out.println("69 - Thulium      70 - Ytterbium       ");
					System.out.println("71 - Lutetium                          ");
					System.out.println("=======================================");
				}
				if(family == 4) {
					System.out.println("=======================================");
					System.out.println("89 - Actinium     90 - Thorium         ");
					System.out.println("");
					System.out.println("=======================================");
				}
		}
		else if (choice == 5) {
			
		}
		
		}
	public static void main(String[] args) {
		
		System.out.println("============================================");
		System.out.println("                  ELEMENTS                  ");
		System.out.println("============================================");
		
		System.out.println("Find elements.");
		System.out.println("[1]Search for an element");
		System.out.println("[2]Search a Group       ");
		System.out.println("[3]Search a Period      ");
		System.out.println("[4]Search a Family      ");
		System.out.println("[5]Help                 ");
		int choice = sc.nextInt();
		elements(choice);
		
		
	}
}
