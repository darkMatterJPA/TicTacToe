package tictactoe;


public abstract class Player {
    
    private String name;
    private char symbol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    
    public Player() {
        
    }
    
    public Player(String name, char symbol) {
        System.out.println("In the Player constructor");
        this.name = name;
        this.symbol = symbol;
    }
    
    public String toString() {
        return "I am " + name;
    }
    
    public abstract void move(TicTacToe board);
}