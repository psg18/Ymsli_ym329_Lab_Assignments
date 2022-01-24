package ques2;

public class Multithread implements Runnable{

	@Override
	public void run() {
		for(int counter=1; counter<=100; counter++) {
			System.out.println("[" + Thread.currentThread().getName() + " : "+counter+" ]");
		}
	}
	
}
