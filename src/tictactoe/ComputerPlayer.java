package tictactoe;

public class ComputerPlayer extends Player {

    public ComputerPlayer() {
       
    }
    
    public ComputerPlayer(String name, char symbol) {
        super(name, symbol);
        
    }
    
    public void move(TicTacToe board) {
        // generate a random number between 1 and 9
        // try to move there
        // repeat until successful
        
        boolean successfulMove = false;
        while (!successfulMove) {
            int move = (int) (Math.random() * 9 + 1);
            successfulMove = board.move(move, getSymbol());
        }
        System.out.println("Computer Player moved.");
        board.display();
       if((board.isGameOver()|| board.isTie()))
                {
                    System.exit(0);
                }
    }
    
    public String toString() {
        return "I am " + getName() + " and I am awesome";
    }
    
    public void compute() {
        System.out.println("Does not compute!");
    }
    
   
}