package dk.kea.swc3.dat17c.demo.Users.controller;

import dk.kea.swc3.dat17c.demo.Users.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/")
    //@ResponseBody
    public ModelAndView index(@RequestParam(defaultValue = "{{user}}") String name,
                              @RequestParam(defaultValue = "-1") Integer age,
                              @RequestParam(defaultValue = "F") String gender)
    {
        Character gender1 = gender.charAt(0);
        User u = new User(name, age, gender1);
        ModelAndView mv = new ModelAndView("index");
        mv.getModel().put("user", u);
        return mv;
    }

}
