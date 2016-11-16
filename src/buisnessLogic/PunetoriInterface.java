
package buisnessLogic;

import database.Punetori;
import java.util.List;

public interface PunetoriInterface {
    
    void create(Punetori p);
    void edit(Punetori p);
    void delete(Punetori p);
    
    List<Punetori>findAll();
    
}
