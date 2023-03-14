package fr.brizeos.gestehpad.dal;

import fr.brizeos.gestehpad.bo.hebergement.info.Service;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<Service, Long> {
}
