interface ITest{
	void testFunc();
}

@FunctionalInterface
interface MathInterface{
	double mathFunc(double v1, double v2);
	
}

class Tester implements ITest{
	@Override
	public void testFunc() {
		// TODO Auto-generated method stub
		System.out.println("An Example");
	}
}


public class FunctionalInterfaces {

	public static void main(String[] args) {
		ITest javaTest = new Tester(); //Old format..... 
		javaTest.testFunc();
				
		////////////////New way of implementing interfaces with only one method.....
		ITest jspTst = () -> {
			System.out.println("testing multiple lines");
			System.out.println("JSP Test implemented");
		};
		
		jspTst.testFunc();
		
		///////////////////////MathInterface implemented/////////////////////////
		MathInterface addFunc = (double v1, double v2) -> v1 + v2;
		MathInterface subFunc = (double v1, double v2) -> v1 - v2;
		System.out.println("The added value is " + addFunc.mathFunc(123,23));
		System.out.println("The Subtracted value is " + subFunc.mathFunc(123,23));
	}
}