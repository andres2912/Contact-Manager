# Contact Manager

**Contact Manager** is a command-line application designed to manage a simple contact list. The program allows users to perform basic CRUD (Create, Read, Update, Delete) operations on contacts, each of which includes a name and a phone number. The application ensures that phone numbers are valid by restricting input to numeric values with a maximum of 11 digits.

## Features

 - **Search Contacts:** Look up a contact by their name.
 - **Add Contacts:** Insert new contacts with a valid name and phone number.
 - **Update Contacts:** Modify the name or phone number of an existing contact.
 - **Delete Contacts:** Remove a contact from the list after confirmation.
 - **View All Contacts:** Display the entire list of saved contacts.
 - **Input Validation:** Ensures phone numbers are numeric and up to 11 digits long (this limit can be modified by changing the `MAX_LENGTH_VALIDATION` parameter in the code).
 - **Exit:** Option to safely terminate the program.


## Installation

Clone the repository to your local machine:
bash
`git clone https://github.com/yourusername/contact-manager.git`


Navigate to the project directory:
cd contact-manager
Compile the project and run it using your preferred IDE or command line.

## Usage
Once the program is running, you will be prompted to choose an operation:

- **Search for a Contact:** Look up a contact by name.
- **Add a New Contact:** Insert a new contact with a valid name and phone number.
- **Update an Existing Contact:** Modify either the name or phone number of an existing contact.
- **Delete a Contact:** Remove a contact from the list after confirmation.
- **View All Contacts:** Display the entire list of saved contacts.
- **Exit the Application:** Safely terminate the program.
