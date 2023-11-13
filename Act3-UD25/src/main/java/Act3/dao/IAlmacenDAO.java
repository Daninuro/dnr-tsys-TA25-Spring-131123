package Act3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Act3.dto.Almacen;

@Repository
public interface IAlmacenDAO extends JpaRepository<Almacen, Integer> {
}
