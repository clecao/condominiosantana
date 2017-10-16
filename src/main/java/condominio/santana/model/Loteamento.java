package condominio.santana.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tb_loteamentos")
public class Loteamento implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ltm_Id;
    private String ltm_Loteamento;
    private String ltm_Descricao;
    private String ltm_OBS;

    public Loteamento() {
    }

    public Loteamento(int ltm_Id, String ltm_Loteamento, String ltm_Descricao, String ltm_OBS) {
        this.ltm_Id = ltm_Id;
        this.ltm_Loteamento = ltm_Loteamento;
        this.ltm_Descricao = ltm_Descricao;
        this.ltm_OBS = ltm_OBS;
    }

    public int getLtm_Id() {
        return ltm_Id;
    }

    public void setLtm_Id(int ltm_Id) {
        this.ltm_Id = ltm_Id;
    }

    public String getLtm_Loteamento() {
        return ltm_Loteamento;
    }

    public void setLtm_Loteamento(String ltm_Loteamento) {
        this.ltm_Loteamento = ltm_Loteamento;
    }

    public String getLtm_Descricao() {
        return ltm_Descricao;
    }

    public void setLtm_Descricao(String ltm_Descricao) {
        this.ltm_Descricao = ltm_Descricao;
    }

    public String getLtm_OBS() {
        return ltm_OBS;
    }

    public void setLtm_OBS(String ltm_OBS) {
        this.ltm_OBS = ltm_OBS;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.ltm_Id;
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
        final Loteamento other = (Loteamento) obj;
        if (this.ltm_Id != other.ltm_Id) {
            return false;
        }
        if (!Objects.equals(this.ltm_Loteamento, other.ltm_Loteamento)) {
            return false;
        }
        if (!Objects.equals(this.ltm_Descricao, other.ltm_Descricao)) {
            return false;
        }
        if (!Objects.equals(this.ltm_OBS, other.ltm_OBS)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Loteamento{" + "ltm_Id=" + ltm_Id + ", ltm_Loteamento=" + ltm_Loteamento + ", ltm_Descricao=" + ltm_Descricao + ", ltm_OBS=" + ltm_OBS + '}';
    }
    
    
    
    
}
