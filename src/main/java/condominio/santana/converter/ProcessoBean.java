package condominio.santana.converter;

import condominio.santana.dao.ImovelDAO;
import condominio.santana.dao.LoteamentoDAO;
import condominio.santana.dao.ProcessoDAO;
import condominio.santana.dao.VaraDAO;
import condominio.santana.model.Imovel;
import condominio.santana.model.Loteamento;
import condominio.santana.model.Processo;
import condominio.santana.model.Proprietario;
import condominio.santana.model.Vara;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "processoBean")
public class ProcessoBean {
    
    private Processo processo = new Processo();
    private final Vara vara = new Vara();
    private Proprietario proprietario = new Proprietario();
    private Loteamento loteamento = new Loteamento();
    
    public void salvar(){
        ProcessoDAO dao = new ProcessoDAO();
        if(this.processo.getPro_Id()==0){
            dao.insert(this.processo);
        } else{
            dao.update(this.processo);
        }
        this.processo=new Processo();
    }
    
    public void excluir(Processo processo){
        ProcessoDAO dao = new ProcessoDAO();
        dao.delete(processo);
    }
    
    public List<Vara>getVaras(){
        VaraDAO dao = new VaraDAO();
        return dao.selectAll();
    }
    
    public List<Imovel>getImovels(){
        ImovelDAO dao = new ImovelDAO();
        return dao.selectAll();
    }
    
    public List<Loteamento>geLoteamentos(){
        LoteamentoDAO dao = new LoteamentoDAO();
        return dao.selectAll();
    }
    
    public List<Processo>getProcessos(){
        ProcessoDAO dao = new ProcessoDAO();
        return dao.selectAll();
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
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
    
    public void editar(Processo processo) {
        this.processo = processo;
    }
    
    
    
}
