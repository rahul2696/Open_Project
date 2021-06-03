class Test{
	String name;
	//construct the object so that we can use the object without an explicit call any function.	
	Test(){
		name = "Valid Name";
	}

	Test(String name){
		this.name = name;
	}
}

class Apple{
	Apple(String color){
		System.out.println("Base Apple with color: " + color);
	}
	Apple(){
		System.out.println("Base Apple");
	}
}

class KashmirApple extends Apple{
	KashmirApple(){
		super("red");
		System.out.println("Kashmir Apple");
	}
}

class ConsstructorDemo{
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.name);

		//Create the instance and check the output......
	}
}
