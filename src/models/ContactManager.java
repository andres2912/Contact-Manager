/**
 * This class handles the CRUD (Create, Read, Update, Delete) operations 
 * for managing a contact list within the application.
 */
package models;

import java.util.HashMap;

public class ContactManager {

	// Stores the contacts, using the contact name as the key.
	public HashMap<String, Contact> contacts = new HashMap<>();
	// Input handler instance for receiving and validating user input.
	Input sc = new Input();

	/**
	 * Searches for a contact by name.
	 * 
	 * @param name The name of the contact to search for.
	 * @return true if the contact exists in the list, false otherwise.
	 */
	public Boolean search(String name) {
		if (contacts.containsKey(name)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Inserts a new contact into the contact list after validating the input.
	 */
	public void insert() {
		System.out.println("Enter contact name: \n");
		String name = sc.input();
		if (search(name)) {
			System.out.println("A contact with the name already exists: " + name.toUpperCase());
		} else {
			System.out.println("Enter contact number: \n");
			String phoneNumber = sc.input();
			if (sc.validation(phoneNumber)) {
				Contact contact = new Contact();
				contact.setName(name);
				contact.setPhoneNumber(phoneNumber);
				contacts.put(name, contact);
				System.out.println("Contact successfully added");
			} else {
				System.out.println("The contact number does not meet the parameters");

			}
		}

	}

	/**
	 * Updates the name or phone number of an existing contact.
	 */

	public void update() {
		String option;
		System.out.println("Enter contact name: \n");
		String name = sc.input();
		if (search(name)) {
			System.out.println("Press 1 to update the contact's name" + "\n" + "Press 2 to update the contact's phone number\n");
			option = sc.input();
			switch (option) {
			case "1":
				Contact contactNameToUpdate = contacts.get(name);
				System.out.println("Enter the new name to update the contact: " + contactNameToUpdate.getName());
				name = sc.input();
				if (!search(name)) {
					contacts.remove(contactNameToUpdate.getName());
					contactNameToUpdate.setName(name);
					contacts.put(name, contactNameToUpdate);
					System.out.println("Contact name updated successfully");
				} else {
					System.out.println("A contact with the name already exists: " + name);
				}
				break;
			case "2":
				Contact contactNumberToUpdate = contacts.get(name);
				System.out.println("Enter new contact number: \n");
				String phoneNumber = sc.input();
				if (sc.validation(phoneNumber)) {
					contactNumberToUpdate.setPhoneNumber(phoneNumber);
					contacts.replace(name, contactNumberToUpdate);
					System.out.println("Contact number updated successfully");
				}
				break;
			case "0":
				break;
			default:
				System.out.println("Invalid option");
				break;

			}

		} else {
			System.out.println("Contact not found");
		}

	}

	/**
	 * Deletes an existing contact from the list after confirming the action.
	 */

	public void delete() {
		String option;
		System.out.println("Enter contact name: ");
		String name = sc.input();
		if (search(name)) {
			System.out.println(String.format("Are you sure you want to delete %s"
					+ "\n from your contact list?\nPress 1 to delete \n" + " Press 0 to undo:\n", name.toUpperCase()));
			option = sc.input();

			switch (option) {
			case "1":
				contacts.remove(name);
				System.out.println("Contact has been successfully deleted");
				System.out.println(contacts);
				break;
			case "0":
				break;

			}
		} else {
			System.out.println("Contact not found");

		}

	}

	/**
	 * Displays all contacts in the contact list.
	 */

	public void showContacts() {
		for (String key : contacts.keySet()) {
			System.out.println(contacts.get(key));

		}
	}

}