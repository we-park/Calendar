package ekko.wepark.calendar.controller;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalendarController {

    @Autowired private CommandGateway commandGateway;
}
