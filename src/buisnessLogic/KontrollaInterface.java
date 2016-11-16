
package buisnessLogic;

import database.Kontrolla;
import java.util.List;

public interface KontrollaInterface {
    
    void create(Kontrolla k);
    void edit(Kontrolla k);
    void delete(Kontrolla k);
    
   List<Kontrolla>findAll();
}
