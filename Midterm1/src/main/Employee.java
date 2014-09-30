package main;

public class Employee extends Person {

	public Employee(String Name, String Address, String Phonenumber,
			String Emailaddress, String office, double salary, String dateHired) {
		super(Name, Address, Phonenumber, Emailaddress);
		this.office = office;
		this.salary = salary;
		DateHired = dateHired;
	}

	private String office;
	private double salary;
	private String DateHired;

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return DateHired;
	}

	public void setDateHired(String dateHired) {
		DateHired = dateHired;
	}
	@Override
	public String toString() {
		return this.getClass() + getName();
	}
}
