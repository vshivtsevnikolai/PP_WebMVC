package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServicelmpl;

import java.util.List;

@Controller
public class CarController {
    public CarService carService = new CarServicelmpl();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        List<Car> shCars = carService.carList(count);
        model.addAttribute("cars", shCars);
        return "cars";
    }
}
