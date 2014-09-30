package main;

public class Faculty extends Employee {

	public Faculty(String Name, String Address, String Phonenumber,
			String Emailaddress, String office, double salary,
			String dateHired, String officeHours, String rank) {
		super(Name, Address, Phonenumber, Emailaddress, office, salary,
				dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	private String officeHours;
	private String rank;

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return this.getClass() + getName();
	}

}
