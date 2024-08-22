package models;
/**
 * This class represents a contact, containing its name and phone number.
 */
public class Contact {
	private String name;
	private String phoneNumber;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s | PhoneNumber: %s ", getName(), getPhoneNumber());
	}

}
