public class PrimalityTest
{
    public static void main(String[] args)
    {
        long current_local_time = System.currentTimeMillis();
        long long_number = Long.parseLong(args[0]);;
        long long_a;
        long long_b;
        if (long_number < 2)
        {
            System.out.println(long_number + " is not a prime number");
        }
        else if (long_number < 4)
        {
            System.out.println(long_number + " is a prime number");
        }
        else if (long_number % 2 == 0)
        {
            System.out.println(long_number + " is not a prime number and is divisible by 2");
        }
        else
        {
            long_a = (long) (Math.ceil(Math.sqrt(long_number)));
            terminate_loop:
            {
                for (long_b = 3; long_b <= long_a; long_b += 2)
                {
                    if (long_number % long_b == 0)
                    {
                        System.out.println(long_number + " is not a prime number and is divisible by " + long_b);
                        break terminate_loop;
                    }
                }
                System.out.println(long_number + " is a prime number");
            }
        }
        System.out.println("elapsed time: " + (System.currentTimeMillis() - current_local_time) + " millisecond/s");
    }
}