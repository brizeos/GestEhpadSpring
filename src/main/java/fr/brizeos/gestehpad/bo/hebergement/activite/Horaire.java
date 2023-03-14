package fr.brizeos.gestehpad.bo.hebergement.activite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Horaire {

    @Id
    @GeneratedValue
    private Long idHoraire;
    private LocalDate date;
    private LocalTime heure;


}
