package dk.kea.swc3.dat17c.demo.Cars.controller;

import dk.kea.swc3.dat17c.demo.Cars.carRepository;
import dk.kea.swc3.dat17c.demo.Cars.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {
    @Autowired
    private carRepository carRepo;

    @GetMapping("/cars")
    public ModelAndView carIndex(@RequestParam(defaultValue = "bmw") String model){
        Car c = new Car(model);
        ModelAndView mv = new ModelAndView("cars");
        mv.getModel().put("car", c);
        return mv;
    }
    @GetMapping("/cars/add")
    @ResponseBody
    public String saveCar(@RequestParam(defaultValue = "-1") Integer doors,
                          @RequestParam(defaultValue = "NO_COLOR") String color,
                          @RequestParam(defaultValue = "NO_MODEL") String model){
        Car newCar = new Car(model, color, doors);
        carRepo.save(newCar);
        return "OK";
    }
}
