package condominio.santana.dao;

import condominio.santana.model.Cda;
import condominio.santana.util.GenericDAO;

/**
 *
 * @author clean
 */
public class CdaDAO extends GenericDAO<Cda> {
    @Override
    public Class<Cda> getClassType(){
        return Cda.class;
    }   
    
}
