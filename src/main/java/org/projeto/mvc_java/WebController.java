package org.projeto.mvc_java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/playgame")
    public String playgame() {
        return "playgame";
    }
}
