/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToes;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aleac
 * https://www.youtube.com/watch?v=nOyPmAVtceQ&t=41s ***********************************************
 */
public class TicTacToe_s extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    
    /**
     * Creates new form TicTacToe_s
     */
    public TicTacToe_s() {
        initComponents();
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

    
    private void winnerCheck() //winningGame()
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
        
        
        //Check if X is the Winner
        
        //if first row is X - (1,2,3)
        if(bt1 == ("X") && bt2 == ("X") && bt3 == ("X"))
        {
            xCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton2.setBackground(Color.YELLOW);
            jButton3.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton1.setBackground(new java.awt.Color(240, 240, 240));
                    jButton2.setBackground(new java.awt.Color(240, 240, 240));
                    jButton3.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
    }
      
        
        //2nd row is x - (4,5,6)
            else if(bt4 == ("X") && bt5 == ("X") && bt6 == ("X"))
        {
             xCount++;
            gameScore();
            jButton4.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton4.setBackground(new java.awt.Color(240, 240, 240));
                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
                    jButton6.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
        
        //3rd row is x - (7,8,9)
            else if(bt7 == ("X") && bt8 == ("X") && bt9 == ("X"))
        {
             xCount++;
            gameScore();
            jButton7.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton7.setBackground(new java.awt.Color(240, 240, 240));
                    jButton8.setBackground(new java.awt.Color(240, 240, 240));
                    jButton9.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
                
        //1st column is x (1,4,7)
            else if(bt1 == ("X") && bt4 == ("X") && bt7 == ("X"))
        {
             xCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton4.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton1.setBackground(new java.awt.Color(240, 240, 240));
                    jButton4.setBackground(new java.awt.Color(240, 240, 240));
                    jButton7.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
        
        //2nd column is x (2,5,8)
            else if(bt2 == ("X") && bt5 == ("X") && bt8 == ("X"))
        {
             xCount++;
            gameScore();
            jButton2.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton2.setBackground(new java.awt.Color(240, 240, 240));
                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
                    jButton8.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
        
         //3rd column is x (3,6,9)
            else if(bt3 == ("X") && bt6 == ("X") && bt9 == ("X"))
        {
             xCount++;
            gameScore();
            jButton3.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton3.setBackground(new java.awt.Color(240, 240, 240));
                    jButton6.setBackground(new java.awt.Color(240, 240, 240));
                    jButton9.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
        
          //if diagonal is X starting from jButton1 or jButton9 (1,5,9)
            else if(bt1 == ("X") && bt5 == ("X") && bt9 == ("X"))
        {
            xCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton1.setBackground(new java.awt.Color(240, 240, 240));
                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
                    jButton9.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
        //if diagonal is X starting from jButton3 o4 jButton7 (3,5,7)
            else if(bt3 == ("X") && bt5 == ("X") && bt7 == ("X"))
        {
             xCount++;
            gameScore();
            jButton3.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player X wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton3.setBackground(new java.awt.Color(240, 240, 240));
                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
                    jButton7.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
        
         //Check if O is the Winner
        //if first row is O (1,2,3)
            else if(bt1 == ("O") && bt2 == ("O") && bt3 == ("O"))
        {
             oCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton2.setBackground(Color.YELLOW);
            jButton3.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton1.setBackground(new java.awt.Color(240, 240, 240));
                    jButton2.setBackground(new java.awt.Color(240, 240, 240));
                    jButton3.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
        
        //2nd row is o (4,5,6)
            else if(bt4 == ("O") && bt5 == ("O") && bt6 == ("O"))
        {
            oCount++;
            gameScore();
            jButton4.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton4.setBackground(new java.awt.Color(240, 240, 240));
                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
                    jButton6.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
        
        //3rd row is o (7,8,9)
            else if(bt7 == ("0") && bt8 == ("O") && bt9 == ("O"))
        {
            oCount++;
            gameScore();
            jButton7.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton7.setBackground(new java.awt.Color(240, 240, 240));
                    jButton8.setBackground(new java.awt.Color(240, 240, 240));
                    jButton9.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
                
        //1st column is o (1,4,7)
            else if(bt1 == ("O") && bt4 == ("O") && bt7 == ("O"))
        {
            
             oCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton4.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton1.setBackground(new java.awt.Color(240, 240, 240));
                    jButton4.setBackground(new java.awt.Color(240, 240, 240));
                    jButton7.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
        
        //2nd column is o  (2,5,8)
       else if(bt2 == ("O") && bt5 == ("O") && bt8 == ("O"))
        {
            oCount++;
            gameScore();
            jButton2.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton2.setBackground(new java.awt.Color(240, 240, 240));
                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
                    jButton8.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
        
         //3rd column is o (3,6,9)
            else if(bt3 == ("O") && bt6 == ("O") && bt9 == ("O"))
        {
            oCount++;
            gameScore();
            jButton3.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton3.setBackground(new java.awt.Color(240, 240, 240));
                    jButton6.setBackground(new java.awt.Color(240, 240, 240));
                    jButton9.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
        
          //if diagonal is o starting from jButton1 or jButton9 (1,5,9)
        if(bt1 == ("O") && bt5 == ("O") && bt9 == ("O"))
        {
            oCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton1.setBackground(new java.awt.Color(240, 240, 240));
                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
                    jButton9.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
        
        //if diagonal is o starting from jButton3 or 7  (3,5,7)
        else if(bt3 == ("O") && bt5 == ("O") && bt7 == ("O"))
        {
            oCount++;
            gameScore();
            jButton3.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
            
            frame = new JFrame("New Game");
            if(JOptionPane.showConfirmDialog(frame, "Player O wins. Do you want to play a new game?", "Tic Tac Toe: The Game", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    //if yes
                    jButton3.setBackground(new java.awt.Color(240, 240, 240));
                    jButton5.setBackground(new java.awt.Color(240, 240, 240));
                    jButton7.setBackground(new java.awt.Color(240, 240, 240));
                    
                    //resets text of each button
                    jButton1.setText(" ");
                    jButton2.setText(" ");
                    jButton3.setText(" ");
                    jButton4.setText(" ");
                    jButton5.setText(" ");
                    jButton6.setText(" ");
                    jButton7.setText(" ");
                    jButton8.setText(" ");
                    jButton9.setText(" ");
        }
        }
    }
        
        
        
        
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jblPlayerO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        reset_btn = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        exit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe: The Game");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
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
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Player X:");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerX.setText("jLabel4");
        jPanel7.add(jblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
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
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("Player O:");
        jPanel11.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerO.setText("jLabel5");
        jPanel12.add(jblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
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
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        reset_btn.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        reset_btn.setText("Reset");
        jPanel16.add(reset_btn, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        exit_btn.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        exit_btn.setText("Exit");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });
        jPanel17.add(exit_btn, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jblPlayerO;
    private javax.swing.JLabel jblPlayerX;
    private javax.swing.JButton reset_btn;
    // End of variables declaration//GEN-END:variables
}

