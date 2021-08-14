package za.ac.cput.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping({"/", "/home", "/index"})
    public String home() {
        return "Home Page";
    }
}
