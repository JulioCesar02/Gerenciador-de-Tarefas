package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import java.util.List;

public class Usuario {
    private int ID;
    private String Nome;
    private String Email;
    private String Senha;
    private List<Tarefa> tarefas; // Relacionamento: Um usuário possui várias tarefas
    private List<Calendario> eventos; // Relacionamento: Um usuário possui vários eventos em seu calendário
    private List<Colaboracao> colaboracoes; // Relacionamento: Um usuário colabora em várias tarefas
    private List<RelatorioProgresso> relatorios; // Relacionamento: Um usuário possui vários relatórios de progresso
    private List<Notificacao> notificacoes; // Relacionamento: Um usuário recebe várias notificações

    public Usuario(int ID, String Nome, String Email, String Senha) {
        this.ID = ID;
        this.Nome = Nome;
        this.Email = Email;
        this.Senha = Senha;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void receberNotificacao(Notificacao notificacao) {
        notificacoes.add(notificacao);
    }

}
