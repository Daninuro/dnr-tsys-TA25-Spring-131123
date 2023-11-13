package Act4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Act4.dto.Pelicula;
import Act4.dto.Sala;

public interface SalaDAO extends JpaRepository<Sala, Integer>{

}
