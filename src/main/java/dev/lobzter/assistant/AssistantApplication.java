package dev.lobzter.assistant;


import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AssistantApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AssistantApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		Client client = new Client();

		GenerateContentResponse response = client.models.generateContent("gemini-2.0-flash","what is the maximum word you can say per prompt , also did you remeber what i asked yuo previously ??", null);
		System.out.println(response);

	}
}
