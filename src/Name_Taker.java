/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asif siddique
 */
public class Name_Taker extends javax.swing.JFrame {
 String s1;
 String s2;
    /**
     * Creates new form Name_Taker
     */
    public Name_Taker() {
        initComponents();
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
        tic = new javax.swing.JLabel();
        tac = new javax.swing.JLabel();
        toe = new javax.swing.JLabel();
        textone = new javax.swing.JLabel();
        texttwo = new javax.swing.JLabel();
        enterone = new javax.swing.JTextField();
        entertwo = new javax.swing.JTextField();
        retry1 = new javax.swing.JButton();
        retry = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(420, 650, 420, 650));
        setResizable(false);

        jPanel1.setLayout(null);

        tic.setFont(new java.awt.Font("Chiller", 1, 130)); // NOI18N
        tic.setForeground(new java.awt.Color(255, 255, 255));
        tic.setText("TIC");
        jPanel1.add(tic);
        tic.setBounds(20, 10, 200, 120);

        tac.setFont(new java.awt.Font("Chiller", 1, 130)); // NOI18N
        tac.setForeground(new java.awt.Color(255, 255, 255));
        tac.setText("TAC");
        jPanel1.add(tac);
        tac.setBounds(200, 10, 210, 120);

        toe.setFont(new java.awt.Font("Chiller", 1, 130)); // NOI18N
        toe.setForeground(new java.awt.Color(255, 255, 255));
        toe.setText("TOE");
        jPanel1.add(toe);
        toe.setBounds(110, 120, 210, 110);

        textone.setFont(new java.awt.Font("Chiller", 1, 30)); // NOI18N
        textone.setForeground(new java.awt.Color(255, 255, 255));
        textone.setText("Enter name of player one");
        jPanel1.add(textone);
        textone.setBounds(20, 320, 360, 40);

        texttwo.setFont(new java.awt.Font("Chiller", 1, 30)); // NOI18N
        texttwo.setForeground(new java.awt.Color(255, 255, 255));
        texttwo.setText("Enter name of player one");
        jPanel1.add(texttwo);
        texttwo.setBounds(20, 410, 360, 40);

        enterone.setBackground(new java.awt.Color(0, 0, 0));
        enterone.setFont(new java.awt.Font("Chiller", 0, 24)); // NOI18N
        enterone.setForeground(new java.awt.Color(255, 255, 255));
        enterone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enteroneActionPerformed(evt);
            }
        });
        jPanel1.add(enterone);
        enterone.setBounds(20, 360, 160, 30);

        entertwo.setBackground(new java.awt.Color(0, 0, 0));
        entertwo.setFont(new java.awt.Font("Chiller", 0, 24)); // NOI18N
        entertwo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(entertwo);
        entertwo.setBounds(20, 450, 160, 30);

        retry1.setBackground(new java.awt.Color(56, 0, 0));
        retry1.setFont(new java.awt.Font("Chiller", 1, 60)); // NOI18N
        retry1.setForeground(new java.awt.Color(255, 255, 255));
        retry1.setText("<");
        retry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retry1ActionPerformed(evt);
            }
        });
        jPanel1.add(retry1);
        retry1.setBounds(0, 590, 63, 60);

        retry.setBackground(new java.awt.Color(0, 14, 0));
        retry.setFont(new java.awt.Font("Chiller", 1, 60)); // NOI18N
        retry.setForeground(new java.awt.Color(255, 255, 255));
        retry.setText(">");
        retry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryActionPerformed(evt);
            }
        });
        jPanel1.add(retry);
        retry.setBounds(360, 590, 63, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\UAP\\103\\CSE\\javatute\\Tic tac toe\\Black polygon with red edges Wallpaper 1202.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enteroneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enteroneActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_enteroneActionPerformed

    private void retryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryActionPerformed
        // TODO add your handling code here:
        game obj3=new game();
        
        obj3.setVisible(true);
        this.setVisible(false);
        obj3.name1=enterone.getText();
        obj3.name2=entertwo.getText();
        obj3.player2.setText(enterone.getText());
        obj3.player1.setText(entertwo.getText());
    }//GEN-LAST:event_retryActionPerformed

    private void retry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retry1ActionPerformed
        // TODO add your handling code here:
        tictactoe ok =new tictactoe();
        ok.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_retry1ActionPerformed

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
            java.util.logging.Logger.getLogger(Name_Taker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Name_Taker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Name_Taker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Name_Taker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Name_Taker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField enterone;
    public static javax.swing.JTextField entertwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JButton retry;
    public static javax.swing.JButton retry1;
    private javax.swing.JLabel tac;
    private javax.swing.JLabel textone;
    private javax.swing.JLabel texttwo;
    private javax.swing.JLabel tic;
    private javax.swing.JLabel toe;
    // End of variables declaration//GEN-END:variables
}
