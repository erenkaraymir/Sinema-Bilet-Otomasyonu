// Bu sınıf veritabanı bağlantısı için bana yardımcı olacaktır.
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
private String userName="root";
private String password="1294609506e";
private String dbUrl="jdbc:mysql://localhost:3306/sinema_bilet?useSSl=false&serverTimezone=UTC";

public Connection getConnection() throws SQLException{
  
    return DriverManager.getConnection(dbUrl,userName,password);
   
}
public void showErrorMessage(SQLException exception){
    System.out.println("Error : "+exception.getMessage());
    System.out.println("Error code :"+exception.getErrorCode());
}
}
