package condominio.santana.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "tb_compradores")
public class Comprador implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int com_Id;
    private String com_Nome;
    private String com_Cpf;
    private String com_Obs;

    public Comprador() {
    }

    public Comprador(int com_Id, String com_Nome, String com_Cpf, String com_Obs) {
        this.com_Id = com_Id;
        this.com_Nome = com_Nome;
        this.com_Cpf = com_Cpf;
        this.com_Obs = com_Obs;
    }

    public int getCom_Id() {
        return com_Id;
    }

    public void setCom_Id(int com_Id) {
        this.com_Id = com_Id;
    }

    public String getCom_Nome() {
        return com_Nome;
    }

    public void setCom_Nome(String com_Nome) {
        this.com_Nome = com_Nome;
    }

    public String getCom_Cpf() {
        return com_Cpf;
    }

    public void setCom_Cpf(String com_Cpf) {
        this.com_Cpf = com_Cpf;
    }

    public String getCom_Obs() {
        return com_Obs;
    }

    public void setCom_Obs(String com_Obs) {
        this.com_Obs = com_Obs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.com_Id;
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
        final Comprador other = (Comprador) obj;
        if (this.com_Id != other.com_Id) {
            return false;
        }
        if (!Objects.equals(this.com_Nome, other.com_Nome)) {
            return false;
        }
        if (!Objects.equals(this.com_Cpf, other.com_Cpf)) {
            return false;
        }
        if (!Objects.equals(this.com_Obs, other.com_Obs)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Comprador{" + "com_Id=" + com_Id + ", com_Nome=" + com_Nome + ", com_Cpf=" + com_Cpf + ", com_Obs=" + com_Obs + '}';
    }


    
}
