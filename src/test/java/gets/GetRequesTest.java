package gets;


import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequesTest {
	private static final Logger LOGGER = Logger.getLogger("test");
	@Test
	public void testResponse() {
		Response response = RestAssured.get("http://restcountries.eu/rest/v1/name/norway");
		int statusCode = response.getStatusCode();
		LOGGER.info("Status was: " + Integer.toString(statusCode));	
		Assert.assertEquals(statusCode, 200);
	}

}
