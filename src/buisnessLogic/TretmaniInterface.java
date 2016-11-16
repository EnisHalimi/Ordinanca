
package buisnessLogic;

import database.Tretmani;
import java.util.List;

public interface TretmaniInterface {
    void create(Tretmani t);
    void edit(Tretmani t);
    void delete(Tretmani t);
    List<Tretmani>findAll();
}
