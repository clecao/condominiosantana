package condominio.santana.dao;


import condominio.santana.model.Processo;
import condominio.santana.util.GenericDAO;

public class ProcessoDAO extends GenericDAO<Processo>{
    @Override
    public Class<Processo> getClassType(){
        return Processo.class;
    }
  
}
