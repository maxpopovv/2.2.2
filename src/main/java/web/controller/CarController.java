package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.TheCarService;
import service.TheCarServiceImpl;

@Controller
public class CarController {

    private TheCarService theCarService = new TheCarServiceImpl();

    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count, Model model) {
        if (count <= 0) {
            count = 5;
        }

        model.addAttribute("cars", theCarService.getCars(count));
        return "cars";
    }
}