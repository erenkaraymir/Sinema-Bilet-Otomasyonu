
import java.io.IOException;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erenk
 */
public class LoginForm extends javax.swing.JFrame {
    final String adminName="root";
    final String adminPass="toorroot";
    Connection connection=null;
    DbHelper dbHelper= new DbHelper();
    
    public LoginForm() {
        initComponents();
        this.setBackground(new java.awt.Color(0,0,0,0));
    }
    
    public void dogrulamaKullanici() throws SQLException{
        String username=jTxtUsername.getText();
        String password=jTxtPassword.getText();
        connection=(Connection) dbHelper.getConnection();
       
        try{
            String sql="select kullaniciadi,kullanicisifre from kullanicilar where kullaniciadi='"+username+"' and kullanicisifre='"+password+"'";
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if(resultSet.next()){
                new Hosgeldiniz().setVisible(true);
                this.dispose();
                
            }
            else{
                JOptionPane.showMessageDialog(this,"Kullanıcı adı veya şifre hatalı");
                LoginForm loginFormm = new LoginForm();
                 loginFormm.setVisible(true);
                loginFormm.pack();
                loginFormm.setLocationRelativeTo(null);
                 loginFormm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              this.dispose(); 
                
            }
            
        }catch(Exception exception){
            
        }
    }
    
    public void adminPanel(){
             
            AdminPanel adminPanel = new AdminPanel();
            adminPanel.setVisible(true);
            adminPanel.pack();
            adminPanel.setLocationRelativeTo(null);
            adminPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonLogin = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtUsername = new javax.swing.JTextField();
        jTxtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(938, 539));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(null);
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLogin.setText("Giriş Yap");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 140, 50));

        jButtonRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRegister.setText("Kayıt Ol");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 140, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Kullanıcı Adı :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Şifre   :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 90, 20));

        jTxtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTxtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 140, 30));
        getContentPane().add(jTxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel5.setText("GAZİ SİNEMA SALONUNA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 480, 150));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel4.setText("HOŞ GELDİNİZ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 300, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\swingdemos\\SinemaBilet\\src\\Icon\\sinemabilet1.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(938, 539));
        jLabel1.setMinimumSize(new java.awt.Dimension(938, 539));
        jLabel1.setPreferredSize(new java.awt.Dimension(938, 539));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(938, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
       RegisterForm registerForm = new RegisterForm();
       registerForm.setVisible(true);
       registerForm.pack();
       registerForm.setLocationRelativeTo(null);
       registerForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose(); //eski pencerenin kapanmasını sağlar.
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        try {
           
            if((jTxtUsername.getText().equals(adminName)) && jTxtPassword.getText().equals(adminPass)){
                adminPanel();
            }
            else {
             
               dogrulamaKullanici();
              
                
            }
            
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    
    public static void main(String args[]) {
     

     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jTxtPassword;
    private javax.swing.JTextField jTxtUsername;
    // End of variables declaration//GEN-END:variables
}
