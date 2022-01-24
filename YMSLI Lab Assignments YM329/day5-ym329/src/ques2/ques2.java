package ques2;

public class ques2 {
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread( new Multithread());
		Thread thread2 = new Thread( new Multithread());
		Thread thread3 = new Thread( new Multithread());
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
