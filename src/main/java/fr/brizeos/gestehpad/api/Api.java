package fr.brizeos.gestehpad.api;

import fr.brizeos.gestehpad.bll.manager.Manager;
import fr.brizeos.gestehpad.bll.manager.ManagerException;
import fr.brizeos.gestehpad.bo.patient.Patient;

public abstract class Api<T, L, M extends Manager<T, L>> {

    M manager;

    public Api(M manager) {
        this.manager = manager;
    }


    public T getById(L id){
        return (T) manager.find(id);
    }

    public T save(T item) throws ApiException {
        try {
            manager.add(item);
            return item;
        } catch (ManagerException e) {
            throw new ApiException(e);
        }
    }



}
