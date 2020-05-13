package Mustknowconceptlogs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class basicconfiguratorexample 
{

	static Logger log = Logger.getLogger(basicconfiguratorexample.class);
	
	public static void main(String args[])
	{
		BasicConfigurator.configure();
		log.debug("debug logger");
		log.info("log info");
		log.warn("warning message");
		log.error("error message");
		log.fatal("fatal message");
		
	}
	
}
