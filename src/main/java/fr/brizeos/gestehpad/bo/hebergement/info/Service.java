package fr.brizeos.gestehpad.bo.hebergement.info;

import fr.brizeos.gestehpad.bo.hebergement.activite.Employe;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Service {

    @Id
    @GeneratedValue
    private Long idService;
    private String nomService;
    @OneToMany
    private List<Employe> employesService = new ArrayList<>();

}
