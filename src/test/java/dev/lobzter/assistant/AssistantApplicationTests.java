package dev.lobzter.assistant;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@SpringBootTest

class AssistantApplicationTests {


	URI uri = UriComponentsBuilder.newInstance()
			.path("inquire")
			.buildAndExpand(1)
			.toUri();


	@Test
	void contextLoads() {

	}

}
