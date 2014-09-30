package main;

public class Staff extends Employee {

	private String title;

	public Staff(String Name, String Address, String Phonenumber,
			String Emailaddress, String office, double salary,
			String dateHired, String title) {
		super(Name, Address, Phonenumber, Emailaddress, office, salary,
				dateHired);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return this.getClass() + getName();
	}
}
