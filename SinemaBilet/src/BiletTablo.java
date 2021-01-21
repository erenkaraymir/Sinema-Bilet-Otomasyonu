
import com.mysql.cj.xdevapi.Result;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BiletTablo {
     public ArrayList<Bilet> getBiletses1() throws SQLException{
        Connection connection=null;
        DbHelper dbHelper = new  DbHelper();
        java.sql.Statement statement=null;
        ResultSet resultSet;
        ArrayList<Bilet> biletses1= null;
        
        try{
            connection=dbHelper.getConnection();
            statement=connection.createStatement();
            resultSet = statement.executeQuery("select distinct koltukno from bilet where filmid='1'");
            biletses1= new ArrayList<Bilet>();
            
            while(resultSet.next()){
               biletses1.add(new Bilet(resultSet.getString("koltukno")));
            }
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
                statement.close();
                connection.close();
                
        }
        return biletses1;
    }
     public ArrayList<Bilet> getBiletses2() throws SQLException{
        Connection connection=null;
        DbHelper dbHelper = new  DbHelper();
        java.sql.Statement statement=null;
        ResultSet resultSet;
        ArrayList<Bilet> biletses2= null;
        
        try{
            connection=dbHelper.getConnection();
            statement=connection.createStatement();
            resultSet = statement.executeQuery("select distinct koltukno from bilet where filmid='2'");
            biletses2= new ArrayList<Bilet>();
            
            while(resultSet.next()){
               biletses2.add(new Bilet(resultSet.getString("koltukno")));
            }
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
                statement.close();
                connection.close();
                
        }
        return biletses2;
    }
     public ArrayList<Bilet> getBiletses3() throws SQLException{
        Connection connection=null;
        DbHelper dbHelper = new  DbHelper();
        java.sql.Statement statement=null;
        ResultSet resultSet;
        ArrayList<Bilet> biletses3= null;
        
        try{
            connection=dbHelper.getConnection();
            statement=connection.createStatement();
            resultSet = statement.executeQuery("select distinct koltukno from bilet where filmid='3'");
            biletses3= new ArrayList<Bilet>();
            
            while(resultSet.next()){
               biletses3.add(new Bilet(resultSet.getString("koltukno")));
            }
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
                statement.close();
                connection.close();
                
        }
        return biletses3;
    }
}
