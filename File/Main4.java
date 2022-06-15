package File;

import java.io.File;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Folder path: ");
		String newPath = scan.nextLine();
		
		File path = new File(newPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		// especifica quem é diretório ou pasta 
		System.out.println("Folders: ");
		for(File f : folders) {
			System.out.println(f);
		}
		
		boolean c = new File(newPath + "\\test").mkdir(); 
		// cria uma subpasta "test" a partir do caminho especificado "newPath"
		System.out.println("Created: " + c);
		scan.close();
	}

}

/*
Folder path: 
in: c:\ws-practice
out: Folders: 
c:\ws-practice\.metadata
c:\ws-practice\payroll-project
c:\ws-practice\training-java
*/