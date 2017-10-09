package condominio.santana.dao;

import condominio.santana.model.Proprietario;
import condominio.santana.util.GenericDAO;

public class ProprietarioDAO extends GenericDAO<Proprietario>{
    
    @Override
    public Class<Proprietario> getClassType(){
        return Proprietario.class;
    }
    
}
