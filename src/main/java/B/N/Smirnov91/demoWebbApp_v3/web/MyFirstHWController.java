package B.N.Smirnov91.demoWebbApp_v3.web;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstHWController {
    @RequestMapping("/hello")
    public String responsePrint(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }
}
