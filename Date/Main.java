package Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
			Date atual = new Date(System.currentTimeMillis()); 
			
			System.out.println(sdf.format(atual));
		}

	}

}