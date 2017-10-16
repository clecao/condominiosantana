
package condominio.santana.controller;

import condominio.santana.dao.ImovelDAO;
import condominio.santana.dao.ProprietarioDAO;
import condominio.santana.model.Imovel;
import condominio.santana.model.Proprietario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "imovelBean")
public class ImovelBean {
    
    private Imovel imovel = new Imovel();
    
    public void salvar() {
        ImovelDAO dao = new ImovelDAO();
        if (this.imovel.getImo_id() == 0){
            dao.insert(this.imovel);
        } else {
            dao.update(this.imovel);
        }
        this.imovel = new Imovel();
    }
    
    public void limpar() {
        ImovelDAO dao = new ImovelDAO();
        this.imovel = new Imovel();
    }
    
    public void editar(Imovel imovel) {
        this.imovel = imovel;
    }
    
    public void remover(Imovel imovel) {
        ImovelDAO dao = new ImovelDAO();
        dao.delete(imovel);
    }
    public List<Proprietario> getProprietarios() {
        ProprietarioDAO dao = new ProprietarioDAO();
        return dao.selectAll();
    }

     
    public  List<Imovel> getImovels(){
        ImovelDAO dao = new ImovelDAO();
        return dao.selectAll();
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

   
    
    
    
}
