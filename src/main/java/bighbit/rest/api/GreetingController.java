package bighbit.rest.api;

import bighbit.model.Greeting;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class GreetingController {


    @GetMapping("/q")
    public ResponseEntity getGreeting(@RequestParam("fn") String firstName,
                                      @RequestParam("ln") String lastName){
       return ResponseEntity.ok(new Greeting(firstName,lastName));


    }
    
}
