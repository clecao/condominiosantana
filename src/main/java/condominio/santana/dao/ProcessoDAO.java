package condominio.santana.dao;


import condominio.santana.model.Processo;
import condominio.santana.util.GenericDAO;
import java.util.List;

public class ProcessoDAO extends GenericDAO<Processo>{
    @Override
    public Class<Processo> getClassType(){
        return Processo.class;
    }    
   
    
}
