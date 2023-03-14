package fr.brizeos.gestehpad.bll;

import fr.brizeos.gestehpad.bll.manager.Manager;
import fr.brizeos.gestehpad.bll.manager.ManagerException;
import fr.brizeos.gestehpad.bo.patient.Patient;
import fr.brizeos.gestehpad.dal.CustomCrudRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.lang.annotation.Annotation;
import java.util.List;


@Service
public class BaseManager<T, L, R extends CustomCrudRepository<T, L>> {
    @Autowired
    ApplicationContext context;

    private Manager<T, L, R> getManagerFromEntity(T entity) throws ManagerException {
        Annotation[] entities = entity.getClass().getAnnotationsByType(Entity.class);
        if(entities.length == 0) throw new ManagerException("L'object n'est pas une entité.");
        String simplename = entity.getClass().getSimpleName();
        return (Manager<T, L, R>) context.getBean(StringUtils.uncapitalize(simplename)+"ManagerImpl" );
    }
    private Manager<T, L, R> getManagerFromClass(Class<T> clazz) throws ManagerException {
        Annotation[] entities = clazz.getAnnotationsByType(Entity.class);
        if(entities.length == 0) throw new ManagerException("L'object n'est pas une entité.");
        String simplename = clazz.getSimpleName();
        return (Manager<T, L, R>) context.getBean(StringUtils.uncapitalize(simplename)+"ManagerImpl" );
    }

    public T add(T entity) throws ManagerException {
        return (T) getManagerFromEntity(entity).add(entity);
    }

    public void remove(T item) throws ManagerException{
        getManagerFromEntity(item).remove(item);
    }
    public T find(Class clazz, L id) throws ManagerException {
        return (T) getManagerFromClass(clazz).find(id);
    }
    public Manager<T, L, R> getManager(Class clazz) throws ManagerException {
        return getManagerFromClass(clazz);
    }


    public List<T> findBy(Class<T> clazz, String... args) throws ManagerException {
        return getManagerFromClass(clazz).findBy(args);

    }
}
