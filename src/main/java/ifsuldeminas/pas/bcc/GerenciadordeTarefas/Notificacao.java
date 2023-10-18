package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import java.util.Date;

public class Notificacao {
    private int ID;
    private Usuario usuario; // Relacionamento: Uma notificação pertence a um usuário
    private String Mensagem;
    private Date Data_Hora;

    public Notificacao(int ID, Usuario usuario, String Mensagem, Date Data_Hora) {
        this.ID = ID;
        this.usuario = usuario;
        this.Mensagem = Mensagem;
        this.Data_Hora = Data_Hora;
    }

}