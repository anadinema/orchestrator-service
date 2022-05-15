package org.commerce.app.orchestrator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public final Logger log = LogManager.getLogger(UserController.class);

    @GetMapping(value = "/api/users")
    public String users() {
        log.info("Users API was hit! Returning the response.");
        return "Hello World!";
    }
}
