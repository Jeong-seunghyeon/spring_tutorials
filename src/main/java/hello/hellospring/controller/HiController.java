package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class HiController {
    @GetMapping("hi")
    public String hi(Model model) {
        model.addAttribute("data", "hi!!");
        return "hi";
    }
}
