package ques4;

public class Student{
	private String id;
	private String name;
	private double grade;
	public Student(String id) {
		this.id = id;
	}
	public Student(String id, String name) {
		this(id);
		this.name = name;
	}
	public Student(String id, String name, double grade) {
		this(id,name);
		this.grade = grade;
	}
	
	public void display() {
		if(id!=null) {
			System.out.println("ID: "+id);
		}
		if(name!=null) {
			System.out.println("Name: "+name);
		}
		if(grade!=0.0) {
			System.out.println("Grade: "+grade);
		}	
		System.out.println();
	}
	public void display(int year) {
		System.out.println("Year: "+year);
		this.display();
	}
}