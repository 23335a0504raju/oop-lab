
package bookmyticket;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class MainPage extends javax.swing.JFrame {

    private DrawerController drawer;
    public Connection con;
    public String userN;
    public MainPage(String name) {
        initComponents();
         
        this.setLocationRelativeTo(null);
        userN=name;
        
        
        ml.setLayout(new BoxLayout(ml, BoxLayout.Y_AXIS));
        
        
        String MovieName="";
        String place="";
        String price1="";
        String description="";
        jLabel2.setText("Hello   "+userN);
       //this.add(scr);
        
        
       try {
           
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/bookmyshow";
                String name1 = "root";
                String pass = "";
                con = DriverManager.getConnection(url, name1, pass);
      
        String mov="select *From movies";
        
        PreparedStatement psmt=con.prepareStatement(mov);
        ResultSet rs=psmt.executeQuery();
        
        while(rs.next()){
                JLabel box = new JLabel("");
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
                try {
                    System.out.println("D:\\BookMyTicket\\src\\dbasset\\" + rs.getString("Photos"));
                    BufferedImage bi = ImageIO.read(new File("D:\\BookMyTicket\\src\\dbasset\\" + rs.getString("Photos")));
                    Image img = bi.getScaledInstance(400, 350, Image.SCALE_SMOOTH);
                    ImageIcon ii = new ImageIcon(img);
                    String msg = "MovieName:" + MovieName;
                    mvnm.setText(msg);
                    plc.setText("Place:" + place);
                    prci.setText("Price: " + price1);
                    des.setText("Description:" + description);
                    icn.setIcon(ii);

                    ml.add(mvnm,BorderLayout.CENTER);
                    ml.add(plc,BorderLayout.CENTER);
                    ml.add(prci,BorderLayout.CENTER);
                    ml.add(des,BorderLayout.CENTER);
                    ml.add(icn,BorderLayout.CENTER);
                    
                    ml.add(btn,BorderLayout.CENTER);
                    btn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Display movie name when button is clicked
                            JOptionPane.showMessageDialog(null, msg);
                            dispose();
                            new MovieSelection(msg.replace("MovieName:", ""),userN).setVisible(true);
                        }
                    });
                } 
                catch (Exception e) {
                    System.out.print(e);
                }

            }

        } catch (Exception e) {
            System.out.print(e);
        }

                
        drawer=Drawer.newDrawer(this)
                .header(new Header())
                .space(5)
                .backgroundTransparent(0.9f)
                .addChild(new DrawerItem("Profile").icon(new ImageIcon(getClass().getResource("/icon/profile.png"))).build())
                .addChild(new DrawerItem("Movies ").icon(new ImageIcon(getClass().getResource("/icon/clap.png"))).build())
                .addChild(new DrawerItem("Payments").icon(new ImageIcon(getClass().getResource("/icon/wallet-arrow.png"))).build())
                .addChild(new DrawerItem("About").icon(new ImageIcon(getClass().getResource("/icon/info.png"))).build())
                .enableScroll(true)
                
                .addFooter(new DrawerItem("Exit").icon(new ImageIcon(getClass().getResource("/icon/exit1.png"))).build())
                .event(new EventDrawer(){
        @Override
        public void selected (int i,DrawerItem di){
                  System.out.println(i);
                  if(i==0){
                     
                      try{
                         
                          String msg="",s="select * From login Where Name='"+userN+"'";
                          PreparedStatement ps=con.prepareStatement(s);
                          ResultSet r=ps.executeQuery();
                          while(r.next()){
                          
                              msg="User Name :"+r.getString("Name");
                              msg+="\nPhone No:"+String.valueOf(r.getString("PhoneNumber"));
                          }
                          JOptionPane.showMessageDialog(rootPane, msg);
                      }catch(Exception e){
                        JOptionPane.showMessageDialog(rootPane,"error");  
                        
                      }
                   
                  }
                  else if(i==1){
                      JOptionPane.showMessageDialog(rootPane,"movies Page");
                   
                  }
                  else if(i==2){
                         try {
                           String msg="";
                       String s="select * From payments Where uName='"+userN+"'";
                       PreparedStatement ps=con.prepareStatement(s);
                       ResultSet r=ps.executeQuery();
                          while(r.next()){
                          
                              msg+="\nUser Name :"+r.getString("uName")+"\n Transaction id: "+r.getString("Transaction");
                              msg+="\nMovie Name:"+r.getString("Name");
                          }
                          JOptionPane.showMessageDialog(rootPane, msg);
                      } catch (SQLException ex) {
                          Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                      }
                      
                  }
                  else if(i==3) {
                      String msg="\n You are using a ticket booking application to to book a movie ticket.\n Admoin allows you to payment through various sources";
                      JOptionPane.showMessageDialog(rootPane,"About:"+msg);
                      
                  }
                  else
                        {
                             dispose();
                             new login().setVisible(true);
                        }
                }
            })
                
    
                .build();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ml = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("|||");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 30));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Hello");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 610, -1));

        ml.setLayout(new java.awt.BorderLayout());
        jScrollPane1.setViewportView(ml);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 800, 490));

        jButton2.setText("load");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 700, -1, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pexels-ron-lach-10024434.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

                                         
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(drawer.isShow()){
            drawer.hide();
        }
        else{
            drawer.show();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
 
       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new MainPage("Admin").setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel ml;
    // End of variables declaration//GEN-END:variables
}
