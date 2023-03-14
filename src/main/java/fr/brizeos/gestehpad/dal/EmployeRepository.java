package fr.brizeos.gestehpad.dal;

import fr.brizeos.gestehpad.bo.hebergement.activite.Employe;
import org.springframework.data.repository.CrudRepository;

public interface EmployeRepository extends CrudRepository<Employe, Long> {
}
