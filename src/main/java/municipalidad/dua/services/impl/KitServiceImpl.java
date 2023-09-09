package municipalidad.dua.services.impl;

import municipalidad.dua.entities.Kit;
import municipalidad.dua.repository.KitRepository;
import municipalidad.dua.services.KitService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KitServiceImpl implements KitService {

    private final KitRepository kitRepository;

    public KitServiceImpl(KitRepository kitRepository) {
        this.kitRepository = kitRepository;
    }

    @Override
    public Kit create() throws Exception {

        Kit kit = new Kit();
        kitRepository.save(kit);

        return kit;
    }

    @Override
    public Kit createNumer(Integer id) throws Exception {

        Kit kit = new Kit();
        kit.setId(id);
        kitRepository.save(kit);

        return kit;
    }

    @Override
    public Kit findById(Integer numerKit) throws Exception {

        Optional<Kit> kit = kitRepository.findById(numerKit);

        if (kit.isEmpty()){
            throw new Exception("El kit no existe");
        }

        return kit.get();
    }

    @Override
    public List<Kit> findAll(){
        return kitRepository.findAll();
    }

}
