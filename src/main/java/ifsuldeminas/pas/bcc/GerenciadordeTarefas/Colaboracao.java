package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

enum TipoColaboracao {
    COLABORADOR, PROPRIETARIO
}
public class Colaboracao {
    private int ID;
    private Tarefa tarefa; // Relacionamento: Uma colaboração está associada a uma tarefa
    private Usuario usuario; // Relacionamento: Uma colaboração pertence a um usuário
    private TipoColaboracao tipoColaboracao;

    public Colaboracao(int ID, Tarefa tarefa, Usuario usuario, TipoColaboracao tipoColaboracao) {
        this.ID = ID;
        this.tarefa = tarefa;
        this.usuario = usuario;
        this.tipoColaboracao = tipoColaboracao;
    }

}

