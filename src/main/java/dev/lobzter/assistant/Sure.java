package dev.lobzter.assistant;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class Sure {

    @Value("${google.gemini.api.key}")
    private String apiKey;

    @Value("${google.gemini.api.base-url}")
    private String apiUrl;


    public  void prompt(){
        Client client = new Client();


        GenerateContentResponse response = client.models.generateContent("gemini-2.0-flash","Explain yourself", null);
        System.out.println(response);
    }

}
