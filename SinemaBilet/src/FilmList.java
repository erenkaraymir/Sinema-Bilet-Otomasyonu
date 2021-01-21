
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erenk
 */
public class FilmList extends  javax.swing.JFrame{
        DefaultTableModel model;
    
    public FilmList() {
        
        initComponents();
        model=(DefaultTableModel) jFilmTable.getModel();
      
        try {
            ArrayList<Films> filmses = getFilmses();
            for(Films films : filmses){
                Object[] row = {
                    films.getFilmadi(),
                    films.getFilmtürü(),
                    films.getFilmyonetmeni(),
                    films.getFilmseansi(),
                    films.getFilmid()
                    };
                model.addRow(row);
            }
        } catch(SQLException ex) {
           System.out.println(ex);
        }
    }
    
    public ArrayList<Films> getFilmses() throws SQLException{
        Connection connection=null;
        DbHelper dbHelper = new  DbHelper();
        Statement statement=null;
        ResultSet resultSet;
        ArrayList<Films> filmses= null;
        
        try{
            connection=dbHelper.getConnection();
            statement=connection.createStatement();
            resultSet = statement.executeQuery("select * from filmler");
            filmses= new ArrayList<Films>();
            
            while(resultSet.next()){
                filmses.add(new Films(
                                              resultSet.getString("filmadi"),
                                              resultSet.getString("filmtürü"),
                                              resultSet.getString("filmyonetmeni"),
                                              resultSet.getString("filmseansi"),
                                              resultSet.getString("filmid")
                                              ));
            }
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
                statement.close();
                connection.close();
                
        }
        return filmses;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jFilmTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTxtAd = new javax.swing.JTextField();
        jLblYonetmen = new javax.swing.JLabel();
        jTxtyonetmen = new javax.swing.JTextField();
        jLblTür = new javax.swing.JLabel();
        jTxtTürü = new javax.swing.JTextField();
        jLblBasrol = new javax.swing.JLabel();
        jTxtSeans = new javax.swing.JTextField();
        jButtonEkle = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTxtFilmId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        resetKoltukButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(937, 539));
        setMinimumSize(new java.awt.Dimension(938, 539));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(938, 539));

        jPanel1.setBackground(new java.awt.Color(250, 173, 23));

        jFilmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "filmadi", "filmtürü", "filmyönetmeni", "filmseansi", "filmid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jFilmTable);
        if (jFilmTable.getColumnModel().getColumnCount() > 0) {
            jFilmTable.getColumnModel().getColumn(0).setResizable(false);
            jFilmTable.getColumnModel().getColumn(1).setResizable(false);
            jFilmTable.getColumnModel().getColumn(2).setResizable(false);
            jFilmTable.getColumnModel().getColumn(3).setResizable(false);
            jFilmTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Film Adı :");

        jTxtAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAdActionPerformed(evt);
            }
        });

        jLblYonetmen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblYonetmen.setText(" Yönetmen :");

        jTxtyonetmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtyonetmenActionPerformed(evt);
            }
        });

        jLblTür.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblTür.setText("Film Türü :");

        jLblBasrol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblBasrol.setText("Film seansı:");

        jButtonEkle.setBackground(new java.awt.Color(0, 212, 3));
        jButtonEkle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEkle.setText("Ekle");
        jButtonEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEkleActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(101, 255, 2));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("  Film ID :");

        jButton1.setBackground(java.awt.Color.orange);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        resetKoltukButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetKoltukButton.setText("KOLTUKLARI SIFIRLA");
        resetKoltukButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetKoltukButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText(" ---->Sıfırlamak istediğiniz veri ve koltuk salonu id'sini yukarıya giriniz.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblTür)
                            .addComponent(jLblYonetmen))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTxtTürü, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblBasrol, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtSeans)
                                    .addComponent(jTxtFilmId, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                                .addGap(161, 161, 161))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTxtyonetmen, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jButtonEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(resetKoltukButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 121, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSeans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblBasrol))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblTür, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTürü, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtFilmId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblYonetmen)
                    .addComponent(jTxtyonetmen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEkle)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetKoltukButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection connection=null;
        DbHelper dbHelper = new  DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;
        String deleteName=jTxtAd.getText();
           
        try{
            String sql="DELETE FROM filmler WHERE filmadi='"+deleteName+"'";            
            connection=dbHelper.getConnection();
            statement=connection.prepareStatement(sql);
            int result=statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Kayıt başarı ile silindi");
             // şimdi ekranı yenilemek için aşağıdaki kodları yazacağım.
            this.dispose();
            FilmList filmList = new FilmList();
            filmList.setVisible(true);
            filmList.pack();
            filmList.setLocationRelativeTo(null);
            filmList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             this.dispose();
             
        }catch(Exception exception){
            System.out.println(exception);
        }finally{
            try {
                connection.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(CustomerList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEkleActionPerformed
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        PreparedStatement statement2 = null;
        try{
            if(jTxtFilmId.getText().equals("1") || jTxtFilmId.getText().equals("2") || jTxtFilmId.getText().equals("3") || jTxtFilmId.getText().equals("4") ){
             connection=dbHelper.getConnection();
            String sql="insert into filmler(filmadi,filmtürü,filmyonetmeni,filmseansi,filmid) values(?,?,?,?,?)";
            String sql2="insert into bilet(filmid) values(?)";
            statement=connection.prepareStatement(sql);
            statement2=connection.prepareStatement(sql2);
            statement.setString(1,jTxtAd.getText());
            statement.setString(2,jTxtTürü.getText());
            statement.setString(3,jTxtyonetmen.getText());
            statement.setString(4,jTxtSeans.getText());
            statement.setString(5,jTxtFilmId.getText());
            statement2.setString(1,jTxtFilmId.getText());
            int result=statement.executeUpdate(); 
            int result2=statement2.executeUpdate();
             this.dispose();
            FilmList filmList = new FilmList();
            filmList.setVisible(true);
            filmList.pack();
            filmList.setLocationRelativeTo(null);
            filmList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,"Lütfen film ID'sini 1,2,3 veya 4 olarak giriniz!");
            }
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            try {
                connection.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonEkleActionPerformed

    private void jTxtyonetmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtyonetmenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtyonetmenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       AdminPanel adminPanel = new AdminPanel();
       adminPanel.setVisible(true);
       adminPanel.pack();
       adminPanel.setLocationRelativeTo(null);
       adminPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
       
    
    
    
             SalonKoltukSıfırlaCagır koltukSıfırla= new SalonKoltukSıfırlaCagır() {
            @Override
            public void reset(Salon1 salon1) {
                super.reset(salon1); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void reset(Salon2 salon2) {
                super.reset(salon2); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void reset(Salon3 salon3) {
                super.reset(salon3); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void reset(Salon4 salon4) {
                super.reset(salon4); //To change body of generated methods, choose Tools | Templates.
            }
            
            
           
            
        };
       
   
    
    private void resetKoltukButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetKoltukButtonActionPerformed
        
        Connection connection=null;
        DbHelper dbHelper = new  DbHelper();
        Statement statement=null;
        ResultSet resultSet;
        String id=jTxtFilmId.getText();
        Salon1 salon1 = new Salon1();
        Salon2 salon2= new Salon2();
        Salon3 salon3= new Salon3();
        Salon4 salon4= new Salon4();
        try{
            if(id.equals("1")){
            String sql="DELETE FROM bilet WHERE filmid='"+id+"'";    
            koltukSıfırla.reset(salon1);
            connection=dbHelper.getConnection();
            statement=connection.createStatement();
            int result=statement.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(this,"Girdiğiniz ID'ye ait veriler ve koltuklar sıfırlanmıştır");
            }
            else if(id.equals("2")){
            String sql="DELETE FROM bilet WHERE filmid='"+id+"'"; 
            connection=dbHelper.getConnection();
            statement=connection.createStatement();
            int result=statement.executeUpdate(sql);
            koltukSıfırla.reset(salon2);
            JOptionPane.showMessageDialog(this,"Girdiğiniz ID'ye ait veriler ve koltuklar sıfırlanmıştır");
                    }
            else if(id.equals("3")){
            String sql="DELETE FROM bilet WHERE filmid='"+id+"'"; 
            connection=dbHelper.getConnection();
            statement=connection.createStatement();
            int result=statement.executeUpdate(sql);
           koltukSıfırla.reset(salon3);
            JOptionPane.showMessageDialog(this,"Girdiğiniz ID'ye ait veriler ve koltuklar sıfırlanmıştır");
            }
            else if(id.equals("4")){
            String sql="DELETE FROM bilet WHERE filmid='"+id+"'";            
            connection=dbHelper.getConnection();
            statement=connection.createStatement();
            int result=statement.executeUpdate(sql);
            koltukSıfırla.reset(salon4);
            JOptionPane.showMessageDialog(this,"Girdiğiniz ID'ye ait veriler ve koltuklar sıfırlanmıştır");
            }
            else{
                JOptionPane.showMessageDialog(this,"Lütfen film ID'sini 1,2,3 veya 4 olarak giriniz!");
            }
           
        }catch(Exception exception){
            System.out.println(exception);
        }
    }//GEN-LAST:event_resetKoltukButtonActionPerformed

    private void jTxtAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAdActionPerformed

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
            java.util.logging.Logger.getLogger(FilmList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilmList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilmList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilmList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilmList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonEkle;
    private javax.swing.JTable jFilmTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblBasrol;
    private javax.swing.JLabel jLblTür;
    private javax.swing.JLabel jLblYonetmen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtAd;
    private javax.swing.JTextField jTxtFilmId;
    private javax.swing.JTextField jTxtSeans;
    private javax.swing.JTextField jTxtTürü;
    private javax.swing.JTextField jTxtyonetmen;
    private javax.swing.JButton resetKoltukButton;
    // End of variables declaration//GEN-END:variables
}
