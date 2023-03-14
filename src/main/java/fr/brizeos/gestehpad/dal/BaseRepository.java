package fr.brizeos.gestehpad.dal;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.lang.annotation.Annotation;

@Service
public class BaseRepository {

    @Autowired
    ApplicationContext context;

    public void save(Object entity) throws Exception {
        Annotation[] entities = entity.getClass().getAnnotationsByType(Entity.class);
        if(entities.length == 0) throw new RepositoryException("L'object n'est pas une entité.");

        String serviceName = StringUtils.uncapitalize(entity.getClass().getSimpleName() + "Repository");
        ((CrudRepository) context.getBean(serviceName)).save(entity);
    }

}
