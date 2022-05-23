package coffeeMachine;

	import java.util.Scanner;

	public class CoffeeMachine {
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Star Bucks ☕");
				boolean bool = true;
				while (bool) {
					System.out.println("Write action (buy, fill, take, remaining, exit): ");
					String choice = sc.next();
					System.out.println();
					switch (choice) {
					case "buy":
						buy();
						break;

					case "fill":
						fill();
						break;

					case "take":
						take();
						break;

					case "remaining":
						remaining();
						break;

					case "exit":
						bool = false;
						break;
						
					}
					System.out.println();
				}
			}			
		}
		
		public static void restart() {
			
		}
		static int water = 400;
		static int milk = 540;
		static int coffeeBeans = 120;
		static int cups = 9;
		static int money = 550;

		public static void intro() {
			System.out.println("The coffee machine has: ");
			System.out.println(water + " of water");
			System.out.println(milk + " of milk");
			System.out.println(coffeeBeans + " of coffee beans");
			System.out.println(cups + " of disposable cups");
			System.out.println("$" + money + " of money");
		}

		public static void buy() {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
				String choice = sc.next();

				switch (choice) {
				case "1":
					if (water >= 250 && coffeeBeans >= 16 && cups > 1) {
						water -= 250;
						coffeeBeans -= 16;
						money += 4;
						cups -= 1;
						System.out.println("I have enough resources, making you a coffee!");
					}
					else if(water<250){
						System.out.println("Sorry, not enough water!");
					}
					else if(coffeeBeans < 16){
						System.out.println("Sorry, not enough coffeeBeans!");
					}
					else if(cups < 1){
						System.out.println("Sorry, not enough cups!");
					}		
					break;

				case "2":
					if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups > 1) {
						water -= 350;
						milk -= 75;
						coffeeBeans -= 20;
						money += 7;
						cups -= 1;
						System.out.println("I have enough resources, making you a coffee!");
					}
					else if(water<350){
						System.out.println("Sorry, not enough water!");
					}
					else if(milk<75) {
						System.out.println("Sorry, not enough milk!");
					}
					else if(coffeeBeans < 20){
						System.out.println("Sorry, not enough coffeeBeans!");
					}
					else if(cups < 1){
						System.out.println("Sorry, not enough cups!");
					}
					break;

				case "3":
					if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups > 1) {
						water -= 200;
						milk -= 100;
						coffeeBeans -= 16;
						money += 6;
						cups -= 1;
						System.out.println("I have enough resources, making you a coffee!");
					}
					else if(water<200){
						System.out.println("Sorry, not enough water!");
					}
					else if(milk<100) {
						System.out.println("Sorry, not enough milk!");
					}
					else if(coffeeBeans < 12){
						System.out.println("Sorry, not enough coffeeBeans!");
					}
					else if(cups < 1){
						System.out.println("Sorry, not enough cups!");
					}	
					break;

				case "back":
					break;

				default:
					System.out.println("Invalid Input");
					break;
				}
			}
		}

		public static void fill() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Write how many ml of water do you want to add: ");
			water += sc.nextInt();
			System.out.println("Write how many ml of milk do you want to add: ");
			milk += sc.nextInt();
			System.out.println("Write how many grams of coffee beans do you want to add: ");
			coffeeBeans += sc.nextInt();
			System.out.println("Write how many disposable cups of coffee do you want to add: ");
			cups += sc.nextInt();
		}

		public static void remaining() {
			intro();
		}

		public static void take() {
			System.out.println("I gave you $ " + money);
			money -= money;
		}
	}

