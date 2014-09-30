package main;

public class Student extends Person {

	public Student(String Name, String Address, String Phonenumber,
			String Emailaddress, String Status) {
		super(Name, Address, Phonenumber, Emailaddress);
	}

	private Status status;

	public enum Status {

		FRESHMAN, SOPHOMORE, JUNIOR, SENIOR;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Status getStatus() {
		return this.status;
	}

	@Override
	public String toString() {
		return this.getClass() + getName();
	}
}
