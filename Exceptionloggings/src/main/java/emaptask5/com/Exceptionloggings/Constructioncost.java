package emaptask5.com.Exceptionloggings;
import java.util.Scanner;
import java.util.logging.Logger;
	public class Constructioncost {
    public static void Evaluate() {
			Logger LOGGER = Logger.getLogger( Constructioncost.class.getName());
			Scanner sc= new Scanner(System.in);
			LOGGER.info("Enter the estimated cost of construction");
			LOGGER.info("Materials Available");
			LOGGER.info("1. construction with standard materials");
			LOGGER.info("2. construction with above standard materials");
			LOGGER.info("3. construction with high standard materials");
			LOGGER.info("4. construction with high standard materials and fully automated");
			LOGGER.info("Enter any choice 1,2,3,4: ");
			try {
				int choice=sc.nextInt();
				LOGGER.info("Enter houses area covered: ");
				switch(choice){
				case 1:
					LOGGER.info("Cost ="+sc.nextDouble()*1200 +" INR");
				   break;
				case 2:
					LOGGER.info("Cost ="+sc.nextDouble()*1500 +" INR");
					break;
				case 3:
					LOGGER.info("Cost ="+sc.nextDouble()*1800 +" INR");
				   break;
				case 4:
					LOGGER.info("Cost ="+sc.nextDouble()*2500 +" INR");
				   break;
				default:
					LOGGER.info("Value entered is Invalid ");
					}
				}
			catch (Exception e) {
				LOGGER.info("Please enter a valid input");
			}
		}
	}

