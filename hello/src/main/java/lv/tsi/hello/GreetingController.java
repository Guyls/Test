package lv.tsi.hello;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GreetingController {

    @GetMapping("/Greeting")
    public ResponseEntity<List<Greeting>> getGreeting(){
        List<Greeting> Greetings = new ArrayList<>();
        Greetings.add(new Greeting("Hello my name is John"));
        Greetings.add (new Greeting("Hello my name is Guylain"));
        return ResponseEntity.ok(Greetings);
    }


}
