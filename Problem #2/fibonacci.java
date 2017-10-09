public class fibonacci
{
	public static void main(String[] args)
	{
		int count = 0;
		int aux = 0;
		int fib1 = 1;
		int fib2 = 2;

		while(fib1 <= 4000000)
		{
			if(fib1 % 2 == 0)
			{
				count += fib1;
			}
			aux = fib1 + fib2;
			fib1 = fib2;
			fib2 = aux;
		}

		System.out.println(count);
	}
}