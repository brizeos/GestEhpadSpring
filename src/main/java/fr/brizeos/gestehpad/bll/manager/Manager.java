package fr.brizeos.gestehpad.bll.manager;

import fr.brizeos.gestehpad.dal.CustomCrudRepository;

import java.util.List;

public interface Manager<T, L, R extends CustomCrudRepository<T, L>> {
    T add(T item) throws ManagerException;
    void remove(T item) throws ManagerException;
    T find(L id) throws ManagerException;
    List<T> findBy(Object[] args) throws ManagerException;
}
