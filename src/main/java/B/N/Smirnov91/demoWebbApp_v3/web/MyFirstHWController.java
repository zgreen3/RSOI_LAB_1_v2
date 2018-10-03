package B.N.Smirnov91.demoWebbApp_v3.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstHWController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String responsePrint(@RequestParam(value = "name", defaultValue = "stranger") String name) {
        return "Hello, " + name + "!";
    }
}
