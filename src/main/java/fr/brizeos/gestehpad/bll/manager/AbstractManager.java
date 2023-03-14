package fr.brizeos.gestehpad.bll.manager;

import fr.brizeos.gestehpad.dal.CustomCrudRepository;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

public abstract class AbstractManager<T, L, R extends CustomCrudRepository<T, L>> implements Manager<T, L, R>{
    protected CustomCrudRepository<T, L> repo;
    protected AbstractManager(CustomCrudRepository<T, L> repo){
        this.repo = repo;
    }
    @Override
    public T add(T item) throws ManagerException {
        try {
            repo.save(item);
        } catch (Exception e) {
            throw new ManagerException(e.getMessage());
        }
        return item;
    }
    @Override
    public void remove(T item) throws ManagerException {
        try {
            repo.delete(item);
        } catch (Exception e) {
            throw new ManagerException(e.getMessage());
        }
    }
    @Override
    public T find(L id) {
        return repo.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<T> findBy(Object[] args) throws ManagerException {
        try {
            // TODO findBy()
            return null;
        } catch (Exception e) {
            throw new ManagerException(e.getMessage());
        }
    }
}
