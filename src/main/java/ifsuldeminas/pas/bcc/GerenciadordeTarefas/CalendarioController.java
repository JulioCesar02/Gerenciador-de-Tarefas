package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calendarios")
public class CalendarioController {

    @Autowired
    private CalendarioService calendarioService;

    @GetMapping
    public List<Calendario> getAllCalendarios() {
        return calendarioService.getAllCalendarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calendario> getCalendarioById(@PathVariable Long id) {
        Calendario calendario = calendarioService.getCalendarioById(id);
        return ResponseEntity.ok(calendario);
    }

    @PostMapping
    public ResponseEntity<Calendario> createCalendario(@RequestBody Calendario calendario) {
        Calendario novoCalendario = calendarioService.createCalendario(calendario);
        return new ResponseEntity<>(novoCalendario, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Calendario> updateCalendario(@PathVariable Long id, @RequestBody Calendario calendario) {
        Calendario calendarioAtualizado = calendarioService.updateCalendario(id, calendario);
        return ResponseEntity.ok(calendarioAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCalendario(@PathVariable Long id) {
        calendarioService.deleteCalendario(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

