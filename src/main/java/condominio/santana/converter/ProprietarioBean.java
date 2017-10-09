package condominio.santana.converter;

import condominio.santana.dao.ProprietarioDAO;
import condominio.santana.model.Proprietario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "proprietarioBean")
public class ProprietarioBean {
    
    private Proprietario proprietario = new Proprietario();
    
    public void salvar() {
        ProprietarioDAO dao = new ProprietarioDAO();
        if (this.proprietario.getDon_Id() == 0) {
            dao.insert(this.proprietario);
        } else {
            dao.update(this.proprietario);
        }
        this.proprietario = new Proprietario();
    }
    
    public void linpar() {
        ProprietarioDAO dao = new ProprietarioDAO();
        this.proprietario = new Proprietario();
    }
    
    public void editar(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
    public void remover(Proprietario proprietario) {
        ProprietarioDAO dao = new ProprietarioDAO();
        dao.delete(proprietario);
    }
    
    public List<Proprietario> getProprietarios() {
        ProprietarioDAO dao = new ProprietarioDAO();
        return dao.selectAll();
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
}
