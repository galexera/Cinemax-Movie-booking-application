
package mini1;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import ticketvariables.*;
public final class page1movie extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public page1movie() {
        initComponents();
        setSize(800, 700);
        setLocation(500, 120);
        setResizable(false);
        showImage(pos);
        conn = JConnection.ConnectDb();
        updateCombo();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Background3.jpg")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);;
        ImageIcon i = new ImageIcon(img2);

        jLabel3.setIcon(i);

    }

    // table2-admin movies insert
    //update combobox
    private void updateCombo() {
        String sql = "Select * from table2";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("Movie_name"));
            }
        } catch (Exception e) {
        }
    }

    int pos = 0;

    public String[] getImages() {

        File file = new File(getClass().getResource("/mini1/Movies").getFile());

        String[] imagesList = file.list();

        return imagesList;

    }

    public void showImage(int index) {
        String[] imagesList = getImages();

        String imageName = imagesList[index];

        ImageIcon icon = new ImageIcon(getClass().getResource("/mini1/Movies/" + imageName));

        Image image = icon.getImage().getScaledInstance(jLabel_Image.getWidth(), jLabel_Image.getHeight(), Image.SCALE_SMOOTH);

        jLabel_Image.setIcon(new ImageIcon(image));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel_Image);
        jLabel_Image.setBounds(260, 110, 274, 410);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MOVIES");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setAlignmentX(5.0F);
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 30, 223, 22);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(700, 270, 62, 61);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 250, 62, 61);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("BOOK TICKETS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(550, 590, 206, 44);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "URI : THE SURGICAL STRIKE", "DANGAL", "JOHN CARTER", "SAIRAT" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(220, 590, 239, 45);

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(15, 16, 88, 46);

        jLabel1.setText("SELECT MOVIE :");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 590, 140, 46);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 10, 790, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pos = pos + 1;
        if (pos >= getImages().length) {
            pos = getImages().length - 1;
        }
        showImage(pos);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        pos = pos - 1;
        if (pos < 0) {
            pos = 0;
        }
        showImage(pos);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        mp back1 = new mp();
        back1.setVisible(true);     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        name_movie nm = new name_movie(jComboBox1.getSelectedItem().toString());
        String sql1 = "INSERT INTO tablemovie_name(Movie_name) VALUES(?)";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql1);
            //pst.setString(1,fmane.getText());
            String value = jComboBox1.getSelectedItem().toString();
            pst.setString(1, value);

            pst.execute();
           // JOptionPane.showMessageDialog(null, "Selected");

        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null,e);
        }

        this.dispose();
        page2book movie1 = new page2book();
        movie1.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(page1movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page1movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page1movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page1movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new page1movie().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Image;
    // End of variables declaration//GEN-END:variables
}
