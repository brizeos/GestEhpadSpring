package fr.brizeos.gestehpad.bo.hebergement.activite;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import fr.brizeos.gestehpad.bo.hebergement.info.Service;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idService")
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
