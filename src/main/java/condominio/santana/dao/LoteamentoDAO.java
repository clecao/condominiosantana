package condominio.santana.dao;

import condominio.santana.model.Loteamento;
import condominio.santana.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author clean
 */
public class LoteamentoDAO extends GenericDAO<Loteamento> {
    
    @Override
    public Class<Loteamento> getClassType(){
        return Loteamento.class;
    }
    
    public List<Loteamento> buscarPorNome(String ltm_Loteamento) {
        String jpql = "select p from tb_loteamentos p where p.ltm_Loteamento like :ltm_Loteamento";
        TypedQuery<Loteamento> query = getEm().createQuery(jpql, Loteamento.class).setMaxResults(10);
        query.setParameter("loteamento", "%"+ ltm_Loteamento + "%");
        return query.getResultList();
    }
    
}
