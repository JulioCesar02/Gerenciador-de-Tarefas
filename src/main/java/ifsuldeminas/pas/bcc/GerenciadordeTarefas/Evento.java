package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private Date dataHora;

    @ManyToOne
    @JoinColumn(name = "calendario_id")
    private Calendario calendario;

    // Construtor vazio (necessário para JPA)
    public Evento() {
    }

    // Construtor com parâmetros
    public Evento(String descricao, Date dataHora, Calendario calendario) {
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.calendario = calendario;
    }

    // Getters e setters
    public Long getId() {
        return id;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    // Implementações adicionais conforme necessário
}



