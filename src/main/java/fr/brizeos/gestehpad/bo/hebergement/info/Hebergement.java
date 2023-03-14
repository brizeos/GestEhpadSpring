package fr.brizeos.gestehpad.bo.hebergement.info;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idHebergement")
public class Hebergement {

    @Id
    @GeneratedValue
    private Long idHebergement;
    private String nomHebergement;
    @ManyToOne
    private Ville villeHebergement;
    @OneToMany
    private List<Chambre> chambresHebergement = new ArrayList<>();
    @OneToMany
    private List<Service> servicesHebergement = new ArrayList<>();


}
