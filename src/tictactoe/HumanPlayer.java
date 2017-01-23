/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author Dark Nebula
 */
public class HumanPlayer extends Player {

    public HumanPlayer() {
    }

    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

    
    
    
    @Override
    public void move(TicTacToe board) {
        
        Scanner input = new Scanner(System.in);
        if(board.count==0)
        {
            board.display();
            board.count++;
        }
        
        System.out.println(super.getName()+ ", where would you like to move? (enter a number 1-9)");
         char space = input.nextLine().charAt(0);
         
         boolean unsuccessfulMove = board.move(space, getSymbol());
               
        
        while (!unsuccessfulMove) {
            
            System.out.println("Error, Try again");
            
            System.out.println(super.getName()+ ", where would you like to move? (enter a number 1-9)");
            space = input.nextLine().charAt(0);
            unsuccessfulMove = board.move(space, getSymbol());
        }
        
        
        System.out.println(getName()+" Moved.");
        board.display();
        
        if((board.isGameOver()|| board.isTie()))
                {
                    System.exit(0);
                }
        
    }// end of class 
    
    
    
    
    
    
    
    
}
