package studentvotesystem.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ProfileController {
    @GetMapping(value = "id")
    String transitionPage() {

        return "/transition";
    }
}
