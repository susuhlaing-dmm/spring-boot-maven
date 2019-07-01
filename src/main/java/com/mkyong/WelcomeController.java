package com.mkyong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET, value = "/hello", produces = "application/json")
    public ResponseEntity<String> hello() {
        System.out.println("Hit me!");
        return new ResponseEntity<String>("Hello, you!", HttpStatus.OK);
    }

}