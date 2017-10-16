package condominio.santana.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
    private String pro_Psq;
    private boolean pro_Mov;
    @Temporal(TemporalType.DATE)
    private Calendar pro_MovDt = Calendar.getInstance();
    @Temporal(TemporalType.DATE)
    private Calendar pro_ExcecaoData  = Calendar.getInstance();
    @Temporal(TemporalType.DATE)
    private Calendar pro_EmbargoData = Calendar.getInstance();
    //@Temporal(TemporalType.DATE)
    //private Calendar pro_ImpugnacaoData = Calendar.getInstance();
    @Temporal(TemporalType.DATE)
    private Calendar pro_NossaResposta = Calendar.getInstance();
    @Temporal(TemporalType.DATE)
    private Calendar pro_ApelacaoData = Calendar.getInstance();
    @Temporal(TemporalType.DATE)
    private Calendar pro_Contrarrazao = Calendar.getInstance();
    @Temporal(TemporalType.DATE)
    private Calendar pro_IdenizacaoData = Calendar.getInstance();
    @Temporal(TemporalType.DATE)
    private Calendar pro_ObsData = Calendar.getInstance();
    private String pro_Situacao;
    private String pro_Penhora;
    private String Pro_Embargo;
    private String pro_ImpugnacaoData;
    private String pro_TJ;
    private String pro_TransitadoEmJulgado;
    private String pro_SentecaProcedencia;
    private String pro_Idenizacao;
    private String pro_OBS;
    @ManyToOne
    private Vara vara;
    @ManyToOne
    private Imovel imovel;

    public Processo() {
    }

    public Processo(int pro_Id, String pro_Codigo, String pro_Processo, String pro_HiperLink, String pro_Psq, boolean pro_Mov, String pro_Situacao, String pro_Penhora, String Pro_Embargo, String pro_ImpugnacaoData, String pro_TJ, String pro_TransitadoEmJulgado, String pro_SentecaProcedencia, String pro_Idenizacao, String pro_OBS, Vara vara, Imovel imovel) {
        this.pro_Id = pro_Id;
        this.pro_Codigo = pro_Codigo;
        this.pro_Processo = pro_Processo;
        this.pro_HiperLink = pro_HiperLink;
        this.pro_Psq = pro_Psq;
        this.pro_Mov = pro_Mov;
        this.pro_Situacao = pro_Situacao;
        this.pro_Penhora = pro_Penhora;
        this.Pro_Embargo = Pro_Embargo;
        this.pro_ImpugnacaoData = pro_ImpugnacaoData;
        this.pro_TJ = pro_TJ;
        this.pro_TransitadoEmJulgado = pro_TransitadoEmJulgado;
        this.pro_SentecaProcedencia = pro_SentecaProcedencia;
        this.pro_Idenizacao = pro_Idenizacao;
        this.pro_OBS = pro_OBS;
        this.vara = vara;
        this.imovel = imovel;
    }

    public int getPro_Id() {
        return pro_Id;
    }

    public void setPro_Id(int pro_Id) {
        this.pro_Id = pro_Id;
    }

    public String getPro_Codigo() {
        return pro_Codigo;
    }

    public void setPro_Codigo(String pro_Codigo) {
        this.pro_Codigo = pro_Codigo;
    }

    public String getPro_Processo() {
        return pro_Processo;
    }

    public void setPro_Processo(String pro_Processo) {
        this.pro_Processo = pro_Processo;
    }

    public String getPro_HiperLink() {
        return pro_HiperLink;
    }

    public void setPro_HiperLink(String pro_HiperLink) {
        this.pro_HiperLink = pro_HiperLink;
    }

    public String getPro_Psq() {
        return pro_Psq;
    }

    public void setPro_Psq(String pro_Psq) {
        this.pro_Psq = pro_Psq;
    }

    public boolean isPro_Mov() {
        return pro_Mov;
    }

    public void setPro_Mov(boolean pro_Mov) {
        this.pro_Mov = pro_Mov;
    }

    public Calendar getPro_MovDt() {
        return pro_MovDt;
    }

    public void setPro_MovDt(Calendar pro_MovDt) {
        this.pro_MovDt = pro_MovDt;
    }

    public Calendar getPro_ExcecaoData() {
        return pro_ExcecaoData;
    }

    public void setPro_ExcecaoData(Calendar pro_ExcecaoData) {
        this.pro_ExcecaoData = pro_ExcecaoData;
    }

    public Calendar getPro_EmbargoData() {
        return pro_EmbargoData;
    }

    public void setPro_EmbargoData(Calendar pro_EmbargoData) {
        this.pro_EmbargoData = pro_EmbargoData;
    }

    public Calendar getPro_NossaResposta() {
        return pro_NossaResposta;
    }

    public void setPro_NossaResposta(Calendar pro_NossaResposta) {
        this.pro_NossaResposta = pro_NossaResposta;
    }

    public Calendar getPro_ApelacaoData() {
        return pro_ApelacaoData;
    }

    public void setPro_ApelacaoData(Calendar pro_ApelacaoData) {
        this.pro_ApelacaoData = pro_ApelacaoData;
    }

    public Calendar getPro_Contrarrazao() {
        return pro_Contrarrazao;
    }

    public void setPro_Contrarrazao(Calendar pro_Contrarrazao) {
        this.pro_Contrarrazao = pro_Contrarrazao;
    }

    public Calendar getPro_IdenizacaoData() {
        return pro_IdenizacaoData;
    }

    public void setPro_IdenizacaoData(Calendar pro_IdenizacaoData) {
        this.pro_IdenizacaoData = pro_IdenizacaoData;
    }

    public Calendar getPro_ObsData() {
        return pro_ObsData;
    }

    public void setPro_ObsData(Calendar pro_ObsData) {
        this.pro_ObsData = pro_ObsData;
    }

    public String getPro_Situacao() {
        return pro_Situacao;
    }

    public void setPro_Situacao(String pro_Situacao) {
        this.pro_Situacao = pro_Situacao;
    }

    public String getPro_Penhora() {
        return pro_Penhora;
    }

    public void setPro_Penhora(String pro_Penhora) {
        this.pro_Penhora = pro_Penhora;
    }

    public String getPro_Embargo() {
        return Pro_Embargo;
    }

    public void setPro_Embargo(String Pro_Embargo) {
        this.Pro_Embargo = Pro_Embargo;
    }

    public String getPro_ImpugnacaoData() {
        return pro_ImpugnacaoData;
    }

    public void setPro_ImpugnacaoData(String pro_ImpugnacaoData) {
        this.pro_ImpugnacaoData = pro_ImpugnacaoData;
    }

    public String getPro_TJ() {
        return pro_TJ;
    }

    public void setPro_TJ(String pro_TJ) {
        this.pro_TJ = pro_TJ;
    }

    public String getPro_TransitadoEmJulgado() {
        return pro_TransitadoEmJulgado;
    }

    public void setPro_TransitadoEmJulgado(String pro_TransitadoEmJulgado) {
        this.pro_TransitadoEmJulgado = pro_TransitadoEmJulgado;
    }

    public String getPro_SentecaProcedencia() {
        return pro_SentecaProcedencia;
    }

    public void setPro_SentecaProcedencia(String pro_SentecaProcedencia) {
        this.pro_SentecaProcedencia = pro_SentecaProcedencia;
    }

    public String getPro_Idenizacao() {
        return pro_Idenizacao;
    }

    public void setPro_Idenizacao(String pro_Idenizacao) {
        this.pro_Idenizacao = pro_Idenizacao;
    }

    public String getPro_OBS() {
        return pro_OBS;
    }

    public void setPro_OBS(String pro_OBS) {
        this.pro_OBS = pro_OBS;
    }

    public Vara getVara() {
        return vara;
    }

    public void setVara(Vara vara) {
        this.vara = vara;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.pro_Id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Processo other = (Processo) obj;
        if (this.pro_Id != other.pro_Id) {
            return false;
        }
        if (this.pro_Mov != other.pro_Mov) {
            return false;
        }
        if (!Objects.equals(this.pro_Codigo, other.pro_Codigo)) {
            return false;
        }
        if (!Objects.equals(this.pro_Processo, other.pro_Processo)) {
            return false;
        }
        if (!Objects.equals(this.pro_HiperLink, other.pro_HiperLink)) {
            return false;
        }
        if (!Objects.equals(this.pro_Psq, other.pro_Psq)) {
            return false;
        }
        if (!Objects.equals(this.pro_Situacao, other.pro_Situacao)) {
            return false;
        }
        if (!Objects.equals(this.pro_Penhora, other.pro_Penhora)) {
            return false;
        }
        if (!Objects.equals(this.Pro_Embargo, other.Pro_Embargo)) {
            return false;
        }
        if (!Objects.equals(this.pro_ImpugnacaoData, other.pro_ImpugnacaoData)) {
            return false;
        }
        if (!Objects.equals(this.pro_TJ, other.pro_TJ)) {
            return false;
        }
        if (!Objects.equals(this.pro_TransitadoEmJulgado, other.pro_TransitadoEmJulgado)) {
            return false;
        }
        if (!Objects.equals(this.pro_SentecaProcedencia, other.pro_SentecaProcedencia)) {
            return false;
        }
        if (!Objects.equals(this.pro_Idenizacao, other.pro_Idenizacao)) {
            return false;
        }
        if (!Objects.equals(this.pro_OBS, other.pro_OBS)) {
            return false;
        }
        if (!Objects.equals(this.pro_MovDt, other.pro_MovDt)) {
            return false;
        }
        if (!Objects.equals(this.pro_ExcecaoData, other.pro_ExcecaoData)) {
            return false;
        }
        if (!Objects.equals(this.pro_EmbargoData, other.pro_EmbargoData)) {
            return false;
        }
        if (!Objects.equals(this.pro_NossaResposta, other.pro_NossaResposta)) {
            return false;
        }
        if (!Objects.equals(this.pro_ApelacaoData, other.pro_ApelacaoData)) {
            return false;
        }
        if (!Objects.equals(this.pro_Contrarrazao, other.pro_Contrarrazao)) {
            return false;
        }
        if (!Objects.equals(this.pro_IdenizacaoData, other.pro_IdenizacaoData)) {
            return false;
        }
        if (!Objects.equals(this.pro_ObsData, other.pro_ObsData)) {
            return false;
        }
        if (!Objects.equals(this.vara, other.vara)) {
            return false;
        }
        if (!Objects.equals(this.imovel, other.imovel)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Processo{" + "pro_Id=" + pro_Id + ", pro_Codigo=" + pro_Codigo + ", pro_Processo=" + pro_Processo + ", pro_HiperLink=" + pro_HiperLink + ", pro_Psq=" + pro_Psq + ", pro_Mov=" + pro_Mov + ", pro_MovDt=" + pro_MovDt + ", pro_ExcecaoData=" + pro_ExcecaoData + ", pro_EmbargoData=" + pro_EmbargoData + ", pro_NossaResposta=" + pro_NossaResposta + ", pro_ApelacaoData=" + pro_ApelacaoData + ", pro_Contrarrazao=" + pro_Contrarrazao + ", pro_IdenizacaoData=" + pro_IdenizacaoData + ", pro_ObsData=" + pro_ObsData + ", pro_Situacao=" + pro_Situacao + ", pro_Penhora=" + pro_Penhora + ", Pro_Embargo=" + Pro_Embargo + ", pro_ImpugnacaoData=" + pro_ImpugnacaoData + ", pro_TJ=" + pro_TJ + ", pro_TransitadoEmJulgado=" + pro_TransitadoEmJulgado + ", pro_SentecaProcedencia=" + pro_SentecaProcedencia + ", pro_Idenizacao=" + pro_Idenizacao + ", pro_OBS=" + pro_OBS + ", vara=" + vara + ", imovel=" + imovel + '}';
    }
    
   
    
}
