import java.util.Scanner;

public class fizzBuzzMethods {

    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        int value = sysIn.nextInt();

        for( ; value > 1; value = value - 1)
        {
            fizz(value);
            buzz(value);
            System.out.println();
        }
    }

    private static void fizz(int number)
    {
        if( number % 2 == 0 )
            System.out.print("fizz");
    }

    private static void buzz(int number)
    {
        if( number % 3 == 0 )
            System.out.print("buzz");
    }
}
