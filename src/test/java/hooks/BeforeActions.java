package hooks;




import cucumber.api.java.Before;
import utils.SeleniumDriver;

public class BeforeActions  {

	@Before
    public static void setUp() {

    	System.out.println("Before");
       SeleniumDriver.setUpDriver();
    }
}
