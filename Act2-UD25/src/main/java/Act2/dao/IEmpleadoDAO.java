package Act2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Act2.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado,String>{

}
