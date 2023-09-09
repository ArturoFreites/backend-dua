package municipalidad.dua.services.impl;

import municipalidad.dua.entities.Gender;
import municipalidad.dua.repository.GenderRespository;
import municipalidad.dua.services.GenderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenderServiceImpl implements GenderService {

    private final GenderRespository genderRespository;

    public GenderServiceImpl(GenderRespository genderRespository) {
        this.genderRespository = genderRespository;
    }

    @Override
    public Gender create(String name) throws Exception {

        if (name.isEmpty() || name==null){
            throw new Exception("El nombre del genero es invalido");
        }

        Gender gender = new Gender();
        gender.setName(name);
        genderRespository.save(gender);
        return gender;
    }

    @Override
    public Gender findById(Integer id) throws Exception {
        Optional<Gender> gender = genderRespository.findById(id);
        if (gender.isEmpty()){
            throw new Exception("El genero no existe");
        }
        return gender.get();
    }

    @Override
    public List<Gender> findAll(){
        return genderRespository.findAll();
    }
}
