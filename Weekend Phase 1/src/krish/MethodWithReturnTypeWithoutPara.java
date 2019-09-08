package krish;

public class MethodWithReturnTypeWithoutPara {

	
	
	public int add() {
		
		int i=10;
		int j=20;
		
		int sum=i+j;
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithReturnTypeWithoutPara v=new MethodWithReturnTypeWithoutPara();
		
		int res=v.add();
		System.out.println(res);
	}

}
