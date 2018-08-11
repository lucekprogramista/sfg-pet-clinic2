package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    private String description;

//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(final String description) {
//        this.description = description;
//    }
}
