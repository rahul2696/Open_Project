
class Test
{
	int x;
	Test(int i) { x = i; }
	Test()	 { x = 0; }
}

class CallByValue
{
	public static void main(String[] args)
	{
		
		Test t = new Test(40);

		
		change(t);

		
		System.out.println(t.x);
	}
	public static void change(Test t)
	{
		
		t = new Test();

		
	}
}
