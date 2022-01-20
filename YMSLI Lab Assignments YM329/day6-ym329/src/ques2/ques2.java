 
package ques2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ques2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		try {			
			
			String fileStoryPath = "C:\\Users\\ve00ym329\\Documents\\lab assignments\\day6-ym329\\src\\ques2\\file story";
			BufferedReader text = new BufferedReader(new FileReader(fileStoryPath));
			
			String temp = null;
			
			while((temp=text.readLine()) != null) {
				
				String wordsArray[] = temp.split(" ");
				
				for(int i = 0; i < wordsArray.length; i++) {
					
					if( h1.containsKey(wordsArray[i]) ) {
						h1.put( wordsArray[i], h1.get(wordsArray[i]) + 1 );
					}
					
					else {
						h1.put(wordsArray[i], 1);
					}
					
				}
				
				temp = text.readLine();
			}
			
			text.close();
			
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		Set<Entry<String, Integer>> set = h1.entrySet();
		for (Entry<String, Integer> entry : set) {
			System.out.println("Word- " + entry.getKey() + " appears " + entry.getValue() + " times.");
		}
		
	}

}