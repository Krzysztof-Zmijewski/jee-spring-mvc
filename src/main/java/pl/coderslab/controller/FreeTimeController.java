package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDateTime;


@Controller
public class FreeTimeController {

    @GetMapping("/freeTime")
    @ResponseBody
    public String freeTime(){
        LocalDateTime dateTime = LocalDateTime.now();
        if(dateTime.getDayOfWeek().equals(DayOfWeek.SATURDAY) || dateTime.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
        return "Wolne";
        }
        if (dateTime.getHour() >= 9 && dateTime.getHour() < 19) {
            return "Pracuję, nie dzwoń";
        } else {
            return "Po pracy";
        }
    }

}
