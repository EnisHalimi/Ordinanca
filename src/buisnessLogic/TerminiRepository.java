package buisnessLogic;


import buisnessLogic.EntMngClass;
import buisnessLogic.TerminiInterface;
import database.Termini;
import java.util.List;

public class TerminiRepository extends EntMngClass implements TerminiInterface
{
    
    @Override
    public void create(Termini t) {
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }

    @Override
    public void edit(Termini t) {
       em.getTransaction().begin();
       em.merge(t);
       em.getTransaction().commit();
    }

    @Override
    public void delete(Termini t) {
        em.getTransaction().begin();
        em.remove(t);
        em.getTransaction().commit();
    
    }

    @Override
    public List<Termini> findAll() {
        return em.createNamedQuery("Termini.findAll").getResultList();
    }
    
}