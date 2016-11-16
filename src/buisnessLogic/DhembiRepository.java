
package buisnessLogic;

import database.Dhembi;
import database.Kontrolla;
import database.Pacienti;
import java.util.List;
import javax.persistence.Query;


public class DhembiRepository extends EntMngClass implements DhembiInterface{

    @Override
    public void create(Dhembi dh) {
        em.getTransaction().begin();
        em.persist(dh);
        em.getTransaction().commit();
    }

    @Override
    public void edit(Dhembi dh) {
        em.getTransaction().begin();
        em.merge(dh);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Dhembi dh) {
        em.getTransaction().begin();
        em.remove(dh);
        em.getTransaction().commit();
    }

    @Override
    @SuppressWarnings("empty-statement")
    public List<Dhembi> findAll() {
        return em.createNamedQuery("Dhembi.findAll").getResultList();
    }
    public List<Dhembi> findByKontrolla (Kontrolla k) {
       Query q=em.createQuery("Select d from Dhembi d where d.kontrollaid = :kontrolla");
      q.setParameter("kontrolla", k);
        return q.getResultList();
       
    }
    
    
}
