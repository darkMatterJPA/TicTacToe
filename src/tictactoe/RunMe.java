/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author Alton Panton   &&    Michael Miller
 */
public class RunMe {
    
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        char choice=0;
        
        
        System.out.println("1.  Player vs. Player");
        System.out.println("2.  Player vs. Computer");
        System.out.println("Enter the number of your choice");
       
           choice = input.nextLine().charAt(0);
           
          while(!(choice=='1' || choice== '2'))
            {
                System.out.println("Error: Enter the number of your choice");
                
                choice = input.nextLine().charAt(0);
                
            }
                
        
        if(choice == '1')
            {
                Player player1 = new HumanPlayer();
                Player player2 = new HumanPlayer();
                System.out.println("Player vs. Player");
                System.out.println("Enter the name for player1");
                player1.setName(input.nextLine());
                System.out.println("Enter X or O (in Caps)");
                player1.setSymbol(input.nextLine().charAt(0));
                while(!(player1.getSymbol()== 'X'|| player1.getSymbol()=='O'))
                {
                    System.out.println("Error: Enter X or O (in Caps)");
                    player1.setSymbol(input.nextLine().charAt(0));
                    //System.out.println(player1.getSymbol());
                }
                
                        
                System.out.println("Enter the name for player2");
                player2.setName(input.nextLine());
                
                if(player1.getSymbol()=='X')
                {
                    player2.setSymbol('O');
                }
                else
                {
                    player2.setSymbol('X');
                }
                
                
                while(!(game.isGameOver()|| game.isTie()))
                {
                    player1.move(game);
                    player2.move(game);
                }

            }
        else
        {
            Player player1 = new HumanPlayer();
            Player player2 = new ComputerPlayer();
            System.out.println("Player vs. Computer");
            System.out.println("Enter the name for player1");
            player1.setName(input.nextLine());
            System.out.println("Enter X or O");
            player1.setSymbol(input.nextLine().charAt(0));
            
             while(!(player1.getSymbol()== 'X'|| player1.getSymbol()=='O'))
                {
                    System.out.println("Error: Enter X or O (in Caps)");
                    player1.setSymbol(input.nextLine().charAt(0));
                    //System.out.println(player1.getSymbol());
                }
                    
            if(player1.getSymbol()=='X')
            {
                player2.setSymbol('O');
            }
            else
            {
                player2.setSymbol('X');
            }
            
            while(true)
                {
                    player1.move(game);
                    player2.move(game);
                }
        }
        
    }
}
