/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import pharmacuticals_billing_systema.BaseContainer;

/**
 *
 * @author paradise lost
 */
public class PurchaseModel {
    
    Connector connector;
    Statement statement;
    
    public PurchaseModel() throws SQLException
    {
    
        connector = new Connector();
         statement = (Statement) connector.returnStatement();
    }
    
    public void Insert(String SUPLR_NAME,String SUPLR_LOC,String Date,ArrayList<ArrayList<String>> bill,String TOT_AMT)
    {
    // if product name is in prod_dim table then return PROD_ID 
    
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
    
   public ArrayList<String> getProductRow(String productName , String qty_type ) throws SQLException
    {
    String query="SELECT * FROM `prod_dim` WHERE prod_name = '"+productName+"';";     
    ArrayList<String> list=new ArrayList<String>();
      ResultSet rs=statement.executeQuery(query);
      
     while(rs.next())
     {
   
    list.add(rs.getString("PROD_ID"));
    list.add(rs.getString("PROD_NAME"));
    list.add(rs.getString("PUR_RATE"));
     }
     
     return list;
        
    }
   
   public void insertProducDim(String Prod_Name,String Pur_Rate,String Sls_Rate) throws SQLException
   {
   String query="INSERT INTO `retail_db`.`prod_dim` (`PROD_ID`, `PROD_NAME`, `PUR_RATE`,`SLS_RATE` ) VALUES (NULL,'"+Prod_Name+"','"+Pur_Rate+"', '"+Sls_Rate+"');";
   statement.executeUpdate(query);
   }
   
   public void insertPurFact(String Prod_Wid,String Prod_Qty,String Pur_Amt,String Pur_Wid) throws SQLException
   {
   String query="INSERT INTO `retail_db`.`pur_fact` (`PROD_WID`, `PROD_QTY`, `PUR_AMT`, `PUR_WID`) VALUES ('"+Prod_Wid+"', '"+Prod_Qty+"', '"+Pur_Amt+"', '"+Pur_Wid+"');";
   statement.executeUpdate(query);
   }
   
    public void insertPurTranxDtl(String purWid,String supName,String supLoc,String date ,String amount) throws SQLException
   {
   String query="INSERT INTO `retail_db`.`pur_tranx_dtl` (`PUR_ID`, `SUP_NAME`, `SUP_LOC`, `DATE`, `PUR_AMT`,`SSN_ID`) VALUES ('"+purWid+"', '"+supName+"', '"+supLoc+"', '"+date+"', '"+amount+"','"+BaseContainer.ssn_id+"');";
   statement.executeUpdate(query);
   }
     
    public ArrayList<String> getProductName(String SubStr) throws SQLException
    {
    String query="SELECT * FROM `prod_dim` WHERE prod_name like '"+SubStr+"%' LIMIT 9;";  
    ArrayList<String> list=new ArrayList<String>();
    ResultSet rs=statement.executeQuery(query);
   
    while(rs.next())
     {
    list.add(rs.getString("PROD_NAME")+"#  "+rs.getString("PUR_RATE")+"NRS");  
   
     }
     
     return list;
        
    }
    
//    public static void main(String[] args) throws SQLException
//    {
//    PurchaseModel pm1=new PurchaseModel();
//    pm1.getProductName(" ");
//    }
    public String lastPurId() throws SQLException
    {
    String query="SELECT max(PUR_ID) as Pur_Wid FROM pur_tranx_dtl;";     
    ResultSet rs=statement.executeQuery(query);
         String list = null;
    while(rs.next())
    {
    list=rs.getString("Pur_Wid");
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
     
      public Vector<Vector<String>> getAllDetails() throws SQLException
    { Vector<Vector<String>> resultSet=new Vector<Vector<String>>();
    String que="SELECT DATE, SUP_NAME, SUP_LOC, PUR_AMT FROM `pur_tranx_dtl` WHERE 1";
ResultSet rs=statement.executeQuery(que);
    while(rs.next())
     {
         Vector<String> list=new Vector<String>();
         list.addElement(rs.getString("DATE"));
         list.addElement(rs.getString("SUP_NAME")+rs.getString("SUP_LOC"));
         list.addElement(rs.getString("PUR_AMT"));
         resultSet.addElement(list);
     
     }
    
    return resultSet;     
    
    }
      
      
      
      
      
      
      public String AYearAllMonth(String yearName) throws SQLException
      {
      String totPurAmt="No Results";
      String HighPurDay="No Results";
   
    String query="SELECT SUM(PUR_AMT) as total FROM `pur_tranx_dtl` WHERE DATE LIKE '"+yearName+"-%'";     
    ResultSet rs=statement.executeQuery(query);
    while(rs.next())
    { if(rs.getString("total")!=null)
    totPurAmt=rs.getString("total")+" NRS";
    }
    
    query="select DATE,max(total) as total from ((SELECT DATE,SUM(PUR_AMT) as total  FROM `pur_tranx_dtl` where DATE like '"+yearName+"-%' group by DATE) as T) ";     
    rs=statement.executeQuery(query);
    while(rs.next())
    { if(rs.getString("Date")!=null)
    HighPurDay=rs.getString("Date")+" : "+rs.getString("total")+" NRS";
    }
    
          return totPurAmt+","+HighPurDay;
      }
      
      
        public String AYearAMonth(String year , String monthName) throws SQLException
      {String totPurAmt="No Results";
      String HighPurDay="No Results";
   
    String query="SELECT SUM(PUR_AMT) as total FROM `pur_tranx_dtl` WHERE DATE LIKE '"+year+"-"+monthName+"%'";     
    ResultSet rs=statement.executeQuery(query);
    while(rs.next())
    {
        if(rs.getString("total")!=null)
    totPurAmt=rs.getString("total")+" NRS";
    }
    
    query="select DATE,max(total) as total from ((SELECT DATE,SUM(PUR_AMT) as total  FROM `pur_tranx_dtl` where DATE like '"+year+"-"+monthName+"-%' group by DATE) as T) ";     
    rs=statement.executeQuery(query);
    while(rs.next())
    {
        if(rs.getString("Date")!=null)
    HighPurDay=rs.getString("Date")+" : "+rs.getString("total")+" NRS";
    }
    
          return totPurAmt+","+HighPurDay;
      }
        
         public String AllYearAllMonth() throws SQLException
      {
      String totPurAmt="No Results";
      String HighPurDay="No Results";
   
    String query="SELECT SUM(PUR_AMT) as total FROM `pur_tranx_dtl` WHERE 1";     
    ResultSet rs=statement.executeQuery(query);
    while(rs.next())
    { if(rs.getString("total")!=null)
    totPurAmt=rs.getString("total")+" NRS";
    }
    
    query="select DATE,max(total) as total from ((SELECT DATE,SUM(PUR_AMT) as total  FROM `pur_tranx_dtl` where 1 group by DATE) as T) ";     
    rs=statement.executeQuery(query);
    while(rs.next())
    { if(rs.getString("Date")!=null)
    HighPurDay=rs.getString("Date")+" : "+rs.getString("total")+" NRS";
    }
          
          return totPurAmt+","+HighPurDay;
      }
         
         
         
            public String AllYearAMonth(String monthName) throws SQLException
      {
      String totPurAmt="No Results";
      String HighPurDay="No Results";
   
    String query="SELECT SUM(PUR_AMT) as total FROM `pur_tranx_dtl` WHERE DATE LIKE '%-"+monthName+"'";     
    ResultSet rs=statement.executeQuery(query);
    while(rs.next())
    {if(rs.getString("total")!=null)
    totPurAmt=rs.getString("total")+" NRS";
    }
    
    query="select DATE,max(total) as total from ((SELECT DATE,SUM(PUR_AMT) as total  FROM `pur_tranx_dtl` where DATE like '%-"+monthName+"' group by DATE) as T) ";     
    rs=statement.executeQuery(query);
    while(rs.next())
    {
        if(rs.getString("Date")!=null)
    HighPurDay=rs.getString("Date")+" : "+rs.getString("total")+" NRS";
    }
    
          return totPurAmt+","+HighPurDay;
      }
         
         
    
} 