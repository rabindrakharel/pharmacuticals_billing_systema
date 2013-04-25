/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
/**
 *
 * @author paradise lost
 */
public class InventoryModel {
    
    Connector connector;
    Statement statement;
    
    public InventoryModel() throws SQLException
    {
         connector = new Connector();
         statement = (Statement) connector.returnStatement();
    }
    
    public void addInventory(String prodWid,String addValue) throws SQLException
    {
   String que="SELECT QTY FROM `inv_pos` WHERE PROD_WID="+prodWid;
    ResultSet rs=statement.executeQuery(que);
    String orgiVal="0";
    while(rs.next())
     {
    orgiVal=rs.getString("QTY");     
     }
    float totVal=new Float(orgiVal)+new Float(addValue);
   String query="UPDATE `retail_db`.`inv_pos` SET `QTY` = '"+totVal+"' WHERE `inv_pos`.`PROD_WID` ="+prodWid+"";;
   statement.executeUpdate(query);
    }
    
     public void subtractInventory( String prodWid,String decValue) throws SQLException
    {
   String que="SELECT QTY FROM `inv_pos` WHERE PROD_WID="+prodWid;
    ResultSet rs=statement.executeQuery(que);
    String orgiVal="0";
    while(rs.next())
     {
    orgiVal=rs.getString("QTY");     
     }
    float totVal=new Float(orgiVal)-new Float(decValue);
   String query="UPDATE `retail_db`.`inv_pos` SET `QTY` = '"+totVal+"' WHERE `inv_pos`.`PROD_WID` ="+prodWid+"";;
   statement.executeUpdate(query);
    //
    }
    
    public void addInventory(String prodWid) throws SQLException
    {String query="INSERT INTO `retail_db`.`inv_pos` (`PROD_WID`, `QTY`) VALUES ('"+prodWid+"', '0');";
     statement.executeUpdate(query);
    }
    
    public Vector<Vector<String>> getAllDetails(String caseString) throws SQLException
    {
    Vector<Vector<String>> resultSet=new Vector<Vector<String>>();
    String que="SELECT inv_pos.PROD_WID,prod_dim.PROD_NAME, inv_pos.QTY,inv_pos.QTY*prod_dim.SLS_RATE as value FROM inv_pos INNER JOIN prod_dim ON inv_pos.PROD_WID = prod_dim.PROD_ID ORDER BY inv_pos.QTY ASC";
    if( "product".equals(caseString))
        que="SELECT inv_pos.PROD_WID,prod_dim.PROD_NAME, inv_pos.QTY,inv_pos.QTY*prod_dim.SLS_RATE as VALUE FROM inv_pos INNER JOIN prod_dim ON inv_pos.PROD_WID = prod_dim.PROD_ID ORDER BY prod_dim.PROD_NAME ASC";
ResultSet rs=statement.executeQuery(que);
    while(rs.next())
     {
         Vector<String> list=new Vector<String>();
         list.addElement(rs.getString("PROD_WID"));
         list.addElement(rs.getString("PROD_NAME"));
         list.addElement(rs.getString("QTY"));
         list.addElement(rs.getString("VALUE"));
         resultSet.addElement(list);
     }
    return resultSet; 
    }
    
       public String getInventoryValue() throws SQLException
    { 
        String invVal="";
    
    String que="SELECT sum(inv_pos.QTY*prod_dim.SLS_RATE) as value FROM inv_pos INNER JOIN prod_dim ON inv_pos.PROD_WID = prod_dim.PROD_ID";
    ResultSet rs=statement.executeQuery(que);
    while(rs.next())
     {
       invVal=rs.getString("value");     
     }
    return invVal;        
    }
       
          public String getInventoryCost() throws SQLException
    { 
        String invCost="";
    
    String que="SELECT sum(inv_pos.QTY*prod_dim.PUR_RATE) as value FROM inv_pos INNER JOIN prod_dim ON inv_pos.PROD_WID = prod_dim.PROD_ID";
    ResultSet rs=statement.executeQuery(que);
    while(rs.next())
     {
       invCost=rs.getString("value");     
     }
    return invCost;        
    }   
}