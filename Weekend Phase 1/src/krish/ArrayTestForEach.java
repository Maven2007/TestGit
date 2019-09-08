package krish;

public class ArrayTestForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];  // Defining the array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for (int i : a) {
			System.out.println(i);
		}
	}

}
