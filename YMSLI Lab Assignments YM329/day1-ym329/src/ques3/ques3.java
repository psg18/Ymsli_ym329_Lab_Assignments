package ques3;

import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students : ");
		int num = sc.nextInt();
		int i=0,sum=0;
		int[] grades = new int[num];
		while(i<num) {
			System.out.println("Enter Grade for student "+(i+1)+" : ");
			int grade = sc.nextInt();
			if(grade>=0 && grade<=100) {grades[i]=grade;i++;}
			else System.out.println("Invalid grade, try again...");
		}
		for(int x:grades) {
			sum+=x;
		}
		System.out.println("avg : "+ (float)(sum/(grades.length)));


	}

}
