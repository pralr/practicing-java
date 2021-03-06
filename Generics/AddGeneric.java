package Generics;

import java.util.ArrayList;
import java.util.List;

public class AddGeneric<T> {
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public void print() {
		for(T generic : list) {
			System.out.println(generic);
		}
	}
}