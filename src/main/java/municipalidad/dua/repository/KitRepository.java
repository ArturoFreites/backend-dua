package municipalidad.dua.repository;

import municipalidad.dua.entities.Kit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitRepository extends JpaRepository<Kit,Integer> {

}
