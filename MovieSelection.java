
package bookmyticket;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class MovieSelection extends javax.swing.JFrame {

    /**
     * Creates new form MovieSelection
     */
     public Connection con;
     public String un;
      public String price1;
    public MovieSelection(String Mname,String user) {
        initComponents();
        setLocationRelativeTo(null);
        String moviename=Mname;
        un=user;
        jLabel2.setText("Selected Movie :"+moviename);
        String MovieName="";
        String place="";
       
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
            price1 = rs.getString("price");
            place = rs.getString("location");
            description = rs.getString("Description");
            try{
               System.out.println("D:\\BookMyTicket\\src\\dbasset\\" + rs.getString("Photos"));
                    BufferedImage bi = ImageIO.read(new File("D:\\BookMyTicket\\src\\dbasset\\" + rs.getString("Photos")));
                    Image img = bi.getScaledInstance(400,400, Image.SCALE_SMOOTH);
                    ImageIcon ii = new ImageIcon(img);
                    String msg = "MovieName:" + MovieName;
                    mvnm.setText(msg);
                    plc.setText(" Place:" + place);
                    prci.setText(" Price: " + price1);
                    des.setText(" Description:" + description);
                    icn.setIcon(ii);
                    ml.add(mvnm);
                    ml.add(plc);
                    ml.add(prci);
                    ml.add(des);
                    ml.add(icn);
                    ml.add(btn);
                    btn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Display movie name when button is clicked
                            JOptionPane.showMessageDialog(null, msg);
                            dispose();
                            new Payments(moviename,un,price1).setVisible(true);
                        }
                    });
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"error");
            }
        
        }
        }
      catch(Exception e)
              {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ml.setLayout(new javax.swing.BoxLayout(ml, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(ml, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 640, 590));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 370, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pexels-ugur-165173.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -4, 1030, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MovieSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieSelection("None","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel ml;
    // End of variables declaration//GEN-END:variables
}