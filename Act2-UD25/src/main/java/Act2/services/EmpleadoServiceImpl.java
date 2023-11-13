package Act2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Act2.dao.IEmpleadoDAO;
import Act2.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	@Autowired
    private IEmpleadoDAO iEmpleadoDAO;

    @Override
    public List<Empleado> listarEmpleados() {
        return iEmpleadoDAO.findAll();
    }

    @Override
    public Empleado obtenerEmpleadoPorId(String id) {
    	return iEmpleadoDAO.findById(id).get();
    }

    @Override
    public Empleado guardarEmpleado(Empleado Empleado) {
        return iEmpleadoDAO.save(Empleado);
    };


    @Override
    public Empleado actualizarEmpleado(Empleado Empleado) {
    	return iEmpleadoDAO.save(Empleado);
    }

    @Override
    public void eliminarEmpleado(String id) {
    	iEmpleadoDAO.deleteById(id);
    }
}
