package Mustknowconceptlogs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logUsingpropertyfile 
{
	static Logger log = Logger.getLogger(logUsingpropertyfile.class);

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("log4jprop.properties");
		log.debug("debug logger");
		log.info("log info");
		log.warn("warning message");
		log.error("error message");
		log.fatal("fatal message");
		
		
	}

}
