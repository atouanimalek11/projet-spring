package tn.esprit;






import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;









@RunWith(SpringRunner.class)
@SpringBootTest
public class Clients {
	private static final Logger L = LogManager.getLogger(Clients.class);

	public static Logger getL() {
		return L;
	}
	
	

}
