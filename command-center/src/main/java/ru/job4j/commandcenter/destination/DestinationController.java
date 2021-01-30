package ru.job4j.commandcenter.destination;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DestinationController {

    @GetMapping(path = "/")
    public String destination() {
        return "Goto Mars unsless It is occupied by aliens. Then go to Jupiter";
    }
}
