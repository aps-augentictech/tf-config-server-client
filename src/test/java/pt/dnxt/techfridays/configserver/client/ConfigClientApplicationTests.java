package pt.dnxt.techfridays.configserver.client;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("unit-tests")
@SpringBootTest(classes = { ConfigClientApplication.class })
class ConfigClientApplicationTests {

	@Autowired
	private org.springframework.context.ApplicationContext appCtx;

	@Test
	void contextLoads() {

		assertNotNull(appCtx);
	}

}
