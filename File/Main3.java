package File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		String[] lines = new String[] {"Um", "Dois", "Três"};
		String path = "c:\\ws-practice\\training-java\\newFile.txt";
		// nome novo de arquivo, caso insira um arquivo existente, será sobrescrito 
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine(); //quebra de linha
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// caso nao queira que ele seja sobrescrito, insira
	// (new FileWriter(path, true) 
}
