package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarioService {

    @Autowired
    private CalendarioRepository calendarioRepository;

    public List<Calendario> getAllCalendarios() {
        return calendarioRepository.findAll();
    }

    public Calendario getCalendarioById(Long id) {
        return calendarioRepository.findById(id).orElse(null);
    }

    public Calendario createCalendario(Calendario calendario) {
        return calendarioRepository.save(calendario);
    }

    public Calendario updateCalendario(Long id, Calendario calendario) {

        Calendario calendarioExistente = calendarioRepository.findById(id).orElse(null);
        if (calendarioExistente != null) {
            calendarioExistente.setTarefa(calendario.getTarefa());
            calendarioExistente.setUsuario(calendario.getUsuario());
            calendarioExistente.setEventos(calendario.getEventos());
            
            return calendarioRepository.save(calendarioExistente);
        }
        return null; // Ou lançar exceção se não encontrar o calendário
    }

    public void deleteCalendario(Long id) {
        calendarioRepository.deleteById(id);
    }
}

