package pl.coderslab.controller;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping("multiply")
public class MultiplyController {
    @GetMapping("/table")
    public String multiply(Model model, @RequestParam(defaultValue = "10") String size){
        log.info("Starting multiply");
        log.debug("size = " + size);
    model.addAttribute("size", size);
    return "multiplyTable";
    }

    @GetMapping("/paramTable/{rows}/{cols}")
    public String paramMultiply (Model model, @PathVariable String cols, @PathVariable String rows) {
    model.addAttribute("col", cols);
    model.addAttribute("row", rows);
    return "multiplyParamTable";
    }
}
