/*package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class GalleriaArteLogManager {
	
	 private static GalleriaArteLogManager singletonInstance;
	  private GalleriaArteLogManager() {
	    super();
	  }

	  public static GalleriaArteLogManager getInstance() {
	    if (singletonInstance==null) {
	      singletonInstance= new GalleriaArteLogManager();

	      String configPath= System.getProperty("GALLERY_ROOT");
	      String propsFileName= configPath.trim()+ "/properties/log4j_rc.properties";
	      String logFileName= configPath.trim()+"/log/log_rc.txt";
	      Properties props= new Properties();

	      try {
	        FileInputStream fis= new FileInputStream(propsFileName);
	        props.load(fis);
	      } catch (FileNotFoundException e) {
	        e.printStackTrace();
	        throw new RuntimeException("Impossibile caricare il file di log: "+propsFileName);
	      } catch (IOException e) {
	        e.printStackTrace();
	        throw new RuntimeException("Impossibile caricare il file di log: "+propsFileName);
	      }

	      props.put("log4j.appender.R.File",logFileName);
	      PropertyConfigurator.configure(props);
	    }
	    return singletonInstance;
	  }

	  public Logger getLog(Class classe) {
	    return Logger.getLogger(classe);
	  }

}*/
