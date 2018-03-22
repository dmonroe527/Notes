import java.util.Scanner;
public class tictactoe
{  

    private static void setUpBoard(int[][] board2)  
    {      
        for( int i=0; i<3; i++)     
            for(int j=0; j<3; j++)    
                board2[i][j] = 0; 
    }  

    private static void firstPlayerPlays(int location, int[][] board) 
    {    
        makePlay(location, board, 1); 
    }  

    public static int changePlayer(int player)  
    {      
        if( player == 1)  
            return 2;   
        else         
        return 1;   
    }  

    private static void makePlay(int location, int[][] board, int player) 
    {    
        board[(location-1) / 3][(location-1) % 3] = player; 
    }   

    private static boolean someOneHasWon(int[][] board, int currentPlayer) 
    {      
        for(int i = 0; i<3; i++)   
        {         
            if (    board[i][0] == currentPlayer &&               
                    board[i][1] == currentPlayer &&          
                    board[i][2] == currentPlayer)        
            {           
                return true;      
            }        
            if (    board[0][i] == currentPlayer &&               
                    board[1][i] == currentPlayer &&           
                    board[2][i] == currentPlayer)      
            {       
                return true;          
            }     
        }     
        if (    board[0][0] == currentPlayer &&            
                board[1][1] == currentPlayer &&      
                board[2][2] == currentPlayer)    
        {         
            return true; 
        }    
    
        if (    board[0][2] == currentPlayer &&      
                board[1][1] == currentPlayer &&          
                board[2][0] == currentPlayer)     
        {       
            return true;  
        }    
        return false;   
    }  

    private static boolean checkValidPlay(int placeToPlay, int[][] board)  
    {     
        if( board[(placeToPlay-1) / 3][(placeToPlay-1) %3] == 0)        
            return true;     
        return false;  
    } 

    public static void displayResults(int[][] board) 
    {      
        if( someOneHasWon(board, 1) )       
            System.out.println("Player 1 has won!");      
        else if( someOneHasWon( board, 2))         
            System.out.println("Player 2 has won!");     
        else       
            System.out.println("The game is a draw."); 
    }
    
    public static void main(String[] args)  
    {     
        Scanner sysIn = new Scanner(System.in);  
        int[][] board = new int[3][3];       
        int playLocation, currentPlayer = 1;    

        setUpBoard(board);  
        playLocation = sysIn.nextInt();       

        firstPlayerPlays(playLocation, board);     
        int turns = 1;   
        boolean invalidPlay = false;     

        while( !someOneHasWon(board, currentPlayer) && turns<=9 && !invalidPlay)    
        {      
            currentPlayer = changePlayer(currentPlayer); 
            for(int i=0; i<3; i++) 
            {          
                for (int j = 0; j < 3; j++)                
                    System.out.print(board[i][j]);     
                System.out.println();        
            }
            playLocation = sysIn.nextInt();    
            if( checkValidPlay(playLocation, board) )         
                makePlay(playLocation, board, currentPlayer);        
            else        
            {         
                System.out.println("Not a valid play!");        
                invalidPlay = true;          
            }      
        }      
        if( ! invalidPlay )           
            displayResults(board);    
    }
}
