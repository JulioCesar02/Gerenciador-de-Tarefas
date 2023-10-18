package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import java.util.Date;

public class BackupRestauracao {
    private int ID;
    private Date Data_Backup;
    private String Versao_Backup;
    private Tarefa tarefa; // Relacionamento: Um backup está associado a uma tarefa

    public BackupRestauracao(int ID, Date Data_Backup, String Versao_Backup, Tarefa tarefa) {
        this.ID = ID;
        this.Data_Backup = Data_Backup;
        this.Versao_Backup = Versao_Backup;
        this.tarefa = tarefa;
    }

}