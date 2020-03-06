package emaptask5.com.Exceptionloggings;
import java.util.Scanner;
import java.util.logging.Logger;
		public class SimpleCompundInterest_WithLOGGER {
			public static void Calculator(){
				Logger LOGGER = Logger.getLogger( SimpleCompundInterest_WithLOGGER.class.getName());
				Scanner sc=new Scanner(System.in);
				LOGGER.info("Enter the principle amount");
				try {
					double principal = sc.nextDouble();
					LOGGER.info("Enter the time ");
					double time = sc.nextDouble();
					LOGGER.info("Enter the rate of interest");
					double Rate=sc.nextDouble();
					LOGGER.info("Simple Interest :"+(principal*time*Rate)/100);
					LOGGER.info("Compound Interest :"+((principal*Math.pow(1+(Rate/100),time)-principal)));
					}
				catch (Exception e) {
					LOGGER.info("Enter a valid input ... ");
				}
			}
	}

