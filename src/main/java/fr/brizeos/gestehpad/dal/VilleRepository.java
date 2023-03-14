package fr.brizeos.gestehpad.dal;

import fr.brizeos.gestehpad.bo.hebergement.info.Ville;
import org.springframework.data.repository.CrudRepository;

public interface VilleRepository extends CrudRepository<Ville, Long> {
}
