package condominio.santana.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tb_donos")
public class Proprietario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int don_Id;
    private String don_NomeCompleto;
    private String don_Cpf;
    private String don_Nome;
    private String don_Simbolo;
    private String don_Clular;
    private String don_EndLogradouro;
    private String don_EndNum;
    private String don_EndComplemento;
    private String don_EndBairro;
    private String don_EndCidade;
    private String don_EndCep;
    private String don_EndUf;
    private String don_Obs;
    
    public Proprietario() {
    }

    public Proprietario(int don_Id, String don_NomeCompleto, String don_Cpf, String don_Nome, String don_Simbolo, String don_Clular, String don_EndLogradouro, String don_EndNum, String don_EndComplemento, String don_EndBairro, String don_EndCidade, String don_EndCep, String don_EndUf, String don_Obs) {
        this.don_Id = don_Id;
        this.don_NomeCompleto = don_NomeCompleto;
        this.don_Cpf = don_Cpf;
        this.don_Nome = don_Nome;
        this.don_Simbolo = don_Simbolo;
        this.don_Clular = don_Clular;
        this.don_EndLogradouro = don_EndLogradouro;
        this.don_EndNum = don_EndNum;
        this.don_EndComplemento = don_EndComplemento;
        this.don_EndBairro = don_EndBairro;
        this.don_EndCidade = don_EndCidade;
        this.don_EndCep = don_EndCep;
        this.don_EndUf = don_EndUf;
        this.don_Obs = don_Obs;
    }

    public int getDon_Id() {
        return don_Id;
    }

    public void setDon_Id(int don_Id) {
        this.don_Id = don_Id;
    }

    public String getDon_NomeCompleto() {
        return don_NomeCompleto;
    }

    public void setDon_NomeCompleto(String don_NomeCompleto) {
        this.don_NomeCompleto = don_NomeCompleto;
    }

    public String getDon_Cpf() {
        return don_Cpf;
    }

    public void setDon_Cpf(String don_Cpf) {
        this.don_Cpf = don_Cpf;
    }

    public String getDon_Nome() {
        return don_Nome;
    }

    public void setDon_Nome(String don_Nome) {
        this.don_Nome = don_Nome;
    }

    public String getDon_Simbolo() {
        return don_Simbolo;
    }

    public void setDon_Simbolo(String don_Simbolo) {
        this.don_Simbolo = don_Simbolo;
    }

    public String getDon_Clular() {
        return don_Clular;
    }

    public void setDon_Clular(String don_Clular) {
        this.don_Clular = don_Clular;
    }

    public String getDon_EndLogradouro() {
        return don_EndLogradouro;
    }

    public void setDon_EndLogradouro(String don_EndLogradouro) {
        this.don_EndLogradouro = don_EndLogradouro;
    }

    public String getDon_EndNum() {
        return don_EndNum;
    }

    public void setDon_EndNum(String don_EndNum) {
        this.don_EndNum = don_EndNum;
    }

    public String getDon_EndComplemento() {
        return don_EndComplemento;
    }

    public void setDon_EndComplemento(String don_EndComplemento) {
        this.don_EndComplemento = don_EndComplemento;
    }

    public String getDon_EndBairro() {
        return don_EndBairro;
    }

    public void setDon_EndBairro(String don_EndBairro) {
        this.don_EndBairro = don_EndBairro;
    }

    public String getDon_EndCidade() {
        return don_EndCidade;
    }

    public void setDon_EndCidade(String don_EndCidade) {
        this.don_EndCidade = don_EndCidade;
    }

    public String getDon_EndCep() {
        return don_EndCep;
    }

    public void setDon_EndCep(String don_EndCep) {
        this.don_EndCep = don_EndCep;
    }

    public String getDon_EndUf() {
        return don_EndUf;
    }

    public void setDon_EndUf(String don_EndUf) {
        this.don_EndUf = don_EndUf;
    }

    public String getDon_Obs() {
        return don_Obs;
    }

    public void setDon_Obs(String don_Obs) {
        this.don_Obs = don_Obs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.don_Id;
        hash = 79 * hash + Objects.hashCode(this.don_NomeCompleto);
        hash = 79 * hash + Objects.hashCode(this.don_Cpf);
        hash = 79 * hash + Objects.hashCode(this.don_Nome);
        hash = 79 * hash + Objects.hashCode(this.don_Simbolo);
        hash = 79 * hash + Objects.hashCode(this.don_Clular);
        hash = 79 * hash + Objects.hashCode(this.don_EndLogradouro);
        hash = 79 * hash + Objects.hashCode(this.don_EndNum);
        hash = 79 * hash + Objects.hashCode(this.don_EndComplemento);
        hash = 79 * hash + Objects.hashCode(this.don_EndBairro);
        hash = 79 * hash + Objects.hashCode(this.don_EndCidade);
        hash = 79 * hash + Objects.hashCode(this.don_EndCep);
        hash = 79 * hash + Objects.hashCode(this.don_EndUf);
        hash = 79 * hash + Objects.hashCode(this.don_Obs);
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
        final Proprietario other = (Proprietario) obj;
        if (this.don_Id != other.don_Id) {
            return false;
        }
        if (!Objects.equals(this.don_NomeCompleto, other.don_NomeCompleto)) {
            return false;
        }
        if (!Objects.equals(this.don_Cpf, other.don_Cpf)) {
            return false;
        }
        if (!Objects.equals(this.don_Nome, other.don_Nome)) {
            return false;
        }
        if (!Objects.equals(this.don_Simbolo, other.don_Simbolo)) {
            return false;
        }
        if (!Objects.equals(this.don_Clular, other.don_Clular)) {
            return false;
        }
        if (!Objects.equals(this.don_EndLogradouro, other.don_EndLogradouro)) {
            return false;
        }
        if (!Objects.equals(this.don_EndNum, other.don_EndNum)) {
            return false;
        }
        if (!Objects.equals(this.don_EndComplemento, other.don_EndComplemento)) {
            return false;
        }
        if (!Objects.equals(this.don_EndBairro, other.don_EndBairro)) {
            return false;
        }
        if (!Objects.equals(this.don_EndCidade, other.don_EndCidade)) {
            return false;
        }
        if (!Objects.equals(this.don_EndCep, other.don_EndCep)) {
            return false;
        }
        if (!Objects.equals(this.don_EndUf, other.don_EndUf)) {
            return false;
        }
        if (!Objects.equals(this.don_Obs, other.don_Obs)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Proprietario{" + "don_Id=" + don_Id + ", don_NomeCompleto=" + don_NomeCompleto + ", don_Cpf=" + don_Cpf + ", don_Nome=" + don_Nome + ", don_Simbolo=" + don_Simbolo + ", don_Clular=" + don_Clular + ", don_EndLogradouro=" + don_EndLogradouro + ", don_EndNum=" + don_EndNum + ", don_EndComplemento=" + don_EndComplemento + ", don_EndBairro=" + don_EndBairro + ", don_EndCidade=" + don_EndCidade + ", don_EndCep=" + don_EndCep + ", don_EndUf=" + don_EndUf + ", don_Obs=" + don_Obs + '}';
    }

    
    
    
    
}
