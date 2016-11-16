
package buisnessLogic;

import database.Tretmani;
import java.util.List;


public class TretmaniRepository extends EntMngClass implements TretmaniInterface {

    @Override
    public void create(Tretmani t) {
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        
    }

    @Override
    public void edit(Tretmani t) {
        em.getTransaction().begin();
        em.merge(t);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Tretmani t) {
        em.getTransaction().begin();
        em.remove(t);
        em.getTransaction().commit();
    }

    @Override
    public List<Tretmani> findAll() {
        return em.createNamedQuery("Tretmani.findAll").getResultList();
    }
    
}
