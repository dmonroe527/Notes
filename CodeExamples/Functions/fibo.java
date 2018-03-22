import java.util.Scanner;

public class fibo 
{    
  public static void main(String[] args)    
  {       
    Scanner sysIn = new Scanner(System.in);        
    int number = sysIn.nextInt();        
    if( number >= 0 )       
    {            
      if( number < 2)           
        System.out.print("1");      
      else {      
        long[] calculate = new long[number + 1];    
        calculate[0]=1;          
        calculate[1]=1;         
        for( int i = 2; i< number+1; i++)     
        {               
          calculate[i] = calculate[i-1] + calculate[i-2];   
        }            
        System.out.println(calculate[number]);    
      }    
    }       
    else        
      System.out.println("You must enter an integer that is not negative."); 
  }
}
