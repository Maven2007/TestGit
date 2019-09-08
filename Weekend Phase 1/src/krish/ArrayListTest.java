package krish;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> l=new ArrayList<>();
		l.add("Selenium");
		l.add("Krish");
		l.add("Infosys");
		l.add("Hyderabad");
		
		System.out.println(l.size()); // To print the size of an array
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i)); //To Print the elements in the array
		}
	}

}
