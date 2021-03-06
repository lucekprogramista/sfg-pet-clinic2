package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "owners")
public class Owner extends Person{

    private String address;
    private String city;
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner") //delete owner = delete pets
    private Set<Pet> pets = new HashSet<>();

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(final String address) {
//        this.address = address;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(final String city) {
//        this.city = city;
//    }
//
//    public String getTelephone() {
//        return telephone;
//    }
//
//    public void setTelephone(final String telephone) {
//        this.telephone = telephone;
//    }
//
//    public Set<Pet> getPets() {
//        return pets;
//    }
//
//    public void setPets(final Set<Pet> pets) {
//        this.pets = pets;
//    }
}
