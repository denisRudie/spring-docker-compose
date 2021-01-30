package ru.job4j.spaceship.status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpaceshipController {

    @GetMapping(path = "/")
    public String status() {
        String destination;
        String status = "Everything is fine. We are on our way to: ";
        RestTemplate rest = new RestTemplate();
        destination = rest.getForObject("http://commandcenter:8080/", String.class);
        return status + destination;
    }
}
