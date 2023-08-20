package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
@RequestMapping("random")
public class RandomController {

    @GetMapping("show-random")
    @ResponseBody
    public String randomNumber() {
        Random r = new Random();
        return String.valueOf(r.nextInt(100));
    }
    @GetMapping("{max}")
    @ResponseBody
    public String getMaxRandom(@PathVariable("max") int max){
        int result = new Random().nextInt(max) + 1;
        return "Wylosowana liczba: " + result;
    }

    @GetMapping("{min}/{max}")
    @ResponseBody
    public String getMinAndMaxRandom(@PathVariable("min") int min,
                                     @PathVariable("max") int max) {
        int result = new Random().nextInt(max - min) + min;
        return "Wylosowana liczba: " + result;
    }
}
