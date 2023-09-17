
package com.journaldev.design.facade;
import com.journaldev.design.facade.HelperFacade;
import com.journaldev.design.facade.MySqlHelper;
import com.journaldev.design.facade.OracleHelper;

public class FacadePatternTest {
    public static void main(String[] args){
        String tableName="Employee";
        
         Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.genearateMySqlHTMLReport(tableName , con);
        
        Connection con1 = OracleHelper.getOracleDBConnection();
       OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.genearateOraclePDFReport(tableName , con1);
        
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
         HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
        
        
        
    }
    
}
