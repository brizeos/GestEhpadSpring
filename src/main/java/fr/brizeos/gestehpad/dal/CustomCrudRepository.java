package fr.brizeos.gestehpad.dal;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CustomCrudRepository<T, ID> extends CrudRepository<T, ID>, JpaSpecificationExecutor<T> {

}
