package beta;
import org.apache.logging.log4j.*;

public class Demobeta 
{
	private static Logger log = LogManager.getLogger(Demobeta.class.getName());
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		log.debug("I am debugging beta version");
		log.info("Object is present beta version");
		
		log.error("Object is not present beta version");
		log.fatal("This is fatal beta version");
		
	}

}
