package condominio.santana.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "tb_cda")
public class Cda implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cda_Id;
    private String cda_CDA;
    private double cda_Ano;
    @ManyToOne
    private Processo processo;

    public Cda() {
    }

    public Cda(int cda_Id, String cda_CDA, double cda_Ano, Processo processo) {
        this.cda_Id = cda_Id;
        this.cda_CDA = cda_CDA;
        this.cda_Ano = cda_Ano;
        this.processo = processo;
    }

    public int getCda_Id() {
        return cda_Id;
    }

    public void setCda_Id(int cda_Id) {
        this.cda_Id = cda_Id;
    }

    public String getCda_CDA() {
        return cda_CDA;
    }

    public void setCda_CDA(String cda_CDA) {
        this.cda_CDA = cda_CDA;
    }

    public double getCda_Ano() {
        return cda_Ano;
    }

    public void setCda_Ano(double cda_Ano) {
        this.cda_Ano = cda_Ano;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.cda_Id;
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
        final Cda other = (Cda) obj;
        if (this.cda_Id != other.cda_Id) {
            return false;
        }
        if (Double.doubleToLongBits(this.cda_Ano) != Double.doubleToLongBits(other.cda_Ano)) {
            return false;
        }
        if (!Objects.equals(this.cda_CDA, other.cda_CDA)) {
            return false;
        }
        if (!Objects.equals(this.processo, other.processo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cda{" + "cda_Id=" + cda_Id + ", cda_CDA=" + cda_CDA + ", cda_Ano=" + cda_Ano + ", processo=" + processo + '}';
    }
    
    
    
    
    
    
    
}
