package dk.kea.swc3.dat17c.demo.Users.controller;

import dk.kea.swc3.dat17c.demo.Users.model.User;
import dk.kea.swc3.dat17c.demo.Users.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private userRepository userRepo;

    @GetMapping("/User")
    //@ResponseBody
    public ModelAndView index(@RequestParam(defaultValue = "{{user}}") String name,
                              @RequestParam(defaultValue = "-1") Integer age,
                              @RequestParam(defaultValue = "F") String gender)
    {
        Character gender1 = gender.charAt(0);
        User u = new User(name, age, gender1);
        ModelAndView mv = new ModelAndView("User");
        mv.getModel().put("user", u);
        return mv;
    }

    @GetMapping("/User/add")
    @ResponseBody
    public User saveUser(@RequestParam(defaultValue = "NO_NAME")String name,
                           @RequestParam(defaultValue = "-1") Integer age,
                           @RequestParam(defaultValue = "0") Character gender){
        User user = new User(name, age, gender);
        userRepo.save(user);
        return user;
    }

    @GetMapping("User/delete")
    @ResponseBody
    public String  deleteUser(@RequestParam(defaultValue = "-1")Long id){
        if(userRepo.exists(id)) {
            userRepo.delete(id);
            return "Deleted";
        }
        return "No user with that id";
    }

}
