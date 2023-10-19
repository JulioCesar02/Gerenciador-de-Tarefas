package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

public class Calendario {
    private int ID;
    private Tarefa tarefa; // Relacionamento: Um evento no calendário está associado a uma tarefa
    private Usuario usuario; // Relacionamento: Um evento no calendário pertence a um usuário
    private String Eventos;

    public Calendario(int ID, Tarefa tarefa, Usuario usuario, String Eventos) {
        this.ID = ID;
        this.tarefa = tarefa;
        this.usuario = usuario;
        this.Eventos = Eventos;
    }

}