package com.adhi.booking.controller;
import com.adhi.booking.core.service.GreetService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "greetservice")
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class GreetController {

    @Autowired
    GreetService greetService;

    @GetMapping("/greet/{user}")
    public ResponseEntity<String> greet(@PathVariable("user") String user) {
        String response = greetService.greet(user);
        log.info("Test Service response : ",response);
        return ResponseEntity.ok(response);
    }

}
