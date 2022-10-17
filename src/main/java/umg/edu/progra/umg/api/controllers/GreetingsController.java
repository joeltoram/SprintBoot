package umg.edu.progra.umg.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingsController.class);
    
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {        
        LOGGER.info("Este es el inicio del log");
        LOGGER.debug("parametro recibido: {}", name);
        return "Hola " + name + "!";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("Este es el inicio del log");
        return "Hola mundo!";
    }

}
