package krish;

import java.util.ArrayList;

public class ArrayListForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> l=new ArrayList<>();
		l.add("Selenium");
		l.add("Krish");
		l.add("Infosys");
		l.add("Hyderabad");
		
		System.out.println(l.size());
		
		for (String item : l) {
			System.out.println(item);
		}
	}

}
