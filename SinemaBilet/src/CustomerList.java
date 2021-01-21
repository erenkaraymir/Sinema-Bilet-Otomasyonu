
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class CustomerList extends javax.swing.JFrame {
    DefaultTableModel model;
    
    public CustomerList() {
       
            initComponents();
            model=(DefaultTableModel)jCustomersesTable.getModel();
           
        try {
            ArrayList<Customers> customerses = getCustomerses();
            for(Customers customers : customerses){
                Object[] row = {
                    customers.getAd(),
                    customers.getSoyad(),
                    customers.getKullaniciadi(),
                    customers.getKullanicisifre(),
                    customers.getKullanicimail(),
                    customers.getKullaniciphone()};
                model.addRow(row);
            }
        } catch (SQLException ex) {
           
        }
           
         
    }
    
    
    public ArrayList<Customers> getCustomerses() throws SQLException{
        Connection connection=null;
        DbHelper dbHelper = new  DbHelper();
        Statement statement=null;
        ResultSet resultSet;
        ArrayList<Customers> customerses= null;
        
        try{
            connection=dbHelper.getConnection();
            statement=connection.createStatement();
            resultSet = statement.executeQuery("select * from kullanicilar");
            customerses= new ArrayList<Customers>();
            
            while(resultSet.next()){
                customerses.add(new Customers(
                                                resultSet.getString("ad"),
                                              resultSet.getString("soyad"),
                                              resultSet.getString("kullaniciadi"),
                                              resultSet.getString("kullanicisifre"),
                                              resultSet.getString("kullanicimail"),
                                              resultSet.getString("kullaniciphone")
                                              ));
            }
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
                statement.close();
                connection.close();
                
        }
        return customerses;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCustomersesTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTxtSearch = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jTxtDelete = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(938, 539));
        setMinimumSize(new java.awt.Dimension(938, 539));
        setPreferredSize(new java.awt.Dimension(938, 539));

        jPanel1.setBackground(java.awt.Color.orange);

        jCustomersesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ad", "soyad", "kullaniciadi", "kullanicisifre", "kullanicimail", "kullaniciphone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jCustomersesTable);
        if (jCustomersesTable.getColumnModel().getColumnCount() > 0) {
            jCustomersesTable.getColumnModel().getColumn(0).setResizable(false);
            jCustomersesTable.getColumnModel().getColumn(1).setResizable(false);
            jCustomersesTable.getColumnModel().getColumn(2).setResizable(false);
            jCustomersesTable.getColumnModel().getColumn(3).setResizable(false);
            jCustomersesTable.getColumnModel().getColumn(4).setResizable(false);
            jCustomersesTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Arama İfadesi :");

        jTxtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtSearchKeyReleased(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonDelete.setText("Sil");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jTxtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDeleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Silmek istediğiniz kullanıcı adını soldaki alana yazın!");

        jButton1.setBackground(java.awt.Color.orange);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDelete)
                    .addComponent(jTxtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26))
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

    private void jTxtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtSearchKeyReleased
        String searchKey=jTxtSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new  TableRowSorter<DefaultTableModel>(model);
        jCustomersesTable.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_jTxtSearchKeyReleased

    private void jTxtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDeleteActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        Connection connection=null;
        DbHelper dbHelper = new  DbHelper();
        Statement statement=null;
        ResultSet resultSet;
        String deleteName=jTxtDelete.getText();
           
        try{
            String sql="DELETE FROM kullanicilar WHERE kullaniciadi='"+deleteName+"'";            
            connection=dbHelper.getConnection();
            statement=connection.createStatement();
            jButtonDelete.setVisible(true);
            int result=statement.executeUpdate(sql);
            System.out.println(result);
            JOptionPane.showMessageDialog(this,"Kayıt başarı ile silindi");
             // şimdi ekranı yenilemek için aşağıdaki kodları yazacağım.
            this.dispose();
            CustomerList customerList = new CustomerList();
            customerList.setVisible(true);
            customerList.pack();
            customerList.setLocationRelativeTo(null);
            customerList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
       AdminPanel adminPanel = new AdminPanel();
       adminPanel.setVisible(true);
       adminPanel.pack();
       adminPanel.setLocationRelativeTo(null);
       adminPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
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
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JTable jCustomersesTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtDelete;
    private javax.swing.JTextField jTxtSearch;
    // End of variables declaration//GEN-END:variables
}
