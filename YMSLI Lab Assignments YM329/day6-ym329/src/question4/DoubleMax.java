package question4;

import java.io.*;

public class DoubleMax {

	public static void main(String[] args) {
		
		File dataFilePath = new File("C:\\Users\\Paras\\eclipse-workspace\\day6-ym329\\src\\question4\\DataFile");
		
		try(BufferedReader br = new BufferedReader(new FileReader(dataFilePath))) {			
			double res = -1.0;
			String temp = null;
			while((temp = br.readLine())!=null) {
				if(res < Double.parseDouble(temp)) {
					res = Double.parseDouble(temp);
				}
			}
			System.out.println(res);
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex.getStackTrace());
		}
		catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
		
	}

}