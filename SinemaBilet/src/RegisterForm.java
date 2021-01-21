
import com.sun.jdi.IntegerValue;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class RegisterForm extends javax.swing.JFrame {

   
    public RegisterForm() {
        initComponents();
        this.setBackground(new java.awt.Color(0,0,0,0));
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtUserName = new javax.swing.JTextField();
        jTxtUserPass = new javax.swing.JPasswordField();
        jTxtMail = new javax.swing.JTextField();
        jTxtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtSurname = new javax.swing.JTextField();
        jTxtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonReset = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTxtConfirmPass = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(938, 539));
        setMinimumSize(new java.awt.Dimension(938, 539));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(938, 539));

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Kullanıcı Adı :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(550, 270, 140, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Şifre :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(620, 310, 110, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Mail Adresi  :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(560, 390, 130, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Telefon  Numarası : ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(500, 430, 190, 22);

        jTxtUserName.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel1.add(jTxtUserName);
        jTxtUserName.setBounds(690, 270, 150, 20);

        jTxtUserPass.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel1.add(jTxtUserPass);
        jTxtUserPass.setBounds(690, 309, 150, 20);

        jTxtMail.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel1.add(jTxtMail);
        jTxtMail.setBounds(690, 390, 150, 20);

        jTxtPhone.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel1.add(jTxtPhone);
        jTxtPhone.setBounds(690, 430, 150, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Soyad :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(610, 220, 80, 30);

        jTxtSurname.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel1.add(jTxtSurname);
        jTxtSurname.setBounds(690, 229, 150, 20);

        jTxtName.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel1.add(jTxtName);
        jTxtName.setBounds(690, 190, 150, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Ad :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(640, 190, 40, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel8.setText("KAYIT EKRANI");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(580, 40, 290, 60);

        jButtonReset.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReset);
        jButtonReset.setBounds(760, 490, 90, 30);

        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSubmit);
        jButtonSubmit.setBounds(641, 490, 90, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Şifreyi Doğrulayın :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(500, 350, 180, 22);
        jPanel1.add(jTxtConfirmPass);
        jTxtConfirmPass.setBounds(690, 350, 150, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel10.setText("Kullanıcı adı ve şifre oluşturmak zorunludur!");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(560, 150, 280, 13);

        jButtonBack.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBack);
        jButtonBack.setBounds(510, 490, 100, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\swingdemos\\SinemaBilet\\src\\Icon\\sinemabilet1.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        reset();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        
        try{
            connection=dbHelper.getConnection();
          
            String sql="insert into kullanicilar(ad,soyad,kullaniciadi,kullanicisifre,kullanicimail,kullaniciphone) values(?,?,?,?,?,?)";
            String sql2="SELECT * From kullanicilar;";
            
           
            statement=connection.prepareStatement(sql);
            if(!jTxtUserName.getText().equals("") && !jTxtUserPass.equals("") && ConfirmPassword()==true && ConfirmKullanici()==true){ // Kayıt oluşturmak için şifre ve kullanıcı adı şart.
            statement.setString(1,jTxtName.getText());
            statement.setString(2,jTxtSurname.getText());
            statement.setString(3,jTxtUserName.getText());
            statement.setString(4,jTxtUserPass.getText());
            statement.setString(5,jTxtMail.getText());
            statement.setString(6,jTxtPhone.getText());
            int result=statement.executeUpdate();
            JOptionPane.showMessageDialog(this,"Kayıt oluşturuldu,giriş yapabilirsiniz");
            }
            else if(ConfirmPassword()==false){
             JOptionPane.showMessageDialog(this,"Şifre Eşleşmedi,Tekrar deneyiniz");
            }
            else if(ConfirmKullanici()==false){
                JOptionPane.showMessageDialog(this,"Bu kullanıcı adı kullanılmaktadır!");
            }
            else{
               JOptionPane.showMessageDialog(this,"Kayıt oluşturulamadı!");
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            try {
                statement.close();
                connection.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
         returnLoginForm();
    }//GEN-LAST:event_jButtonBackActionPerformed

    public void returnLoginForm(){
       LoginForm loginForm = new LoginForm();
       loginForm.setVisible(true); // Görünürlüğünü sağlamak için. 
       loginForm.pack(); //Buton yapısı ayarlanması için
       loginForm.setLocationRelativeTo(null); // Açılan pencerenin ortada olmasını sağlar.  
       loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Programın sonlanmasını sağlar.
       this.dispose(); //eski pencerenin kapanmasını sağlar.
    }
    public boolean ConfirmPassword(){
        boolean dogruMu;
        if(!jTxtUserPass.getText().equals(jTxtConfirmPass.getText())){
            dogruMu=false;
        }else {
            dogruMu=true;
        }
            return dogruMu;
        
    }
    
    public boolean ConfirmKullanici(){
        boolean dogru=true;
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ArrayList<String> customerses=null;
        ResultSet resultSet;
        try{
            connection=dbHelper.getConnection();
            statement=connection.createStatement();
            resultSet = statement.executeQuery("select * from kullanicilar");
            customerses= new ArrayList<String>();
                 
                      while(resultSet.next()){
                customerses.add(resultSet.getString("kullaniciadi"));
            }
            for(Object object:customerses){
                if(object.equals(jTxtUserName.getText())){
                    dogru=false;
                }
                else{
                    dogru=true;
                }
            }  
        }catch(Exception exception){
            System.out.println(exception);
        }finally{
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       
        
        return dogru;
    }
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new RegisterForm().setVisible(true);
                
            }
        });
       
        
    }
    public void reset(){
        jTxtName.setText("");
        jTxtSurname.setText("");
        jTxtUserName.setText("");
        jTxtUserPass.setText("");
        jTxtMail.setText("");
        jTxtPhone.setText("");
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jTxtConfirmPass;
    private javax.swing.JTextField jTxtMail;
    private javax.swing.JTextField jTxtName;
    private javax.swing.JTextField jTxtPhone;
    private javax.swing.JTextField jTxtSurname;
    private javax.swing.JTextField jTxtUserName;
    private javax.swing.JPasswordField jTxtUserPass;
    // End of variables declaration//GEN-END:variables
}
