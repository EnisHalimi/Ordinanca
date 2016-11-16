
package buisnessLogic;

import database.Kontrolla;
import java.util.List;

public class KontrollaRepository extends EntMngClass implements KontrollaInterface {

    @Override
    public void create(Kontrolla k) {
        em.getTransaction().begin();
        em.persist(k);
        em.getTransaction().commit();
    }

    @Override
    public void edit(Kontrolla k) {
        em.getTransaction().begin();
        em.merge(k);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Kontrolla k) {
        em.getTransaction().begin();
        em.remove(k);
        em.getTransaction().commit();
    }

    @Override
    public List<Kontrolla> findAll() {
        return em.createNamedQuery("Kontrolla.findAll").getResultList();
    }
    
}
