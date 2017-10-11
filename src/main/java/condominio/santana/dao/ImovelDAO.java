package condominio.santana.dao;

import condominio.santana.model.Imovel;
import condominio.santana.util.GenericDAO;

/**
 *
 * @author clean
 */
public class ImovelDAO extends GenericDAO<Imovel> {
    
    @Override
    public Class<Imovel> getClassType(){
        return Imovel.class;
    }
   
}
