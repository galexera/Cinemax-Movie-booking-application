package mini1;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.event.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ticketvariables.ldt_movie;

public class page2book extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public page2book() {
        initComponents();
        setSize(600, 600);
        setLocation(700, 150);
        setResizable(false);
        conn = JConnection.ConnectDb();
        updateCombo();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Background3.jpg")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);;
        ImageIcon i = new ImageIcon(img2);

        jLabel5.setIcon(i);
    }

    // admintable_movie_date/lang/slot -admin 
    //update combobox
    private void updateCombo() {
        String sql = "Select * from admintablemovie_date";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("lang"));

                jComboBox2.addItem(rs.getString("date"));
                jComboBox3.addItem(rs.getString("timeslot"));
            }
        } catch (Exception e) {
        }
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 490, 85, 44);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT LANGUAGE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(37, 133, 238, 53);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BOOKING DETAILS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 10, 300, 42);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("SELECT DATE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(85, 263, 144, 45);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("SELECT TIME SLOT");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(85, 403, 180, 44);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(140, 490, 76, 44);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENGLISH", "HINDI", "TAMIL" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(340, 146, 168, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "24 OCT", "25 OCT", "26 OCT", "27 OCT" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(340, 280, 168, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9.00 AM", "1.00 PM", "4.00 PM", "7.00 PM" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(340, 412, 168, 20);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 0, 590, 580);

        setBounds(0, 0, 621, 657);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ldt_movie ldt_pass = new ldt_movie(jComboBox1.getSelectedItem().toString(),jComboBox2.getSelectedItem().toString(),jComboBox3.getSelectedItem().toString());
        String sql1 = "INSERT INTO tablemovie_date(date,lang,timeslot) VALUES(?,?,?)";
        try {
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql1);
            //pst.setString(1,fmane.getText());
            String value1 = jComboBox1.getSelectedItem().toString();
            pst.setString(2, value1);
            String value2 = jComboBox2.getSelectedItem().toString();
            pst.setString(1, value2);
            String value3 = jComboBox3.getSelectedItem().toString();
            pst.setString(3, value3);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Selected");

        } catch (Exception e) {
            //  JOptionPane.showMessageDialog(this, e);
        }

        this.dispose();
        page3theatre next1 = new page3theatre();
        next1.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        page1movie back1 = new page1movie();
        back1.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(page2book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page2book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page2book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page2book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page2book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
