package fr.brizeos.gestehpad.bo.hebergement.activite;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idPlanning")
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
