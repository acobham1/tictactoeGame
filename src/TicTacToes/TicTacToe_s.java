/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;




/**
 *
 * @author aleac
 * @author norrisw
 * @author raquelh
 *
 */



public class TicTacToe_s extends javax.swing.JFrame
{
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean isWinner = false;
    
    ActionListener isTieListener = new ActionListener() 
    {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                //if there is no winner and all fields are filled...there is a tie
                if(!isWinner && 
                        (!jButton1.getText().isEmpty() && 
                        !jButton2.getText().isEmpty() && 
                        !jButton3.getText().isEmpty() && 
                        !jButton4.getText().isEmpty() && 
                        !jButton5.getText().isEmpty() && 
                        !jButton6.getText().isEmpty() &&
                        !jButton7.getText().isEmpty() && 
                        !jButton8.getText().isEmpty() && 
                        !jButton9.getText().isEmpty()
                        )
                ) 
                {   
                    System.out.println("There is a tie!");
                    JOptionPane.showMessageDialog(frame, "Boohoo You Tied", "Tic Tac Toe: The Game", 
                JOptionPane.OK_OPTION);
                    
                    
                    resetGameboard();
                    
                }
                else{
                    System.out.println("Do is tie check");
                }
                

            }
        };


    
    

    
    /**
     * Creates new form TicTacToe_s
     */
    public TicTacToe_s() 
    {
        
        
        initComponents();
        
//        customizeUI();
        setSize(1200,600);                  //makes the frame bigger; before only the title would pop up in the window
        setLocationRelativeTo(null);        //which means that it's centered
        
    }
    
    private void gameScore()
    {
        jblPlayerX.setText(String.valueOf(xCount));
        jblPlayerO.setText(String.valueOf(oCount));
    }
    
    private void choose_A_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }

    private void winnerCheck() 
    {
        
        String bt1 = jButton1.getText();
        String bt2 = jButton2.getText();
        String bt3 = jButton3.getText();
        
        String bt4 = jButton4.getText();
        String bt5 = jButton5.getText();
        String bt6 = jButton6.getText();
        
        String bt7 = jButton7.getText();
        String bt8 = jButton8.getText();
        String bt9 = jButton9.getText();
        
        
        
        //CHECK IF X IS THE WINNER
        
        //if first row is X - (1,2,3)
        if(bt1 == ("X") && bt2 == ("X") && bt3 == ("X"))
        {

            //flip the is winner boolean to show that this user has won
            isWinner = true;
             jButton1.setBackground(Color.YELLOW);
            jButton2.setBackground(Color.YELLOW);
            jButton3.setBackground(Color.YELLOW);
//            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe: The Game", JOptionPane.INFORMATION_MESSAGE);

            

            

            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins.Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){

                resetGameboard();
//                    //if yes
//                    jButton1.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton2.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton3.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

                    
                    
        }
    }
      
        
        //2nd row is x - (4,5,6)
            else if(bt4 == ("X") && bt5 == ("X") && bt6 == ("X"))
        {
           
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            xCount++;
            gameScore();
            
            jButton4.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){

//                    //if yes
                resetGameboard();
//                    jButton4.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton6.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

                    
                    
                    
        }
        }
        
        //3rd row is x - (7,8,9)
            else if(bt7 == ("X") && bt8 == ("X") && bt9 == ("X"))
        {
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            xCount++;
            gameScore();
            jButton7.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
//                   
                    //if yes
                    resetGameboard();
//                    jButton7.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton8.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton9.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

                   
                    

        }
        }
                
        //1st column is x (1,4,7)
            else if(bt1 == ("X") && bt4 == ("X") && bt7 == ("X"))
        {

            isWinner = true;
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe: The Game", JOptionPane.INFORMATION_MESSAGE);

            xCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton4.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
//                    //if yes
                resetGameboard();
//                    jButton1.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton4.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton7.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

                    
                    
        }
        }
        
        //2nd column is x (2,5,8)
            else if(bt2 == ("X") && bt5 == ("X") && bt8 == ("X"))
        {
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            xCount++;
            gameScore();
            jButton2.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    resetGameboard();
//                    jButton2.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton8.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

                    
                    
        }
        }
        
         //3rd column is x (3,6,9)
            else if(bt3 == ("X") && bt6 == ("X") && bt9 == ("X"))
        {
            
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            xCount++;
            gameScore();
            jButton3.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
//                    //if yes
                resetGameboard();
//                    jButton3.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton6.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton9.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

                    
                   
        }
        }
        
          //if diagonal is X starting from jButton1 or jButton9 (1,5,9)
            else if(bt1 == ("X") && bt5 == ("X") && bt9 == ("X"))
        {
            
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            xCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins.Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
//                    //if yes
                    resetGameboard();
//                    jButton1.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton9.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

                    
                    
        }
        }
        //if diagonal is X starting from jButton3 o4 jButton7 (3,5,7)
            else if(bt3 == ("X") && bt5 == ("X") && bt7 == ("X"))
        {
           
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            xCount++;
            gameScore();
            jButton3.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
//                    //if yes
                    resetGameboard();
//                    jButton3.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton7.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

//                   
                 
        }
        }
        
            
            
         //CHECK IF O IS THE WINNER
            
        //if first row is O (1,2,3)
            else if(bt1 == ("O") && bt2 == ("O") && bt3 == ("O"))
        {
           
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            oCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton2.setBackground(Color.YELLOW);
            jButton3.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
//                    //if yes
                        resetGameboard();
//                    jButton1.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton2.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton3.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

//                    
                  
        }
        }
        
        //2nd row is o (4,5,6)
            else if(bt4 == ("O") && bt5 == ("O") && bt6 == ("O"))
        {
            
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            oCount++;
            gameScore();
            jButton4.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
//                    //if yes
                        resetGameboard();
//                    jButton4.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton6.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

                   
                   
        }
        }
        
        //3rd row is o (7,8,9)
            else if(bt7 == ("0") && bt8 == ("O") && bt9 == ("O"))
        {
          
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            oCount++;
            gameScore();
            jButton7.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
//                    //if yes
                    resetGameboard();
//                    jButton7.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton8.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton9.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

                    
        }
        }
                
        //1st column is o (1,4,7)
            else if(bt1 == ("O") && bt4 == ("O") && bt7 == ("O"))
        {
                 
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            oCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton4.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O win. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
//                    //if yes
                        resetGameboard();
//                    jButton1.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton4.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton7.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

//              
                   
        }
        }
        
        //2nd column is o  (2,5,8)
       else if(bt2 == ("O") && bt5 == ("O") && bt8 == ("O"))
        {
           
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            oCount++;
            gameScore();
            jButton2.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
//                    //if yes
                resetGameboard();
//                    jButton2.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton8.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

                  
                    
        }
        }
        
         //3rd column is o (3,6,9)
            else if(bt3 == ("O") && bt6 == ("O") && bt9 == ("O"))
        {
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            oCount++;
            gameScore();
            jButton3.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);

            jButton9.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
//                    //if yes
                       resetGameboard();
//                    jButton3.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton6.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton9.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

//                    
                    
        }
        }
        
          //if diagonal is o starting from jButton1 or jButton9 (1,5,9)
        if(bt1 == ("O") && bt5 == ("O") && bt9 == ("O"))
        {
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            oCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
//                    //if yes
                    resetGameboard();
//                    jButton1.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton9.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

                   
                    
        }
        }
        
        //if diagonal is o starting from jButton3 or 7  (3,5,7)
        else if(bt3 == ("O") && bt5 == ("O") && bt7 == ("O"))
        {
            //flip the is winner boolean to show that this user has won
            isWinner = true;
            oCount++;
            gameScore();
            jButton3.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
//                    //if yes
                       resetGameboard();
//                    jButton3.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
//                    jButton7.setBackground(new java.awt.Color(240, 240, 240));
//                    
//                    //resets text of each button
//                    jButton1.setText(" ");
//                    jButton2.setText(" ");
//                    jButton3.setText(" ");
//                    jButton4.setText(" ");
//                    jButton5.setText(" ");
//                    jButton6.setText(" ");
//                    jButton7.setText(" ");
//                    jButton8.setText(" ");
//                    jButton9.setText(" ");
//                    

                    
                    

        }
        }
        
    
        //if user wins, disable gameboard
        if(isWinner)
        {
            disableGameboard();
        }
        
    }
    
    
    private void disableGameboard()
    {
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }
    
    private void enableGameboard()
    {
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
    }
        
        
        
        
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        freeFloatPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jblPlayerX = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jblPlayerO = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        exit_btn = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe: The Game");

        jSplitPane1.setVisible(true);
        jSplitPane1.setMinimumSize(new Dimension(1000, getHeight()));
        jSplitPane1.setDividerLocation(600);
        Float weight =  ((float)600/900);
        System.out.println("width: "+jSplitPane1.getWidth());

        jSplitPane1.setResizeWeight(weight);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        //jPanel2.setPreferredSize(new Dimension(640, 380));
        jPanel2.setMinimumSize(new Dimension(800,200));

        jPanel2.setLayout(new java.awt.GridLayout(3, 3, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(isTieListener);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(isTieListener);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(isTieListener);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);


        // jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        // jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Player X:");
        // jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        // jPanel2.add(jPanel6);

        // jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        // jPanel7.setLayout(new java.awt.BorderLayout());

        jblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerX.setText("0");
        // jPanel7.add(jblPlayerX, java.awt.BorderLayout.CENTER);

        // jPanel2.add(jPanel7);


        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.addActionListener(isTieListener);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(isTieListener);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.addActionListener(isTieListener);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);


        // jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        // jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("Player O:");
        // jPanel11.add(jLabel3, java.awt.BorderLayout.CENTER);

        // jPanel2.add(jPanel11);

        // jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        // jPanel12.setLayout(new java.awt.BorderLayout());

        jblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerO.setText("0");
        // jPanel12.add(jblPlayerO, java.awt.BorderLayout.CENTER);

        // jPanel2.add(jPanel12);


        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.addActionListener(isTieListener);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(isTieListener);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.addActionListener(isTieListener);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jSplitPane1.setLeftComponent(jPanel2);

        freeFloatPanel.setPreferredSize(new Dimension(50, 50));
        freeFloatPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        freeFloatPanel.setMaximumSize(new Dimension(50,50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Player X:");
        freeFloatPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerX.setText("0");
        freeFloatPanel.add(jblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("Player O:");
        freeFloatPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerO.setText("0");
        freeFloatPanel.add(jblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));
        freeFloatPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 95, -1, -1));

        exit_btn.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        exit_btn.setText("Exit");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });
        freeFloatPanel.add(exit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        reset_btn.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        reset_btn.setText("Reset");
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });
        freeFloatPanel.add(reset_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jSplitPane1.setRightComponent(freeFloatPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jToolBar1.setRollover(true);
        jPanel1.add(jToolBar1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


//    private void addActionListenerForIsTie()
//    {
//        
//        
//        
//        jButton1.addActionListener(isTieListener);
//        jButton2.addActionListener(isTieListener);
//        jButton3.addActionListener(isTieListener);
//        jButton4.addActionListener(isTieListener);
//        jButton5.addActionListener(isTieListener);
//        jButton6.addActionListener(isTieListener);
//        jButton7.addActionListener(isTieListener);
//        jButton8.addActionListener(isTieListener);
//        jButton9.addActionListener(isTieListener);
//                  
//    }
    
    
//    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        // TODO add your handling code here:
//        jButton2.setText(startGame);
//        if(startGame.equalsIgnoreCase("X"))
//        {
//            jButton2.setForeground(Color.GREEN);
//            
//        }
//        else
//        {
//            jButton2.setForeground(Color.BLUE);
//        }
//        choose_A_Player();
//        winnerCheck();
//    }                                        
private JFrame frame;
    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        //Creates small popup frame to asks the users to confirm 
        //exiting the game
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the game?", "Warning!", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            
            System.exit(0);
        }
        
    }//GEN-LAST:event_exit_btnActionPerformed

//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        
//        System.out.println("Button one action performed!");
//        jButton1.setText(startGame);
//        if(startGame.equalsIgnoreCase("X"))
//        {
//            jButton1.setForeground(Color.GREEN);
//        }
//        else
//        {
//            jButton1.setForeground(Color.BLUE);
//        }
//        choose_A_Player();
//        winnerCheck();
//    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(Color.GREEN);
        }
        else
        {
            jButton3.setForeground(Color.BLUE);
        }
        choose_A_Player();
        winnerCheck();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton4.setForeground(Color.GREEN);
        }
        else
        {
            jButton4.setForeground(Color.BLUE);
        }
        choose_A_Player();
        winnerCheck();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton5.setForeground(Color.GREEN);
        }
        else
        {
            jButton5.setForeground(Color.BLUE);
        }
        choose_A_Player();
        winnerCheck();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton6.setForeground(Color.GREEN);
        }
        else
        {
            jButton6.setForeground(Color.BLUE);
        }
        choose_A_Player();
        winnerCheck();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton7.setForeground(Color.GREEN);
        }
        else
        {
            jButton7.setForeground(Color.BLUE);
        }
        choose_A_Player();
        winnerCheck();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(Color.GREEN);
        }
        else
        {
            jButton8.setForeground(Color.BLUE);
        }
        choose_A_Player();
        winnerCheck();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton9.setForeground(Color.GREEN);
        }
        else
        {
            jButton9.setForeground(Color.BLUE);
        }
        choose_A_Player();
        
        
        winnerCheck();
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
       
       resetGameboard();
        
        
        
    }//GEN-LAST:event_reset_btnActionPerformed
    private void resetGameboard()
    {
         // clear the board
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        //set the background color back to clear
        jButton1.setBackground(Color.lightGray);
        jButton2.setBackground(Color.lightGray);
        jButton3.setBackground(Color.lightGray);
        jButton4.setBackground(Color.lightGray);
        jButton5.setBackground(Color.lightGray);
        jButton6.setBackground(Color.lightGray);
        jButton7.setBackground(Color.lightGray);
        jButton8.setBackground(Color.lightGray);
        jButton9.setBackground(Color.lightGray);
        
        //reset isWinner Variable to false
        isWinner = false;
        enableGameboard();
        
         
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(Color.GREEN);
        }
        else
        {
            jButton2.setForeground(Color.BLUE);
        }
        choose_A_Player();
        
        
        winnerCheck();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.GREEN);
        }
        else
        {
            jButton1.setForeground(Color.BLUE);
        }
        choose_A_Player();
        
        
        winnerCheck();
    }//GEN-LAST:event_jButton1ActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_s().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_btn;
    private javax.swing.JPanel freeFloatPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel jblPlayerO;
    private javax.swing.JLabel jblPlayerX;
    private javax.swing.JButton reset_btn;
    // End of variables declaration//GEN-END:variables
}
