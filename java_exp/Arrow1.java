class Arrow1{
static void leftpattern(int n)
{
	char s = ' ';
	char st = '*';


	for (int i = (n - 1) / 2; i > 0; i--)
	{
		string(i);
		System.out.println(st);
	}
	

	for (int i = 0; i < n; i++)
	{
		System.out.print("*");
	}
	System.out.println();


	for (int i = 1; i <= (n - 1) / 2; i++)
	{
		string(i);
		System.out.println(st);
	}
	System.out.println();
}
}