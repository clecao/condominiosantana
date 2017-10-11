package condominio.santana.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tb_varas")
public class Vara implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int var_Id;
    private String var_Vara;
    private String var_OBS;

    public Vara() {
    }
    
    public Vara(int var_Id, String var_Vara, String var_OBS) {
        this.var_Id = var_Id;
        this.var_Vara = var_Vara;
        this.var_OBS = var_OBS;
    }

    public int getVar_Id() {
        return var_Id;
    }

    public String getVar_Vara() {
        return var_Vara;
    }

    public String getVar_OBS() {
        return var_OBS;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.var_Id;
        hash = 13 * hash + Objects.hashCode(this.var_Vara);
        hash = 13 * hash + Objects.hashCode(this.var_OBS);
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
        final Vara other = (Vara) obj;
        if (this.var_Id != other.var_Id) {
            return false;
        }
        if (!Objects.equals(this.var_Vara, other.var_Vara)) {
            return false;
        }
        if (!Objects.equals(this.var_OBS, other.var_OBS)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vara{" + "var_Id=" + var_Id + ", var_Vara=" + var_Vara + ", var_OBS=" + var_OBS + '}';
    }
    
    
    
    
    

    
}
