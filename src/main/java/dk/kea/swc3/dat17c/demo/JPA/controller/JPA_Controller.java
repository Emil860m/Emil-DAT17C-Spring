package dk.kea.swc3.dat17c.demo.JPA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JPA_Controller {
    @GetMapping("/JPA")
    public String JPA(){
        return "JPA";
    }
}
