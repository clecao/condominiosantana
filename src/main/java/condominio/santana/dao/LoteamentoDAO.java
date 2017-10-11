package condominio.santana.dao;

import condominio.santana.model.Loteamento;
import condominio.santana.util.GenericDAO;

/**
 *
 * @author clean
 */
public class LoteamentoDAO extends GenericDAO<Loteamento> {
    
    @Override
    public Class<Loteamento> getClassType(){
        return Loteamento.class;
    }
    
}
