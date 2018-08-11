package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private PetTypeRepository petTypeRepository;


    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(final Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(final PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(final PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(final Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}