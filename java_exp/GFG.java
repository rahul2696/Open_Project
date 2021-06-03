
class Arrow
{


static void rightpattern(int n)
{

	int c1 = (n - 1) / 2;


	int c2 = 3 * n / 2 - 1;

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{



			if (j - i == c1 ||
				i + j == c2 || i == c1)
			{
				System.out.print("*");
			} 
			else
			{
				System.out.print(" ");
			}
		}
		
		System.out.print("\n");
	}
}

static void string(int n)
{
	for (int i = n; i > 0; i--)
	{
		System.out.print(" ");
	}
}


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


public static void main(String args[])
{
	int n = 9; // Must be odd


	rightpattern(n);

	System.out.println("\n");

	
	leftpattern(n);
}
}


