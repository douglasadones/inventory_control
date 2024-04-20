package generics;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dougl
 */

public class GenericService<T> {
    
    public Class<T> entity;
    
    @PersistenceContext
    public EntityManager entityManager;
    
    public GenericService(Class<T> entity) {
        this.entity = entity;
    }
    
    public void save(T entity) {
        getEntityManager().persist(entity);
    }
    
    public void update(T entity) {
        getEntityManager().merge(entity);
    }
    
    public T find(Long id) {
        T object = getEntityManager().find(entity, id);
        getEntityManager().refresh(object);
        return object;
    }
    
    public List<T> findAll() {
        return getEntityManager().createQuery("SELECT e FROM " + 
                entity.getSimpleName() + 
                " e WHERE e.active = true").getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
}
