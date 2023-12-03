package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> getAllTarefas() {
        return tarefaService.getAllTarefas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> getTarefaById(@PathVariable Long id) {
        Tarefa tarefa = tarefaService.getTarefaById(id);
        return ResponseEntity.ok(tarefa);
    }

    @PostMapping
    public ResponseEntity<Tarefa> createTarefa(@RequestBody Tarefa tarefa) {
        Tarefa novaTarefa = tarefaService.createTarefa(tarefa);
        return new ResponseEntity<>(novaTarefa, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> updateTarefa(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        Tarefa tarefaAtualizada = tarefaService.updateTarefa(id, tarefa);
        return ResponseEntity.ok(tarefaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTarefa(@PathVariable Long id) {
        tarefaService.deleteTarefa(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
