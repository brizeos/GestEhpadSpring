package fr.brizeos.gestehpad.bo.hebergement.info;

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
