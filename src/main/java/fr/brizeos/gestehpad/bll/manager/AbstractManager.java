package fr.brizeos.gestehpad.bll.manager;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.repository.CrudRepository;

public abstract class AbstractManager<T, L> implements Manager<T, L>{
    protected CrudRepository<T, L> repo;
    protected AbstractManager(CrudRepository<T, L> repo){
        this.repo = repo;
    }
    @Override
    public T add(T item) throws ManagerException {
        try {
            repo.save(item);
        } catch (Exception e) {
            throw new ManagerException(e);
        }
        return item;
    }
    @Override
    public void remove(T item) {
        repo.delete(item);
    }
    @Override
    public T find(L id) {
        return repo.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
