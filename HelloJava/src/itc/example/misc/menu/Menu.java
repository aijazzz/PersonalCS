package itc.example.misc.menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	ArrayList<OOPMenuItem> menuItems = new ArrayList<>(); 
	
	/**
	 * Adds a menu item in the list with its corresponding command
	 * @param menuDisplay
	 * @param menuItem
	 */
	public void addMenuItem(String menuDisplay, int menuItem) {		
		OOPMenuItem mi = new OOPMenuItem(menuDisplay, menuItem);
		this.menuItems.add(mi);
	}
	
	
	public int getNextCommand() {
		int command = 0;
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("\nPlease select a command,");
		for (OOPMenuItem mi : this.menuItems) {
			String line = mi.commandMessage + ": " + mi.command;			
			System.out.println(line);
		}

		boolean goodNumber = true;
		do {
			try {
				String cs = scanner.nextLine();				
				command = Integer.parseInt(cs);
				goodNumber = true;
			} catch (NumberFormatException nex) {
				System.out.println("Please enter integer only.");
				goodNumber = false;
			}
		} while (!goodNumber);
		
		scanner.close();
		
		return command;
	}


	public static void main(String[] args) {

		Menu menu = new Menu();
		menu.addMenuItem("Perform addition", 1);
		menu.addMenuItem("Perform subtraction", 2);
		menu.addMenuItem("Exit", 0);

		int command = menu.getNextCommand();

		if (command == 1) {
			System.out.println("Addition");
		} else if (command == 2) {
			System.out.println("Subtraction");
		}
		System.out.println("Exiting..");
	}

}
