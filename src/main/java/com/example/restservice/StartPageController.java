package com.example.restservice;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

// controller class for Https:// calls

@RestController
public class StartPageController {
    private final AtomicLong counter = new AtomicLong();

    //return input text
    @GetMapping("/text")
    public StartPage textPage(){
        InputText in = new InputText();
        String text = in.getInput();
        return new StartPage(counter.incrementAndGet(),String.format(text));
    }

    // return frequency of 10 most common words in input string,
    // sorted in ascending order by frequency
    @GetMapping("/text/count")
    public StartPage frequencyPage(@RequestParam(value = "words", defaultValue = "10") String words){
        InputText in = new InputText();
        String output = "";
        String text = in.getInput();
        output=WordFrequency.wordFreq(text, Integer.parseInt(words));
        return new StartPage(counter.incrementAndGet(),String.format(output));
    }
}
