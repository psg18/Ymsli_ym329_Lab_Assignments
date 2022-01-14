package ques4;

public class ques4 {
	
	public static int[] copyOf(int[] array) {
		int[] copyArray = new int[array.length];
		for(int i=0;i<array.length;i++) {
			copyArray[i] = array[i];
		}
		return copyArray;
	}
	
	public static void main(String[] args) {
		int[] array = {2,3,5,6,8,4};
		int[] copied = copyOf(array);
		for(int x: copied) {
			System.out.print(x+" ");
		}
	}

}
