package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    private LocalDate birthDate;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visit = new HashSet<>();

//    public PetType getPetType() {
//        return petType;
//    }
//
//    public void setPetType(final PetType petType) {
//        this.petType = petType;
//    }
//
//    public Owner getOwner() {
//        return owner;
//    }
//
//    public void setOwner(final Owner owner) {
//        this.owner = owner;
//    }
//
//    public LocalDate getBirthDate() {
//        return birthDate;
//    }
//
//    public void setBirthDate(final LocalDate birthDate) {
//        this.birthDate = birthDate;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(final String name) {
//        this.name = name;
//    }
//
//    public Set<Visit> getVisit() {
//        return visit;
//    }
//
//    public void setVisit(final Set<Visit> visit) {
//        this.visit = visit;
//    }
}
