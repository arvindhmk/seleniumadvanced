package Mustknowconceptlogs;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class usingxmlconfigurator 
{
	static Logger log = Logger.getLogger(usingxmlconfigurator.class);

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		DOMConfigurator.configure("logger.xml");
		log.debug("debug logger");
		log.info("log info");
		log.warn("warning message");
		log.error("error message");
		log.fatal("fatal message");
	}

}
