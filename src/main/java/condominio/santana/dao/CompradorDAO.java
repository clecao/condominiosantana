package condominio.santana.dao;

import condominio.santana.model.Comprador;
import condominio.santana.util.GenericDAO;

/**
 *
 * @author clean
 */
public class CompradorDAO extends GenericDAO<Comprador> {
    
    @Override
    public Class<Comprador> getClassType(){
        return Comprador.class;
    }
    
}
