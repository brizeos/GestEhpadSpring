package fr.brizeos.gestehpad.bo.hebergement.activite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Contrat {

    @Id
    @GeneratedValue
    private Long idContrat;
    private String labelContrat;
    @ManyToOne
    private Planning planing;


}
