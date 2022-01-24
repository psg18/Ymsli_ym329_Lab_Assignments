package ques1;

import java.util.Scanner;

public class ques1 {
	
	public static void main(String[] args) {
	
//		Scanner input = new Scanner(System.in);
//	    System.out.println("Number of Threads: ");
//	    int n = input.nextInt();
		
		int n =5;
	    
	    int totalSum=0;

	    for (int x=0; x<n; x++)
	    {
	    	RandomSum randomsum = new RandomSum();
	        Thread thread= new Thread(randomsum);
	        thread.start();
	        try {
	        	thread.join();
	        }
	        catch(InterruptedException e) {
	        	System.out.println(e.getStackTrace());
	        }
	        totalSum += randomsum.getNum();
	    }
	    
	    System.out.println("Sum : "+totalSum);		
	}
	
}
