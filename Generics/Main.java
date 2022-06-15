package Generics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		AddGeneric<Integer> p1 = new AddGeneric<>();
		AddGeneric<String> p2 = new AddGeneric<>();
		
		System.out.println("How many things do you want to add?");
		int qt = scan.nextInt();
		
		for(int i = 0; i < qt; i++) {
			System.out.print("Type integer: ");
			Integer a = scan.nextInt();
			p1.addValue(a);
			
			System.out.print("Type string: ");
			String b = scan.next();
			p2.addValue(b);
		}
		
		System.out.println("----------- int list -----------");
		p1.print();
		System.out.println("---------- string list ---------");
		p2.print();
		
		scan.close();
	}
	
}