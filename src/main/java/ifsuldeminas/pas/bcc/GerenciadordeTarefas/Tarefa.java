package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private Date prazo;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "proprietario_id")
    private Usuario proprietario;

    @ManyToOne
    @JoinColumn(name = "colaborador_id")
    private Usuario colaborador;

    @ManyToOne
    @JoinColumn(name = "calendario_id")
    private Calendario calendario;

    // Construtor vazio (necessário para JPA)
    public Tarefa() {
    }

    // Construtor com parâmetros
    public Tarefa(String titulo, String descricao, Date prazo, Prioridade prioridade, Status status,
                  Usuario proprietario, Usuario colaborador, Calendario calendario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
        this.status = status;
        this.proprietario = proprietario;
        this.colaborador = colaborador;
        this.calendario = calendario;
    }

    // Getters e setters
    public Long getId() {
        return id;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Usuario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Usuario proprietario) {
        this.proprietario = proprietario;
    }

    public Usuario getColaborador() {
        return colaborador;
    }

    public void setColaborador(Usuario colaborador) {
        this.colaborador = colaborador;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    // Implementações adicionais conforme necessário
}

