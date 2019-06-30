package ekko.wepark.calendar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/alive")
    public String checkAlive() {
        return "Calendar Service is UP";
    }
}
