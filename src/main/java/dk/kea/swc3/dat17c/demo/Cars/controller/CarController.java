package dk.kea.swc3.dat17c.demo.Cars.controller;

import dk.kea.swc3.dat17c.demo.Cars.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {

    @GetMapping("/cars")
    public ModelAndView carIndex(@RequestParam(defaultValue = "bmw") String model){
        Car c = new Car(model);
        ModelAndView mv = new ModelAndView("cars");
        mv.getModel().put("car", c);
        return mv;
    }
}
