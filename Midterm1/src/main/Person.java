package main;

public class Person {
	
	private String name;
	private String address;
	private String phonenumber;
	private String emailaddress;
		
	public Person(String Name, String Address, String Phonenumber, String Emailaddress) {
		this.name = Name;
		this.address = Address;
		this.phonenumber = Phonenumber;
		this.emailaddress = Emailaddress;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public void setAddress(String newAddress) {
		this.address = newAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setPhone(String newPhone) {
		this.phonenumber = newPhone;
	}

	public String getPhone() {
		return phonenumber;
	}

	public void setEmail(String newEmail) {
		this.emailaddress = newEmail;
	}

	public String getEmail() {
		return emailaddress;
	}

}
