
package buisnessLogic;

import database.Dhembi;
import database.Kontrolla;
import java.util.List;


public interface DhembiInterface {
    void create(Dhembi dh);
    void edit(Dhembi dh);
    void delete(Dhembi dh);
   List<Dhembi> findByKontrolla(Kontrolla k);
    List<Dhembi> findAll();
    //Pacienti findByID(int id);
}
