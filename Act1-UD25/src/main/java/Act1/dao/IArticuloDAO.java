package Act1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Act1.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo,Integer>{

}
