
package condominio.santana.controller;

import condominio.santana.dao.LoteamentoDAO;
import condominio.santana.model.Loteamento;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author clean
 */

@ViewScoped
@ManagedBean(name = "loteamentoBean")
public class LoteamentoBean {
    
    private Loteamento loteamento = new Loteamento();
    
    public void salvar() {        
        LoteamentoDAO dao = new LoteamentoDAO();        
        if (this.loteamento.getLtm_Id() == 0) {
            dao.insert(this.loteamento);          
        } else {
            dao.update(this.loteamento);
        }
        this.loteamento = new Loteamento();
    }
    
    public void linpar() {
        LoteamentoDAO dao = new LoteamentoDAO();
        this.loteamento = new Loteamento();
    }
    
    public void editar(Loteamento loteamento) {
        this.loteamento = loteamento;
    }
    
    public void remover(Loteamento loteamento) {
        LoteamentoDAO dao = new LoteamentoDAO();
        dao.delete(loteamento);
    }
    
        public List<Loteamento> getLoteamentos() {
        LoteamentoDAO dao = new LoteamentoDAO();
        return dao.selectAll();
    }

    public Loteamento getLoteamento() {
        return loteamento;
    }

    public void setLoteamento(Loteamento loteamento) {
        this.loteamento = loteamento;
    }
        
        
}
