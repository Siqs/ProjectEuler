using System;
    class MainClass
    {
        public static void Main(string[] args)
	{
		int count = 0;
		int aux = 0;
		int fib1 = 1;
		int fib2 = 2;
		while (fib1 <= 4000000)
		{
			if (fib1 % 2 == 0) count += x;
                	aux = fib1 + fib2;
                	fib1 = fib2;
                	fib2 = aux;
		}
            	Console.WriteLine(count);
        }
    }
}
