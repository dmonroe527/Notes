import java.util.Scanner;

public class ToBinary {

    private static void toBinary(int number)
    {
        if(number == 1)
            System.out.print( number );
        else
        {
            toBinary(number / 2);
            System.out.print(" " + number % 2);
        }
    }

    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        int number = sysIn.nextInt();
        toBinary(number);
    }
}
