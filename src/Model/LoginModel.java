/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

public class LoginModel {
    Connector connector;
    Statement statement;
    
    
   public LoginModel() throws SQLException{
       
         connector = new Connector();
         statement = (Statement) connector.returnStatement();
   
   }
   
    public String getUser(String userName,String userPassword) throws SQLException
    {
    String query="SELECT FMLY_NM,USR_ID FROM retail_db.usr_dtl WHERE USR_NM = '"+userName+"' AND USR_PWD = md5('"+userPassword+"');";     

      ResultSet rs=statement.executeQuery(query);
      String fmly_name="";
    
      
     while(rs.next())
     {
        fmly_name=rs.getString("USR_ID")+"#"+rs.getString("FMLY_NM");         
     }
     
     return fmly_name;
        
    }
      public String getAdmin(String userName,String userPassword) throws SQLException
    {
    String query="SELECT FMLY_NM,USR_ID FROM retail_db.admin_dtl WHERE USR_NM = '"+userName+"' AND USR_PWD = md5('"+userPassword+"');";     

      ResultSet rs=statement.executeQuery(query);
      String fmly_name="";
      
     while(rs.next())
     {
          fmly_name=rs.getString("USR_ID")+"#"+rs.getString("FMLY_NM");       
     }
      return fmly_name;
     }
    public void setLog(String ssn_id,String usr_id,String year, String month,String day,String date) throws SQLException 
      {
            
            String query="INSERT INTO `retail_db`.`usr_log` (`SSN_ID`, `USR_WID`, `YR`, `MNTH`, `DT`, `DY_NM`,`CHK_OUT_TM`) VALUES ('"+ssn_id+"', '"+usr_id+"', '"+year+"', '"+month+"', '"+date+"','"+day+"', '44:44:44')";
            statement.executeUpdate(query);
          
      }
    
    public String getSsnId() throws SQLException
    {  String ret="0";
      String query="SELECT max( SSN_ID ) as SSN_ID FROM `usr_log`;"; 
      ResultSet rs=statement.executeQuery(query);
      while(rs.next())
      ret=rs.getString("SSN_ID");
 if(ret!=null)
      return ret;
 else 
     return "0";
    }

    
public void chkOutLog(String session_id) throws SQLException
      {
    Date date =new Date(); // your date
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    Date time=cal.getTime();
   String query="UPDATE `retail_db`.`usr_log` SET `CHK_OUT_TM` = '"+time.toString()+"' WHERE `usr_log`.`SSN_ID` ='"+session_id+"';";
   statement.executeUpdate(query);
      }

public void changePass(String fmly,String pwd) throws SQLException
{
String query="UPDATE `retail_db`.`usr_dtl` SET `USR_PWD` =md5('"+pwd+"') where  `usr_dtl`.`FMLY_NM` ='"+fmly+"';";
System.out.println(query);
statement.executeUpdate(query);
}

}
