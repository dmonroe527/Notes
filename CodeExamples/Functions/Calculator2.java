import java.util.Scanner;

public class calculator2 
{
    private static double calculate(char opp, double x, double y) 
    {       
        switch (opp) 
        {
            case '+': 
                return x + y;   
            case '-': 
                return x - y;  
            case '*':  
                return x * y;   
            case '/':      
                return x / y; 
            case '%':     
                return x % y; 
        }     
        return 0.0; 
    }

    public static void main(String[] args) 
    {       
        System.out.println("This program will take a math opperator (+,-,*,/,%)" + 
                           " and then two numbers and return the result.");
        Scanner sysIn = new Scanner(System.in);
        
        char opp = sysIn.next().charAt(0);
        double first = sysIn.nextDouble(); 
        double second = sysIn.nextDouble();
        
        double result = calculate(opp, first, second);
        
        System.out.println("The answer is: " + result);
    }
}
