package krish;

public class MethodsTestWithReturnTypeWithParameter {

	
	
	
	
	public int add(int i,int j) {
		
		int sum=i+j;
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsTestWithReturnTypeWithParameter v=new MethodsTestWithReturnTypeWithParameter();
		//v.add(30, 40); //calling a method with name it wont return any value
		
		
		int res=v.add(50, 60);// calling a method with variable name it will retuen a value
		
		System.out.println(res);
	}

}
