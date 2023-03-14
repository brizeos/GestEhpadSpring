package fr.brizeos.gestehpad.bo.hebergement.activite;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Entity
@Data
public class Planning {
    @Id
    @GeneratedValue
    private Long idPlanning;
    @ElementCollection
    private List<LocalTime> horairesLundi;
    @ElementCollection
    private List<LocalTime> horairesMardi;
    @ElementCollection
    private List<LocalTime> horairesMercredi;
    @ElementCollection
    private List<LocalTime> horairesJeudi;
    @ElementCollection
    private List<LocalTime> horairesVendredi;
    @ElementCollection
    private List<LocalTime> horairesSamedi;
    @ElementCollection
    private List<LocalTime> horairesDimanche;



}
