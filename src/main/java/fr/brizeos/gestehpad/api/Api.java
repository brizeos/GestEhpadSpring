package fr.brizeos.gestehpad.api;

import fr.brizeos.gestehpad.bll.manager.Manager;
import fr.brizeos.gestehpad.bll.manager.ManagerException;
import fr.brizeos.gestehpad.dal.CustomCrudRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class Api<T, L, M extends Manager> {

    M manager;

    public Api(M manager) {
        this.manager = manager;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public T getById(@PathVariable("id") L id) throws ApiException {
        try{
            return (T) manager.find(id);
        } catch (ManagerException e) {
            throw new ApiException(e);
        }
    }

    @PostMapping(path = "/save", produces = "application/json")
    public T save(T item) throws ApiException {
        try {
            manager.add(item);
            return item;
        } catch (ManagerException e) {
            throw new ApiException(e);
        }
    }

    @PostMapping(path = "/remove", produces = "application/json")
    public T remove(T item) throws ApiException {
        try {
            manager.remove(item);
            return item;
        } catch (ManagerException e) {
            throw new ApiException(e);
        }
    }

    public List<T> findBy(String... args) throws ApiException {
        try {
            return manager.findBy(args);
        } catch (ManagerException e) {
            throw new ApiException(e);
        }
    }


}
