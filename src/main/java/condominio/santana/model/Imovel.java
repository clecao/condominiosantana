package condominio.santana.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "tb_imoveis")
public class Imovel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imo_id;
    private String imo_Quadra;
    private String imo_Lote;
    private String imo_EndLogradouro;
    private String imo_EndBairro;
    private String imo_EndCEP;
    private double imo_Fente;
    private double imo_Fundos;
    private double imo_Area;
    private String imo_Aquisição;
    private String imo_Sequencial;
    private String imo_Inscrição;
    private Boolean imo_Vendido;
    private String imo_DataVenda;
    private String imo_Valor;
    private String imo_SituacaoCartorial;
    private String imo_Matricula;
    private String imo_SitFiscal;
    private String imo_BaixaPMN;
    private String imo_IRPF;
    private String imo_Obs;
    @ManyToOne
    private Comprador comprador;
    @ManyToOne
    private Proprietario proprietario;
    @ManyToOne
    private Loteamento loteamento;

    public Imovel() {
    }

    public Imovel(int imo_id, String imo_Quadra, String imo_Lote, String imo_EndLogradouro, String imo_EndBairro, String imo_EndCEP, double imo_Fente, double imo_Fundos, double imo_Area, String imo_Aquisição, String imo_Sequencial, String imo_Inscrição, Boolean imo_Vendido, String imo_DataVenda, String imo_Valor, String imo_SituacaoCartorial, String imo_Matricula, String imo_SitFiscal, String imo_BaixaPMN, String imo_IRPF, String imo_Obs, Comprador comprador, Proprietario proprietario, Loteamento loteamento) {
        this.imo_id = imo_id;
        this.imo_Quadra = imo_Quadra;
        this.imo_Lote = imo_Lote;
        this.imo_EndLogradouro = imo_EndLogradouro;
        this.imo_EndBairro = imo_EndBairro;
        this.imo_EndCEP = imo_EndCEP;
        this.imo_Fente = imo_Fente;
        this.imo_Fundos = imo_Fundos;
        this.imo_Area = imo_Area;
        this.imo_Aquisição = imo_Aquisição;
        this.imo_Sequencial = imo_Sequencial;
        this.imo_Inscrição = imo_Inscrição;
        this.imo_Vendido = imo_Vendido;
        this.imo_DataVenda = imo_DataVenda;
        this.imo_Valor = imo_Valor;
        this.imo_SituacaoCartorial = imo_SituacaoCartorial;
        this.imo_Matricula = imo_Matricula;
        this.imo_SitFiscal = imo_SitFiscal;
        this.imo_BaixaPMN = imo_BaixaPMN;
        this.imo_IRPF = imo_IRPF;
        this.imo_Obs = imo_Obs;
        this.comprador = comprador;
        this.proprietario = proprietario;
        this.loteamento = loteamento;
    }

    public int getImo_id() {
        return imo_id;
    }

    public void setImo_id(int imo_id) {
        this.imo_id = imo_id;
    }

    public String getImo_Quadra() {
        return imo_Quadra;
    }

    public void setImo_Quadra(String imo_Quadra) {
        this.imo_Quadra = imo_Quadra;
    }

    public String getImo_Lote() {
        return imo_Lote;
    }

    public void setImo_Lote(String imo_Lote) {
        this.imo_Lote = imo_Lote;
    }

    public String getImo_EndLogradouro() {
        return imo_EndLogradouro;
    }

    public void setImo_EndLogradouro(String imo_EndLogradouro) {
        this.imo_EndLogradouro = imo_EndLogradouro;
    }

    public String getImo_EndBairro() {
        return imo_EndBairro;
    }

    public void setImo_EndBairro(String imo_EndBairro) {
        this.imo_EndBairro = imo_EndBairro;
    }

    public String getImo_EndCEP() {
        return imo_EndCEP;
    }

    public void setImo_EndCEP(String imo_EndCEP) {
        this.imo_EndCEP = imo_EndCEP;
    }

    public double getImo_Fente() {
        return imo_Fente;
    }

    public void setImo_Fente(double imo_Fente) {
        this.imo_Fente = imo_Fente;
    }

    public double getImo_Fundos() {
        return imo_Fundos;
    }

    public void setImo_Fundos(double imo_Fundos) {
        this.imo_Fundos = imo_Fundos;
    }

    public double getImo_Area() {
        return imo_Area;
    }

    public void setImo_Area(double imo_Area) {
        this.imo_Area = imo_Area;
    }

    public String getImo_Aquisição() {
        return imo_Aquisição;
    }

    public void setImo_Aquisição(String imo_Aquisição) {
        this.imo_Aquisição = imo_Aquisição;
    }

    public String getImo_Sequencial() {
        return imo_Sequencial;
    }

    public void setImo_Sequencial(String imo_Sequencial) {
        this.imo_Sequencial = imo_Sequencial;
    }

    public String getImo_Inscrição() {
        return imo_Inscrição;
    }

    public void setImo_Inscrição(String imo_Inscrição) {
        this.imo_Inscrição = imo_Inscrição;
    }

    public Boolean getImo_Vendido() {
        return imo_Vendido;
    }

    public void setImo_Vendido(Boolean imo_Vendido) {
        this.imo_Vendido = imo_Vendido;
    }

    public String getImo_DataVenda() {
        return imo_DataVenda;
    }

    public void setImo_DataVenda(String imo_DataVenda) {
        this.imo_DataVenda = imo_DataVenda;
    }

    public String getImo_Valor() {
        return imo_Valor;
    }

    public void setImo_Valor(String imo_Valor) {
        this.imo_Valor = imo_Valor;
    }

    public String getImo_SituacaoCartorial() {
        return imo_SituacaoCartorial;
    }

    public void setImo_SituacaoCartorial(String imo_SituacaoCartorial) {
        this.imo_SituacaoCartorial = imo_SituacaoCartorial;
    }

    public String getImo_Matricula() {
        return imo_Matricula;
    }

    public void setImo_Matricula(String imo_Matricula) {
        this.imo_Matricula = imo_Matricula;
    }

    public String getImo_SitFiscal() {
        return imo_SitFiscal;
    }

    public void setImo_SitFiscal(String imo_SitFiscal) {
        this.imo_SitFiscal = imo_SitFiscal;
    }

    public String getImo_BaixaPMN() {
        return imo_BaixaPMN;
    }

    public void setImo_BaixaPMN(String imo_BaixaPMN) {
        this.imo_BaixaPMN = imo_BaixaPMN;
    }

    public String getImo_IRPF() {
        return imo_IRPF;
    }

    public void setImo_IRPF(String imo_IRPF) {
        this.imo_IRPF = imo_IRPF;
    }

    public String getImo_Obs() {
        return imo_Obs;
    }

    public void setImo_Obs(String imo_Obs) {
        this.imo_Obs = imo_Obs;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Loteamento getLoteamento() {
        return loteamento;
    }

    public void setLoteamento(Loteamento loteamento) {
        this.loteamento = loteamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.imo_id;
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
        final Imovel other = (Imovel) obj;
        if (this.imo_id != other.imo_id) {
            return false;
        }
        if (Double.doubleToLongBits(this.imo_Fente) != Double.doubleToLongBits(other.imo_Fente)) {
            return false;
        }
        if (Double.doubleToLongBits(this.imo_Fundos) != Double.doubleToLongBits(other.imo_Fundos)) {
            return false;
        }
        if (Double.doubleToLongBits(this.imo_Area) != Double.doubleToLongBits(other.imo_Area)) {
            return false;
        }
        if (!Objects.equals(this.imo_Quadra, other.imo_Quadra)) {
            return false;
        }
        if (!Objects.equals(this.imo_Lote, other.imo_Lote)) {
            return false;
        }
        if (!Objects.equals(this.imo_EndLogradouro, other.imo_EndLogradouro)) {
            return false;
        }
        if (!Objects.equals(this.imo_EndBairro, other.imo_EndBairro)) {
            return false;
        }
        if (!Objects.equals(this.imo_EndCEP, other.imo_EndCEP)) {
            return false;
        }
        if (!Objects.equals(this.imo_Aquisição, other.imo_Aquisição)) {
            return false;
        }
        if (!Objects.equals(this.imo_Sequencial, other.imo_Sequencial)) {
            return false;
        }
        if (!Objects.equals(this.imo_Inscrição, other.imo_Inscrição)) {
            return false;
        }
        if (!Objects.equals(this.imo_DataVenda, other.imo_DataVenda)) {
            return false;
        }
        if (!Objects.equals(this.imo_Valor, other.imo_Valor)) {
            return false;
        }
        if (!Objects.equals(this.imo_SituacaoCartorial, other.imo_SituacaoCartorial)) {
            return false;
        }
        if (!Objects.equals(this.imo_Matricula, other.imo_Matricula)) {
            return false;
        }
        if (!Objects.equals(this.imo_SitFiscal, other.imo_SitFiscal)) {
            return false;
        }
        if (!Objects.equals(this.imo_BaixaPMN, other.imo_BaixaPMN)) {
            return false;
        }
        if (!Objects.equals(this.imo_IRPF, other.imo_IRPF)) {
            return false;
        }
        if (!Objects.equals(this.imo_Obs, other.imo_Obs)) {
            return false;
        }
        if (!Objects.equals(this.imo_Vendido, other.imo_Vendido)) {
            return false;
        }
        if (!Objects.equals(this.comprador, other.comprador)) {
            return false;
        }
        if (!Objects.equals(this.proprietario, other.proprietario)) {
            return false;
        }
        if (!Objects.equals(this.loteamento, other.loteamento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Imovel{" + "imo_id=" + imo_id + ", imo_Quadra=" + imo_Quadra + ", imo_Lote=" + imo_Lote + ", imo_EndLogradouro=" + imo_EndLogradouro + ", imo_EndBairro=" + imo_EndBairro + ", imo_EndCEP=" + imo_EndCEP + ", imo_Fente=" + imo_Fente + ", imo_Fundos=" + imo_Fundos + ", imo_Area=" + imo_Area + ", imo_Aquisi\u00e7\u00e3o=" + imo_Aquisição + ", imo_Sequencial=" + imo_Sequencial + ", imo_Inscri\u00e7\u00e3o=" + imo_Inscrição + ", imo_Vendido=" + imo_Vendido + ", imo_DataVenda=" + imo_DataVenda + ", imo_Valor=" + imo_Valor + ", imo_SituacaoCartorial=" + imo_SituacaoCartorial + ", imo_Matricula=" + imo_Matricula + ", imo_SitFiscal=" + imo_SitFiscal + ", imo_BaixaPMN=" + imo_BaixaPMN + ", imo_IRPF=" + imo_IRPF + ", imo_Obs=" + imo_Obs + ", comprador=" + comprador + ", proprietario=" + proprietario + ", loteamento=" + loteamento + '}';
    }
    
    
    
    
    
}
