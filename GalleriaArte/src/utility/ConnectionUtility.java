package utility;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class ConnectionUtility 
{
	 public Connection getConnection() throws Exception 
	 {
		    return getConnectionJndi();
	 }

	  private Connection getConnectionJndi() throws Exception
	  {
	    try 
	    {

	    	String jndiName ="java:/datasources/gallery";
	    	Context initCtx= new InitialContext();
	    	DataSource ds= (DataSource) initCtx.lookup(jndiName);
	    	Connection conn = ds.getConnection();
	    	return conn;
	    } 
	    catch (Exception e) 
	    { 
	    	throw new Exception(e.getMessage(),e);
	    }
	  }
		  
}
