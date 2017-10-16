package condominio.santana.dao;

import condominio.santana.model.Proprietario;
import condominio.santana.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;

public class ProprietarioDAO extends GenericDAO<Proprietario>{
    
    @Override
    public Class<Proprietario> getClassType(){
        return Proprietario.class;
    }
    
    public List<Proprietario> buscarPorNome(String don_Nome) {
        String jpql = "select p from tb_donos p where p.don_Nome like :don_Nome";
        TypedQuery<Proprietario> query = getEm().createQuery(jpql, Proprietario.class).setMaxResults(10);
        query.setParameter("nome", "%"+ don_Nome + "%");
        return query.getResultList();
    }
    
    
}
