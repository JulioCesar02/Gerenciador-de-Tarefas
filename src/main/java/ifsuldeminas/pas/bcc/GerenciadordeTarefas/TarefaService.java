package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> getAllTarefas() {
        return tarefaRepository.findAll();
    }

    public Tarefa getTarefaById(Long id) {
        return tarefaRepository.findById(id).orElse(null);
    }

    public Tarefa createTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public Tarefa updateTarefa(Long id, Tarefa tarefa) {
        Tarefa tarefaExistente = tarefaRepository.findById(id).orElse(null);
        if (tarefaExistente != null) {
            tarefaExistente.setTitulo(tarefa.getTitulo());
            tarefaExistente.setDescricao(tarefa.getDescricao());
            tarefaExistente.setPrazo(tarefa.getPrazo());
            tarefaExistente.setPrioridade(tarefa.getPrioridade());
            tarefaExistente.setStatus(tarefa.getStatus());
            
            return tarefaRepository.save(tarefaExistente);
        }
        return null; // Ou lançar exceção se não encontrar a tarefa
    }

    public void deleteTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }
}
