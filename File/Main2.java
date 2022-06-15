package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		
		String path = "c:\\ws-practice\\training-java\\file.txt";
		FileReader fr =  null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine(); 
			
			while(line !=null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			
			try {
				if(br !=null) {
					br.close();
				}
				
				if(fr != null) {
					fr.close();
				} 
			} catch(IOException e) {
				e.printStackTrace();
				}
			}
		}
	}