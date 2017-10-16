
package condominio.santana.converter;

import condominio.santana.dao.ImovelDAO;
import condominio.santana.model.Imovel;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author clean
 */
@FacesConverter(value = "imovelConverter", forClass = Imovel.class)
public class ImovelConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringImovel) {
        if (stringImovel != null) {
            int id = Integer.parseInt(stringImovel);
            ImovelDAO dao = new ImovelDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }
    
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectImovel) {
        if (objectImovel != null) {
            Imovel imovel = (Imovel) objectImovel;
            return String.valueOf(imovel.getImo_id());
        }
        return null;
    }

    

}
