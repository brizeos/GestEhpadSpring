package fr.brizeos.gestehpad.bo.hebergement.activite;

import fr.brizeos.gestehpad.bo.hebergement.info.Service;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Employe {

    @Id
    @GeneratedValue
    private Long idEmploye;
    private String nomEmploye;
    private String prenomEmploye;
    private LocalDate dateNaissanceEmploye;
    @ManyToOne
    private Service service;
    @ManyToOne
    private Contrat contrat;
    @ElementCollection
    private List<LocalDateTime> horairesModifie;

}
