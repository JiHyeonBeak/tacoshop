package io.tacoshopservice.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/main")
    public String getMain() {
        return "tacoshop";
    }

    @GetMapping("/getJoin")
    public String getJoin() {
        return "complete";
    }

    @GetMapping("/getDice")
    public String getDice() {
        return "complete";
    }

}
