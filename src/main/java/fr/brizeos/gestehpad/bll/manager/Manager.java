package fr.brizeos.gestehpad.bll.manager;

public interface Manager<T, L> {
    T add(T item) throws ManagerException;
    void remove(T item);
    T find(L id);

}
