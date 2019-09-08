package krish;

import java.util.Scanner;

public class switchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Read the input from Keyboard we use scanner class
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		 switch (n) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			break;
		}
		
		
	}

}
