import java.util.Scanner;
public class calculator {    
	private static double add(Scanner sysIn)    
	{        
		double first, second;        
		first = sysIn.nextDouble();        
		second = sysIn.nextDouble();  
	
		return first + second;    
	} 
	
	private static double subtract(Scanner sysIn)   
	{        
		double first, second;        
		first = sysIn.nextDouble();        
		second = sysIn.nextDouble();        
	
		return first - second;    
	}
	
	private static double multiply(Scanner sysIn) 
	{	
		double first, second;    
		first = sysIn.nextDouble();   
		second = sysIn.nextDouble();   
	
		return first * second;   
	}
	
	private static double divide(Scanner sysIn)   
	{      
		double first, second;  
		first = sysIn.nextDouble();    
		second = sysIn.nextDouble();   
	
		return first / second;  
	} 
	
	private static double modulo(Scanner sysIn)  
	{      
		double first, second;   
		first = sysIn.nextDouble();    
		second = sysIn.nextDouble();   
	
		return first % second;  
	}
	
	public static void main(String[] args)
	{       
		System.out.println("This program will take a math opperator (+,-,*,/,%)" +    
											 " and then two numbers and return the result.");      
		Scanner sysIn = new Scanner(System.in);      
		char opp = sysIn.next().charAt(0);      
		double result = 0.0;    
		switch( opp )       
		{        
			case '+':        
				result = add(sysIn);    
				break;          
			case '-':             
				result = subtract(sysIn);  
				break;            
			case '*':            
				result = multiply(sysIn);  
				break;          
			case '/':            
				result = divide(sysIn);     
				break;           		
			case '%':          
				result = modulo(sysIn);  
				break;    
		}
		System.out.println("The answer is: " + result);  
	}
}
