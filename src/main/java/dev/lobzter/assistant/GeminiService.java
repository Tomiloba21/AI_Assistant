package dev.lobzter.assistant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@Service
public class GeminiService {


    @Value("${google.gemini.api.key}")
    private String apiKey;

    @Value("${google.gemini.api.base-url}")
    private String apiUrl;



    private final WebClient webClient;

    public GeminiService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> generateText(String question) {
        Map<String, Object> requestBody = Map.of(
                "contents", List.of(
                        Map.of("parts", List.of(
                                Map.of("text", question)
                        ))
                )
        );

        return webClient.post()
                .uri(apiUrl)
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(String.class);
    }

//    public Mono<String> generateText(String question) {
//        Map<String, Object> requestBody = Map.of(
//                "contents", List.of(
//                        Map.of("parts", List.of(
//                                Map.of("text", question)
//                        ))
//                )
//        );
//
//        return webClient.post()
//                .uri(uriBuilder -> uriBuilder
//                        .scheme("https")
//                        .host("generativelanguage.googleapis.com")
//                        .path("/v1beta/models/gemini-2.0-flash:generateContent")
//                        .queryParam("key", apiKey)
//                        .build())
//                .bodyValue(requestBody)
//                .retrieve()
//                .bodyToMono(String.class);
//    }

}