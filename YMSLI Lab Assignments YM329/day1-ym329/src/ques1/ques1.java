package ques1;

public class ques1 {
	static int n1 = 1, n2 = 1, n3, sum=0;
	public static void printFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			sum+=n3;
			printFibonacci(count - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("1 1");
		printFibonacci(18);
		System.out.print("avg: "+ (float)sum/20);
	}

}

