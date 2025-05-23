package dev.lobzter.assistant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/inquire")
public class GeminiController {
    private  final  GeminiService geminiService;



    public GeminiController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }




    @GetMapping
    public Mono<String> prompt(@RequestParam String question){
        return geminiService.generateText(question);
    }
}
