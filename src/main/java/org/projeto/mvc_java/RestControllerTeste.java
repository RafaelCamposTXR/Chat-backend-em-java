package org.projeto.mvc_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTeste {

        @GetMapping("/teste")
        public String getTeste() {
            return "Hello from Spring Boot!";
        }


}
