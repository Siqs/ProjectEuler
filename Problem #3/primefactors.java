import java.lang.Math;

public class primefactors
{
    public static void main(String[] args)
    {
        long targetnum = 600851475143L;
        int max = (int) Math.sqrt(targetnum);

        // using Sieve of Eratosthenes algorithm to get all prime
        // numbers lower than the square root of the target number
        boolean[] primes = new boolean[max + 1];
        // set every number (represented by the indexes) as prime (true)
        for (int i = 2; i <= max; i++) primes[i] = true;
        // then we get the first prime number and cross off all its
        // multiples 
        for (int i = 2; i <= max; i++)
        {
            if (primes[i])
            {
                for (int j = i * 2; j <= max; j += i)
                {
                    primes[j] = false;
                }
            }
        }
        // now that we have all the prime numbers, we check them 
        // back to front to get all the factors of the targeted number
        for (int i = max; i >= 2; i--)
        {
            if(primes[i])
            {
                if(targetnum % i == 0)
                {
                    System.out.println(i);
                }
            }
        }

    }
}