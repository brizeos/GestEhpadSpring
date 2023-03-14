package fr.brizeos.gestehpad.bo.hebergement.info;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Adresse {

    @Id
    @GeneratedValue
    private Long idAdresse;
    private String rueAdresse;
    @ManyToOne
    private Ville villeAdresse;
}
