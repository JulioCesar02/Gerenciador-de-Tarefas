package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import javax.persistence.*;
import java.util.List;

@Entity
public class Calendario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tarefa_id")
    private Tarefa tarefa;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "calendario", cascade = CascadeType.ALL)
    private List<Evento> eventos;

    // Construtor vazio (necessário para JPA)
    public Calendario() {
    }

    // Construtor com parâmetros
    public Calendario(Tarefa tarefa, Usuario usuario, List<Evento> eventos) {
        this.tarefa = tarefa;
        this.usuario = usuario;
        this.eventos = eventos;
    }

    // Getters e setters
    public Long getId() {
        return id;
    }


    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    // Implementações adicionais conforme necessário
}



