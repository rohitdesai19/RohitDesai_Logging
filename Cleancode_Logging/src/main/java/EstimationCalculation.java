import org.apache.logging.log4j.LogManager;

public class EstimationCalculation {
	private static final org.apache.logging.log4j.Logger logger =LogManager.getLogger(InterestCalculation.class);
	public static double estimator(String material_standard,double area_of_house,Boolean automated_type)
    {  
		double price_estimate=0;
        material_standard=material_standard.toLowerCase();
        if(material_standard.compareTo("standard")==0)
        {
           price_estimate= area_of_house*1200;
           logger.info(price_estimate);
           if(automated_type==true) {
 logger.error("There will be corrrection");
 logger.warn("there is something wrong in code");
 logger.fatal("there is any case of abort");
           }
        }else if(material_standard.compareTo("above standard")==0)
        {
            price_estimate=area_of_house*1500;
          logger.info(price_estimate);
          if(automated_type==true) {
        	  logger.error("There will be corrrection");
        	  logger.warn("there is something wrong in code");
        	  logger.fatal("there is any case of abort");
        }
        }else if(material_standard.compareTo("high standard")==0  )
        {    if(automated_type)
            price_estimate=area_of_house*2500;
            else
            price_estimate=area_of_house*1800;
        logger.info(price_estimate);
 logger.error("There will be corrrection");
 logger.warn("there is something wrong in code");
 logger.fatal("there is any case of abort");
}
        return price_estimate;
    }
}