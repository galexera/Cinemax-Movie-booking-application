package mini1;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import ticketvariables.ldt_movie;
import ticketvariables.name_movie;
import ticketvariables.seat_bill;

public class page4receipt extends javax.swing.JFrame {
 
    name_movie mn =new name_movie();
    ldt_movie  ldt_pass = new ldt_movie();
    seat_bill sb = new seat_bill();
   // Connection conn = null;
      PreparedStatement pst = null;
    ResultSet rs = null;

   
      public page4receipt() {
        initComponents();
        setSize(525, 700);
        setLocation(700, 100);
        setResizable(false);
        
      //  conn = JConnection.ConnectDb();
    
       /* ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Background3.jpg")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);;
        ImageIcon i = new ImageIcon(img2);

        jLabel10.setIcon(i);
         try {
            String sql2 = "SELECT Movie_name FROM tablemovie_name ";
            pst =(PreparedStatement) conn.prepareStatement(sql2);
           // pst.setString(0,jTextField1.getText());
           
            rs=pst.executeQuery();
           if(rs.next())
            {
                String MN=rs.getString("Movie_name");
                jLabel10.setText(MN);
            }
            //JOptionPane.showMessageDialog(null, "Successful");

        } catch (SQLException e) {
          // JOptionPane.showMessageDialog(null, e);
        }
     
     try {
            String sql3 = "SELECT date,lang,timeslot FROM tablemovie_date ";
            pst =(PreparedStatement) conn.prepareStatement(sql3);
           // pst.setString(0,jTextField1.getText());
           
            rs=pst.executeQuery();
           if(rs.next())
            {
                String d1=rs.getString("date");
                jdatelabel.setText(d1);
                String l1=rs.getString("lang");
                jLabel11.setText(l1);
                String ts=rs.getString("timeslot");
                jshowlabel.setText(ts);
            }
            //JOptionPane.showMessageDialog(null, "Successful");

        } catch (SQLException e) {
          // JOptionPane.showMessageDialog(null, e);
        }
     */
    }
    
    
   
  

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        jdatelabel = new java.awt.Label();
        jshowlabel = new java.awt.Label();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RECEIPT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 192, 55);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("MOVIE :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 70, 92, 58);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("LANGUAGE :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 140, 130, 71);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("DATE:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 230, 75, 52);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("SHOW :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 310, 80, 57);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("PAY :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 470, 85, 77);

        jButton1.setText("CONFIRM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 580, 154, 55);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText(sb.get_bill());
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 490, 172, 39);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("SEATS:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(90, 400, 106, 52);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText(sb.get_seats());
        getContentPane().add(jLabel9);
        jLabel9.setBounds(250, 390, 202, 63);
        getContentPane().add(label3);
        label3.setBounds(280, 200, 4, 20);

        jdatelabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jdatelabel.setText(ldt_pass.get_date());
        getContentPane().add(jdatelabel);
        jdatelabel.setBounds(250, 220, 100, 60);

        jshowlabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jshowlabel.setText(ldt_pass.get_time());
        getContentPane().add(jshowlabel);
        jshowlabel.setBounds(250, 310, 220, 50);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText(mn.get_movie());
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 80, 230, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText(ldt_pass.get_lang());
        getContentPane().add(jLabel11);
        jLabel11.setBounds(250, 150, 150, 50);

        setBounds(0, 0, 582, 725);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, "YOUR TICKET HAS BEEN BOOKED", " HURRAY!!", JOptionPane.PLAIN_MESSAGE);
        this.dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(page4receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page4receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page4receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page4receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page4receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label jdatelabel;
    private java.awt.Label jshowlabel;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
