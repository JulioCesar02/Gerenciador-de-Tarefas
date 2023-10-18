package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import java.util.Date;
import java.util.List;

enum Prioridade {
    ALTA, MEDIA, BAIXA
}

public class Tarefa {
    private int ID;
    private String Titulo;
    private String Descricao;
    private Date Prazo;
    private Prioridade prioridade;
    private Usuario proprietario; // Relacionamento: Uma tarefa pertence a um usuário (proprietário)
    private Usuario colaborador; // Relacionamento: Uma tarefa pode ter um colaborador
    private List<BackupRestauracao> backups; // Relacionamento: Uma tarefa está associada a vários backups/versões

    public Tarefa(int ID, String Titulo, String Descricao, Date Prazo, Prioridade prioridade, Usuario proprietario, Usuario colaborador) {
        this.ID = ID;
        this.Titulo = Titulo;
        this.Descricao = Descricao;
        this.Prazo = Prazo;
        this.prioridade = prioridade;
        this.proprietario = proprietario;
        this.colaborador = colaborador;
    }

}



