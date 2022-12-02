package org.tnsindia.di;
//class
public class Student {
	//data members
	//di in terms of literals 
	private String Student_Name;
	private int roll_no;
	
	// setters and getters method 
	//dependency using setters 
	 public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public void display()
	{
		System.out.println("the name of the student is : "+Student_Name);
		System.out.println("the roll no : "+roll_no);
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public Student(String student_Name, int roll_no) {
		super();
		Student_Name = student_Name;
		this.roll_no = roll_no;
	}
}
