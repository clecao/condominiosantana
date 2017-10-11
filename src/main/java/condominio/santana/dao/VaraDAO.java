package condominio.santana.dao;

import condominio.santana.model.Vara;
import condominio.santana.util.GenericDAO;
/**
 *
 * @author clean
 */
public class VaraDAO extends GenericDAO<Vara> {
    
    @Override
    public Class<Vara> getClassType(){
        return Vara.class;
    }
    
}
