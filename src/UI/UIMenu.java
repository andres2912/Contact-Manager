package UI;
import java.util.Scanner;

import models.ContactManager;
import models.Input;
public class UIMenu {
	private ContactManager instance;
	private String choice;
	private Boolean isRunning = true;
	public UIMenu(ContactManager instance) {
		this.instance = instance;
		menu();
		
	}
	public void menu() {
		Input sc = new Input();
		System.out.print("choose an opcion\n");
		System.out.print("1. Search contact\n");
		System.out.print("2. Save contact\n");
		System.out.print("3. Update contact\n");
		System.out.print("4. Delete contact\n");
		System.out.print("5. Show all contacts\n");
		System.out.print("0. Exit\n");
		
		System.out.println("Choose an option: \n");
		this.choice = sc.input();
		Boolean answer;
		String name;
		while(isRunning) { 
			
			switch(this.choice) {
				case "1":
					System.out.println("Enter contact name: ");
					name = sc.input();
					/*I save the value from this case
					To show message*/
					answer= this.instance.search(name);
					if(answer) {
						System.out.println(this.instance.contacts.get(name));
					}else {
						System.out.println(name.toUpperCase()+" It's not in your Contact list");
					}
					menu();
					break;
				case "2":
					this.instance.insert();
					menu();
					break;
				case "3":
					this.instance.update();
					menu();
					break;
				case "4":
					this.instance.delete();
					menu();
					break;
				case "5":
					this.instance.showContacts();
					menu();
					break;
				case "0":
					System.out.println("You finish");
					isRunning = false;
					break;
				default:
					System.out.println("Invalite option");
					menu();
					break;
					
			}
	    }
		
	}	
}
