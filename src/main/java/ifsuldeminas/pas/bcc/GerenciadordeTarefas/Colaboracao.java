package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import javax.persistence.*;

@Entity
public class Colaboracao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tarefa_id")
    private Tarefa tarefa;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    private TipoColab tipoColab;

    // Construtor vazio (necessário para JPA)
    public Colaboracao() {
    }

    // Construtor com parâmetros
    public Colaboracao(Tarefa tarefa, Usuario usuario, TipoColab tipoColab) {
        this.tarefa = tarefa;
        this.usuario = usuario;
        this.tipoColab = tipoColab;
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

    public TipoColab getTipoColab() {
        return tipoColab;
    }

    public void setTipoColab(TipoColab tipoColab) {
        this.tipoColab = tipoColab;
    }

    // Implementações adicionais conforme necessário
}


