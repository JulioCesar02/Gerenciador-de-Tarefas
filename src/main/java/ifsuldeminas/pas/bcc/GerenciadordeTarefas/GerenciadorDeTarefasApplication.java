package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = "ifsuldeminas.pas.bcc.GerenciadordeTarefas")
public class GerenciadorDeTarefasApplication {

    public static void main(String[] args) {
        SpringApplication.run(GerenciadorDeTarefasApplication.class, args);
    }

    @RestController
    public static class StaticController {
        @GetMapping("/")
        public String index() {
            return "index";
        }
    }
}


