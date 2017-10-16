
package condominio.santana.converter;

import condominio.santana.dao.ProprietarioDAO;
import condominio.santana.model.Proprietario;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author clean
 */
@FacesConverter(value = "proprietarioConverter", forClass = Proprietario.class)
public class ProprietarioConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringProprietario) {
        if (stringProprietario != null){
            int id = Integer.parseInt(stringProprietario);
            ProprietarioDAO dao = new ProprietarioDAO();
            return (Object) dao.selectById(id);
        }
        return null;        
    } 
    
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectProprietario) {
        if (objectProprietario != null){
            Proprietario proprietario = (Proprietario) objectProprietario;
            return String.valueOf(proprietario.getDon_Nome());            
        }
        return null;
    }
        
}
