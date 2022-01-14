package ques4;


public class ques4 {

	public static void main(String[] args) {
		Student student1 = new Student("ym329");
		student1.display();
		Student student2 = new Student("ym329","Paras");
		student2.display();
		Student student3 = new Student("ym329","Paras",92.00);
		student3.display(2000);

	}

}
