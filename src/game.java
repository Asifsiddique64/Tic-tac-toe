/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asif siddique
 */
public class game extends javax.swing.JFrame {

    int p1=0;
    int p2=1;
    int b1=0,b2=0,b3=0,b4=0,b5=0,b6=0,b7=0,b8=0,b9=0;
    int p1win=0,p2win=0;
    int draw=0;
    String name1;
    String name2;
    
    

    public game() {
        initComponents();
    }
    //QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ
    //WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW
    //TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
    //THE FUNCTION
    
    
    
    void checker()
    {
        
        
        
        result ob=new result();
        Name_Taker obj2=new Name_Taker();
        
        //...............................................................................................
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        if(one.getText()=="X" && two.getText()=="X" && three.getText()=="X")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name1);
                //ob.player2.setText(name2);
                p1win=1;
        }
                if(one.getText()=="X" && four.getText()=="X" && seven.getText()=="X")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name1);
                //ob.player2.setText(name2);
                p1win=1;
        }
                if(one.getText()=="X" && five.getText()=="X" && nine.getText()=="X")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name1);
                //ob.player2.setText(name2);
                p1win=1;
        }
                if(two.getText()=="X" && five.getText()=="X" && eight.getText()=="X")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name1);
                //ob.player2.setText(name2);
                p1win=1;
        }
                if(three.getText()=="X" && six.getText()=="X" && nine.getText()=="X")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name1);
                //ob.player2.setText(name2);
                p1win=1;
        }
                 if(four.getText()=="X" && five.getText()=="X" && six.getText()=="X")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name1);
                //ob.player2.setText(name2);
                p1win=1;
        }
           if(seven.getText()=="X" && eight.getText()=="X" && nine.getText()=="X")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name1);
                //ob.player2.setText(name2);
                p1win=1;
        }
                   if(three.getText()=="X" && five.getText()=="X" && seven.getText()=="X")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name1);
                //ob.player2.setText(name2);
                p1win=1;
        }
                   
   //OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
   //OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
   //OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
           if(one.getText()=="O" && two.getText()=="O" && three.getText()=="O")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name2);
                //ob.player2.setText(name1);
                p2win=1;
        }
                if(one.getText()=="O" && four.getText()=="O" && seven.getText()=="O")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name2);
                //ob.player2.setText(name1);
                p2win=1;
        }
                if(one.getText()=="O" && five.getText()=="O" && nine.getText()=="O")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name2);
                //ob.player2.setText(name1);
                p2win=1;
        }
                if(two.getText()=="O" && five.getText()=="O" && eight.getText()=="O")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name2);
                //ob.player2.setText(name1);
                p2win=1;
        }
                if(three.getText()=="O" && six.getText()=="O" && nine.getText()=="O")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name2);
                //ob.player2.setText(name1);
                p2win=1;
        }
                 if(four.getText()=="O" && five.getText()=="O" && six.getText()=="O")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name2);
                //ob.player2.setText(name1);
                p2win=1;
        }
           if(seven.getText()=="O" && eight.getText()=="O" && nine.getText()=="O")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name2);
                //ob.player2.setText(name1);
                p2win=1;
        }
                   if(three.getText()=="O" && five.getText()=="O" && seven.getText()=="O")
        {
                ob.setVisible(true);
                this.setVisible(false);
                
                ob.player.setText(name2);
                //ob.player2.setText(name1);
                p2win=1;
        }

    //////////////////////////////////////////////////////////////////////////////////////////
    //Dwar
    if(draw==9 && p1win==0 && p2win==0)
    {
        ob.setVisible(true);
        this.setVisible(false);
        ob.player.setText("Nobody");
    }
    
    
    }
    
    

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    //##################################################################################################################
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        player1 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        retry = new javax.swing.JButton();
        player2 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        wallpar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 153, 0));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(null);

        reset.setBackground(new java.awt.Color(0, 29, 0));
        reset.setFont(new java.awt.Font("French Script MT", 1, 36)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("O");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset);
        reset.setBounds(360, 0, 60, 60);

        player1.setFont(new java.awt.Font("Chiller", 0, 50)); // NOI18N
        player1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(player1);
        player1.setBounds(90, 130, 230, 80);

        icon.setFont(new java.awt.Font("Chiller", 0, 100)); // NOI18N
        icon.setForeground(new java.awt.Color(255, 255, 255));
        icon.setText("O");
        jPanel2.add(icon);
        icon.setBounds(300, 140, 50, 70);

        retry.setBackground(new java.awt.Color(52, 0, 0));
        retry.setFont(new java.awt.Font("Chiller", 1, 60)); // NOI18N
        retry.setForeground(new java.awt.Color(255, 255, 255));
        retry.setText("<");
        retry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryActionPerformed(evt);
            }
        });
        jPanel2.add(retry);
        retry.setBounds(0, 0, 63, 60);

        player2.setFont(new java.awt.Font("Chiller", 0, 50)); // NOI18N
        player2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(player2);
        player2.setBounds(90, 50, 230, 80);

        icon1.setFont(new java.awt.Font("Chiller", 0, 80)); // NOI18N
        icon1.setForeground(new java.awt.Color(255, 255, 255));
        icon1.setText("X");
        jPanel2.add(icon1);
        icon1.setBounds(300, 60, 50, 70);

        wallpar.setIcon(new javax.swing.ImageIcon("D:\\UAP\\103\\CSE\\javatute\\Tic tac toe\\Black polygon with red edges Wallpaper 1202.jpg")); // NOI18N
        jPanel2.add(wallpar);
        wallpar.setBounds(1, 0, 420, 240);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        one.setBackground(new java.awt.Color(0, 102, 51));
        one.setFont(new java.awt.Font("Gill Sans MT", 0, 130)); // NOI18N
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        jPanel1.add(one);
        one.setBounds(0, 0, 140, 140);

        two.setBackground(new java.awt.Color(0, 102, 51));
        two.setFont(new java.awt.Font("Gill Sans MT", 0, 130)); // NOI18N
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        jPanel1.add(two);
        two.setBounds(140, 0, 140, 140);

        three.setBackground(new java.awt.Color(0, 102, 51));
        three.setFont(new java.awt.Font("Gill Sans MT", 0, 130)); // NOI18N
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        jPanel1.add(three);
        three.setBounds(280, 0, 140, 140);

        four.setBackground(new java.awt.Color(0, 102, 51));
        four.setFont(new java.awt.Font("Gill Sans MT", 0, 130)); // NOI18N
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        jPanel1.add(four);
        four.setBounds(0, 140, 140, 140);

        five.setBackground(new java.awt.Color(0, 102, 51));
        five.setFont(new java.awt.Font("Gill Sans MT", 0, 130)); // NOI18N
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        jPanel1.add(five);
        five.setBounds(140, 140, 140, 140);

        six.setBackground(new java.awt.Color(0, 102, 51));
        six.setFont(new java.awt.Font("Gill Sans MT", 0, 130)); // NOI18N
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        jPanel1.add(six);
        six.setBounds(280, 140, 140, 140);

        seven.setBackground(new java.awt.Color(0, 102, 51));
        seven.setFont(new java.awt.Font("Gill Sans MT", 0, 130)); // NOI18N
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        jPanel1.add(seven);
        seven.setBounds(0, 280, 140, 140);

        eight.setBackground(new java.awt.Color(0, 102, 51));
        eight.setFont(new java.awt.Font("Gill Sans MT", 0, 130)); // NOI18N
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        jPanel1.add(eight);
        eight.setBounds(140, 280, 140, 140);

        nine.setBackground(new java.awt.Color(0, 102, 51));
        nine.setFont(new java.awt.Font("Gill Sans MT", 0, 130)); // NOI18N
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        jPanel1.add(nine);
        nine.setBounds(280, 280, 140, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //$$$$$$$$$$$$$$$$$$$$$$$$$$
    //BUTTTTTTTTTTTTTTTTTTTTTTTTTTOOOOOOOOOOOOOOOOONNNNNNNNNNNNNNNNNNNNNNNNNNNNNs
    //%%%%%%%%%%%%%%%%%%%%%%%%%%
    //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    //*********************************************************************
    //??????????????????????????????????????????????????????????????????????????????????????????????????
    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
            
        if(b1==0)
        {
            draw++;
            if(p1==0 && p2==1)
            {
                one.setText("X");
                p1=1;
                p2=0;
            }
            else
            {
                one.setText("O");
                p1=0;
                p2=1;
                
            }
            checker();
            b1=1;
        }
    }//GEN-LAST:event_oneActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
               
        if(b7==0)
        {
            draw++;
            if(p1==0 && p2==1)
            {
                seven.setText("X");
                p1=1;
                p2=0;
            }
            else
            {
                seven.setText("O");
                p1=0;
                p2=1;
                
            }
            b7=1;
            checker();
        }// TODO add your handling code here:
    }//GEN-LAST:event_sevenActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
                    
        if(b2==0)
        {
            draw++;
            if(p1==0 && p2==1)
            {
                two.setText("X");
                p1=1;
                p2=0;
            }
            else
            {
                two.setText("O");
                p1=0;
                p2=1;
                
            }
            b2=1;
            checker();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
                
        if(b3==0)
        {
            draw++;
            if(p1==0 && p2==1)
            {
                three.setText("X");
                p1=1;
                p2=0;
            }
            else
            {
                three.setText("O");
                p1=0;
                p2=1;
                
            }
            b3=1;
            checker();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
                
        if(b4==0)
        {
            draw++;
            if(p1==0 && p2==1)
            {
                four.setText("X");
                p1=1;
                p2=0;
            }
            else
            {
                four.setText("O");
                p1=0;
                p2=1;
                
            }
            b4=1;
            checker();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
                
        if(b5==0)
        {
            draw++;
            if(p1==0 && p2==1)
            {
                five.setText("X");
                p1=1;
                p2=0;
            }
            else
            {
                five.setText("O");
                p1=0;
                p2=1;
                
            }
            b5=1;
            checker();
        }// TODO add your handling code here:
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
               
        if(b6==0)
        {
            draw++;
            if(p1==0 && p2==1)
            {
                six.setText("X");
                p1=1;
                p2=0;
            }
            else
            {
                six.setText("O");
                p1=0;
                p2=1;
                
            }
            b6=1;
            checker();
        }// TODO add your handling code here:
    }//GEN-LAST:event_sixActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
               
        if(b8==0)
        {
            draw++;
            if(p1==0 && p2==1)
            {
                eight.setText("X");
                p1=1;
                p2=0;
            }
            else
            {
                eight.setText("O");
                p1=0;
                p2=1;
                
            }
            b8=1;
            checker();
        }// TODO add your handling code here:
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
               
        if(b9==0)
        {
            draw++;
            if(p1==0 && p2==1)
            {
                nine.setText("X");
                p1=1;
                p2=0;
            }
            else
            {
                nine.setText("O");
                p1=0;
                p2=1;
                
            }
            b9=1;
            checker();
        }// TODO add your handling code here:
    }//GEN-LAST:event_nineActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        one.setText("");
        b1=0;
        two.setText("");
        b2=0;
        three.setText("");
        b3=0;
        four.setText("");
        b4=0;
        five.setText("");
        b5=0;
        six.setText("");
        b6=0;
        seven.setText("");
        b7=0;
        eight.setText("");
        b8=0;
        nine.setText("");
        b9=0;
        draw=0;
    }//GEN-LAST:event_resetActionPerformed

    private void retryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryActionPerformed
        // TODO add your handling code here:
        tictactoe obj3=new tictactoe();
        obj3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_retryActionPerformed

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
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    public static javax.swing.JLabel player1;
    public static javax.swing.JLabel player2;
    private javax.swing.JButton reset;
    private javax.swing.JButton retry;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JLabel wallpar;
    // End of variables declaration//GEN-END:variables
}
