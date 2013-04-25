/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import pharmacuticals_billing_systema.BaseContainer;

/**
 *
 * @author paradise lost
 */
public class SalesModel {
  
    Connector connector;
    Statement statement;
    
    
   public SalesModel() throws SQLException{
       
         connector = new Connector();
         statement = (Statement) connector.returnStatement();
   
   }
   
   

    
    public String getProdRowWid(String productName , String qty_type ) throws SQLException
    {
    String query="SELECT * FROM `prod_dim` WHERE prod_name = '"+productName+"' AND qty_type ='"+qty_type+"';";     
String list="";
      ResultSet rs=statement.executeQuery(query);
      
     while(rs.next())
     { 
    list=rs.getString("PROD_ID");
     }
     
     return list;        
    }
    
   public ArrayList<String> getProductRow(String productName) throws SQLException
    {
    String query="SELECT * FROM `prod_dim` WHERE prod_name = '"+productName+"';";     
    ArrayList<String> list=new ArrayList<String>();
      ResultSet rs=statement.executeQuery(query);
      
     while(rs.next())
     {
   
    list.add(rs.getString("PROD_ID"));
    list.add(rs.getString("PROD_NAME"));
    list.add(rs.getString("SLS_RATE"));
     }
     
     return list;
        
    }
   
     public Vector<Vector<String>> userSalesRecord(String Date) throws SQLException
    { Vector<Vector<String>> resultSet=new Vector<Vector<String>>();
    String que="select usr_dtl.fmly_nm as name,sum(sales_tranx_dtl.sls_amt)-sum(sales_tranx_dtl.disc_amt) as amt"
            + " from sales_tranx_dtl inner join usr_log on (sales_tranx_dtl.ssn_id=usr_log.ssn_id) inner join usr_dtl on (usr_log.usr_wid=usr_dtl.usr_id) "
            + " where sales_tranx_dtl.date='"+Date+"' group by usr_dtl.fmly_nm;";
ResultSet rs=statement.executeQuery(que);
    while(rs.next())
     {
         Vector<String> list=new Vector<String>();
         list.addElement(rs.getString("name"));
         list.addElement(rs.getString("amt"));
         resultSet.addElement(list);     
     }
    System.out.println(Date);
    System.out.println(resultSet);
    return resultSet;     
    
    }
   
   public void insertProducDim(String Prod_Name,String Sls_Rate) throws SQLException
   {
   String query="INSERT INTO `retail_db`.`prod_dim` (`PROD_ID`, `PROD_NAME`, `SLS_RATE`, `PUR_RATE`) VALUES (NULL, '"+Prod_Name+"', '"+Sls_Rate+"', '0')";
   statement.executeUpdate(query);
   }
   
   public void insertSalesFact(String Prod_Wid,String Prod_Qty,String Sales_Amt,String Sales_Wid) throws SQLException
   {
   String query="INSERT INTO `retail_db`.`sales_fact` (`PROD_WID`, `SLS_QTY`, `SLS_AMT`, `SALES_WID`)  VALUES ('"+Prod_Wid+"', '"+Prod_Qty+"', '"+Sales_Amt+"', '"+Sales_Wid+"');";
   statement.executeUpdate(query);
   }
   
    public void insertSalesTranxDtl(String salesWid,String cusName,String cusLoc,String total_Amount, String Disc_Amt) throws SQLException
   {
                 Date date =new Date(); // your date
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH)+1;
    int day = cal.get(Calendar.DAY_OF_MONTH);
    String[] all_date=date.toString().split(" ");
   String query="INSERT INTO `retail_db`.`sales_tranx_dtl` (`SALES_ID`, `CUST_NAME`, `CUST_LOC`,`SLS_AMT`,`DISC_AMT`, `DATE`, `SSN_ID`, `TIME_STMP`) VALUES ('"+salesWid+"', '"+cusName+"', '"+cusLoc+"', '"+total_Amount+"','"+Disc_Amt+"','"+year+"-"+month+"-"+day+"','"+BaseContainer.ssn_id+"', '"+all_date[3]+"');";
   statement.executeUpdate(query);
   }
     
    public ArrayList<String> getProductName(String SubStr) throws SQLException
    {
   String query="SELECT * FROM `prod_dim` WHERE prod_name like '"+SubStr+"%' LIMIT 9;"; 
    ArrayList<String> list=new ArrayList<String>();
    ResultSet rs=statement.executeQuery(query);
    while(rs.next())
     {
    list.add(rs.getString("PROD_NAME")+"#  "+rs.getString("SLS_RATE")+" NRS");     
    
     }
     
     return list;
        
    }
    
    public String lastSalesId() throws SQLException
    {
    String query="SELECT max( SALES_ID ) AS Sls_Wid FROM sales_tranx_dtl";     
    ResultSet rs=statement.executeQuery(query);
         String list = null;
    while(rs.next())
    {
    list=rs.getString("Sls_Wid");
    }
    if(list!=null)
    {
     Integer l1=new Integer(list);
      return l1+1+"";
    }
    else return "0";
  
     
             
    }
    
     public String lastProId() throws SQLException
    {
    String query="select max(prod_id) as proWid from prod_dim;";     
    ResultSet rs=statement.executeQuery(query);
      String list = null;
      while(rs.next())
    {
       list=rs.getString("proWid");
    }
       if(list!=null)
    {
     Integer l1=new Integer(list);
      return l1+1+"";
    }
    else return "0";          
    }
     
     
          public float getSales( String Date) throws SQLException
    {
    String query="SELECT DATE, SUM( SLS_AMT ) - SUM( DISC_AMT ) as AMT FROM `sales_tranx_dtl` WHERE DATE = '"+Date+"'GROUP BY DATE;";     
    ResultSet rs=statement.executeQuery(query);
      String list = "0";
      while(rs.next())
    {
       list=rs.getString("AMT");
    }
       if(list.length()>0)
    {
       return new Float(list);
    }
    else return 0;          
    }
     
      public Vector<Vector<String>> getAllDetails() throws SQLException
    { Vector<Vector<String>> resultSet=new Vector<Vector<String>>();
    String que="SELECT * FROM `sales_details`";
ResultSet rs=statement.executeQuery(que);
    while(rs.next())
     { 
         Vector<String> list=new Vector<String>();
         list.addElement(rs.getString("DATE"));
         list.addElement(rs.getString("BILL NO"));
         list.addElement(rs.getString("SALES MAN"));
         list.addElement(rs.getString("PRODUCT NAME"));
         list.addElement(rs.getString("QUANTITY"));
         list.addElement(rs.getString("RATE"));
         list.addElement(rs.getString("AMOUNT"));
         resultSet.addElement(list);
     
     }
    
    return resultSet; 
        
    
    }
    
}
