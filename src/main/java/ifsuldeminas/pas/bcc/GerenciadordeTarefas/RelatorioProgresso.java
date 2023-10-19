package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import java.util.Date;

public class RelatorioProgresso {
    private int ID;
    private Usuario usuario; // Relacionamento: Um relatório de progresso pertence a um usuário
    private Date Data_Relatorio;
    private int Cumprimento_Prazo;
    private int Cumprimento_Tarefas;

    public RelatorioProgresso(int ID, Usuario usuario, Date Data_Relatorio, int Cumprimento_Prazo, int Cumprimento_Tarefas) {
        this.ID = ID;
        this.usuario = usuario;
        this.Data_Relatorio = Data_Relatorio;
        this.Cumprimento_Prazo = Cumprimento_Prazo;
        this.Cumprimento_Tarefas = Cumprimento_Tarefas;
    }

}
