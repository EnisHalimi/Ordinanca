
package buisnessLogic;

import database.Punetori;
import java.util.List;



public class PunetoriRepository extends EntMngClass implements PunetoriInterface {

    @Override
    public void create(Punetori p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    @Override
    public void edit(Punetori p) {
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Punetori p) {
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }

    @Override
    public List<Punetori> findAll() {
       return em.createNamedQuery("Punetori.findAll").getResultList();
    }
    
}
