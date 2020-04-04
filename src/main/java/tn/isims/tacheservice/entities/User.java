package tn.isims.tacheservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data@AllArgsConstructor@NoArgsConstructor@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String name ;
    private String prenom ;
    @OneToMany(mappedBy = "user")
    private Collection<Tache> taches = new ArrayList<Tache>();
}
