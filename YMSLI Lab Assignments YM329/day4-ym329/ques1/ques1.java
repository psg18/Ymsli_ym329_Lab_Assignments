package ques1;

import java.io.*;

public class ques1 {
	
	private static void readWriteStream(File file) {
		try(FileInputStream fileInput = new FileInputStream(file)){
			byte[] bfileArray = new byte[(int)file.length()];
			fileInput.read(bfileArray);
			System.out.println("Writing in BYTE STREAM");
			for(byte b: bfileArray) {
				System.out.print(b);
			}
			System.out.println("\n\nWriting in CHAR STREAM");
			for(byte b: bfileArray) {
				System.out.print((char)b);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		File file = new File("C:\\Users\\ve00ym329\\Documents\\lab assignments\\day4-ym329\\src\\ques1\\TextFileQ1");
		readWriteStream(file);
	}

}
