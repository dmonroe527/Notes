import java.util.Scanner;

public class fiboRecursive {

    private static long fibo(int number)
    {
        System.out.print(number + " ");
        if( number < 2)
            return 1;
        return fibo(number-1) + fibo(number-2);
    }
    
    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        int number = sysIn.nextInt();
        long result = fibo(number);

        System.out.println( );
        System.out.println( result );
    }
}
