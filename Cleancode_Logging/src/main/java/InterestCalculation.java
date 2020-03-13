import org.apache.logging.log4j.LogManager;

public class InterestCalculation {
	private static final org.apache.logging.log4j.Logger logger =LogManager.getLogger(InterestCalculation.class);

	public static double simpleIntrest(double p_amt,double rate,double time_period)
	 {
		double si=p_amt*time_period*rate/100;
	     logger.info(si);
	     logger.error("There will be corrrection");
	     logger.warn("there is something wrong in code");
	     logger.fatal("there is any case of abort");
	     return si;
	     
	 }
	 public static double compoundInterest(double p_amt,double rate,double time_period,double times_intrest_applied)
	 {  double cmpnd_amt=p_amt*(Math.pow((1+(rate)/times_intrest_applied), time_period*times_intrest_applied));
	 logger.info(cmpnd_amt);
     logger.error("There will be corrrection");
     logger.warn("there is something wrong in code");
     logger.fatal("there is any case of abort");
     return (cmpnd_amt);
	 }
}