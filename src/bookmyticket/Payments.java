
package bookmyticket;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author HP
 */
public class Payments extends javax.swing.JFrame {

    /**
     * Creates new form Payments
     */
    public Connection con;
    public String un;
    public String trid;
    public Payments(String movie,String un,String price) {
        initComponents();
        this.setLocationRelativeTo(null);
        JLabel mvn = new JLabel(movie);
        jLabel2.setText("Payment to be proccessed for movie "+movie);
        this.un=un;
         Random random = new Random();
        long randomCode = (long) (random.nextDouble() * 9_000_000_000L) + 1_000_000_000L;
        trid=String.valueOf(randomCode);
        String moviename=movie;
        String MovieName="";
        String place="";
        String price1=price;
        String description="";
        try { 
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/bookmyshow";
                String name1 = "root";
                String pass = "";
                con = DriverManager.getConnection(url, name1, pass);
         
            PreparedStatement pstmt = con.prepareStatement("select * from movies where mName='" + moviename + "'");

            ResultSet rs = pstmt.executeQuery();
            ml.setLayout(new BoxLayout(ml, BoxLayout.Y_AXIS));
            while(rs.next()){
            
            JLabel mvnm = new JLabel("");
            JLabel plc = new JLabel("");
            JLabel prci = new JLabel("");
            JLabel des = new JLabel("");
            JLabel icn = new JLabel("");
            mvnm.setFont(new java.awt.Font("Segoe UI", 1, 18));
            mvnm.setForeground(new java.awt.Color(0, 0, 0));
            plc.setFont(new java.awt.Font("Segoe UI", 1, 18));
            plc.setForeground(new java.awt.Color(0, 0, 0));
            prci.setFont(new java.awt.Font("Segoe UI", 1, 18));
            prci.setForeground(new java.awt.Color(0, 0, 0));
            des.setFont(new java.awt.Font("Segoe UI", 1, 18));
            des.setForeground(new java.awt.Color(0, 0, 0));
            JButton btn = new JButton("Book");
            btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
            btn.setForeground(new java.awt.Color(0, 102, 102));
            getContentPane().add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 120, 40));

            MovieName = rs.getString("mName");
           // price1 = rs.getString("price");
            place = rs.getString("location");
            description = rs.getString("Description");
             plc.setText(" Place:" + place);
             ml.add(plc);
            try{
              
                    String msg = "MovieName:" + MovieName;
                    mvnm.setText(msg);
                    plc.setText(" Place:" + place);
                    prci.setText(" Price: " + price1);
                    des.setText(" Description:" + description);
                    ml.add(mvnm);
                    ml.add(plc);
                    ml.add(prci);
                    ml.add(des);
                    ml.add(btn);
                    btn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            try {
                                // Display movie name when button is clicked
                                JOptionPane.showMessageDialog(null, msg);
                                BufferedImage bi = ImageIO.read(new File("D:\\BookMyTicket\\src\\icon\\success.jpg"));
                                Image img = bi.getScaledInstance(500, 400, Image.SCALE_SMOOTH);
                                ImageIcon ii = new ImageIcon(img);
                                test.setSize(540, 500);
                                test.setIcon(ii);
                                test.setHorizontalAlignment(SwingConstants.CENTER);
                                String s="insert into payments(Name,Transaction,Price,uName) values('"+moviename+"','"+trid+"','"+price+"','"+un+"')";
                               PreparedStatement st = con.prepareStatement(s);
                               int f=st.executeUpdate();
                                if(f>0){
                                    System.out.println("payments details inserted");
                                } else {
                                    System.out.println("can't insert payments details !");
                                }
                            } catch (IOException ex) {
                                Logger.getLogger(Payments.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (SQLException ex) {
                                Logger.getLogger(Payments.class.getName()).log(Level.SEVERE, null, ex);
                            }
                           
                           
                        }
                    });
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"error");
            }
        
        }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(this,"error");
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

        ml = new javax.swing.JPanel();
        test = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ml.setLayout(new javax.swing.BoxLayout(ml, javax.swing.BoxLayout.LINE_AXIS));
        ml.add(test);

        getContentPane().add(ml, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 500, 350));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 760, 60));

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pexels-david-bartus-43782-714926.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
       new MainPage(un).setVisible(true);
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
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payments("Sample","","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel ml;
    private javax.swing.JLabel test;
    // End of variables declaration//GEN-END:variables
}
