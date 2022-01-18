package ques2;

import java.io.*;

public class ques2 {

	private static void writeFile(File file) {
		try(FileWriter fileWriter = new FileWriter(file)){
			
			BufferedWriter bw = new BufferedWriter(fileWriter);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			bw.write(br.readLine());
			bw.flush();
			br.close();
			
			System.out.println("\nOutput in file: ");
			BufferedReader readFile = new BufferedReader(new FileReader(file));
			String st=null;
			while((st = readFile.readLine())!=null) {
				System.out.println(st);
			}
			readFile.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		File file = new File("C:\\Users\\ve00ym329\\Documents\\lab assignments\\day4-ym329\\src\\ques2\\TextFileQ2");
		writeFile(file);
	}

}
