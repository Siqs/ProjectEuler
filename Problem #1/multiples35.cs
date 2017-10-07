using System;

class MainClass
{
    public static void Main(string[] args)
    {
    int count = 0;
    for (int i = 0; i < 1000; i++)
    {
        if(i % 3 == 0 || i % 5 == 0)
        {
            count += i;   
        }
    }
    Console.WriteLine(count);
    }
}

