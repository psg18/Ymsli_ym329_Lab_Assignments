package ques1;

import java.util.Random;

public class RandomSum implements Runnable{
	
	int num=0;

	@Override
	public void run() {
		Random random = new Random();
		int num = random.nextInt(10)+1;
		System.out.println(Thread.currentThread().getName() + "-> Random Number Generated : "+num);
		synchronized (this) {
			this.num=num;		
		}
	}
	
	public int getNum() {
		return num; 
	}

}