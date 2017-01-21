package tictactoe;

public class TicTacToe {
    
    private char[][] board;
    protected int count =0;
    
    public TicTacToe() {
        board = new char[3][3];
        
        int count = 1;
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                String s = "" + count++;
                board[i][j] = s.charAt(0);
            }
        }
    }
    
    public boolean move(int row, int col, char symbol) {
        
        if (row < 0 || row > 2 || col < 0 || col > 2 || 
                (symbol != 'X' && symbol != 'O')) {
            return false;
        }
        
        if (Character.isDigit(board[row][col])) { // if this isn't an X or O...
            board[row][col] = symbol;
            return true;
        }
        
        return false;
    }
    
    public boolean move(int square, char symbol) {
        // figure out row and col
        // square = 1, 4, 7 => col = 0
        // square = 2, 5, 8 => col = 1
        // square = 3, 6, 9 => col = 2
        int row = (square - 1) / 3;
        int col = (square - 1) % 3;
        return move(row, col, symbol);
    }
    
    public boolean isGameOver() {
        // true if all squares are filled 
        // or if three of the same symbol horizontally, vertically, or diagonally
        // false otherwise
        
        
        for (int i = 0; i < board.length; i++) 
        {
            for (int j = 0; j < board[i].length; j++) 
            {
                
                //check col
                if ((board[i][board[i].length-3]==board[i][board[i].length-2])&& (board[i][board[i].length-1]==board[i][board[i].length-2]))
                {  
                    System.out.println("Player "+board[i][j]+" is the winner");
                    return true;
                }
                //row
                else if((board[board.length-3][j]==board[board.length-2][j])&& (board[board.length-1][j]==board[board.length-2][j]))
                {
                  System.out.println("Player "+board[i][j]+" is the winner");
                    return true;
                }
                else if((board[1][1]==board[0][0]) && (board[2][2]==board[0][0]))
                {
                     System.out.println("Player "+board[i][j]+" is the winner");
                    return true;
                }
                else if((board[1][1]==board[0][2]) && (board[2][0]==board[0][2]))
                {
                    System.out.println("Player "+board[i][j]+" is the winner");
                    return true;
                }
                
                
            }
        }
        
        
        
        
        
        return false;
    }
    
    public boolean isTie()
    {
        
         int count = 0;
        for (int i = 0; i < board.length; i++) 
        {
            for (int j = 0; j < board[i].length; j++) 
            {
              if(board[i][j]== 'X' || board[i][j]=='O')
              {
                  count++;
              }
            }
        }
        
        if(count == 9)
        {
            System.out.println("Game ended in a tie");
            return true;
        }
        
        
        return false;
    }
    
    public void display() {
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

   
}
