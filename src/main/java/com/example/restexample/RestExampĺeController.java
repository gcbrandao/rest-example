package com.example.restexample;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestExampĺeController {

    private static final Logger log = LoggerFactory.getLogger(RestExampĺeController.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/test")
    public void teste() {

        for (int i = 0; i < 100; i++) {

            Quote quote = restTemplate.getForObject(
                    "https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
            log.info("Resultado da Chamada RestExampĺeController:    " + quote.toString());

        }
    }
}
