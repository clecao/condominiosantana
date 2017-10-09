package condominio.santana.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "tb_processos")
public class Processo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pro_Id;
    private String pro_Codigo;
    private String pro_Processo;
    private String pro_HiperLink;
    private boolean pro_Mov;
    @Temporal(TemporalType.DATE)
    private Calendar pro_MovDt;
    private Calendar pro_ExcecaoData;
    private Calendar pro_EmbargoData;
    private Calendar pro_MovDt;
    
       private String pro_Codigo;
    
    
    
}
