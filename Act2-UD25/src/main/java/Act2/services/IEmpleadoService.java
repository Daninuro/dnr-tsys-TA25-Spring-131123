package Act2.services;

import java.util.List;

import Act2.dto.Empleado;

public interface IEmpleadoService {
public List<Empleado> listarEmpleados();
	
	//Listar por id
	public Empleado obtenerEmpleadoPorId(String id);

    // Guardar
    public Empleado guardarEmpleado(Empleado Empleado);

    // Actualizar
    public Empleado actualizarEmpleado(Empleado Empleado);

    // Eliminar
    public void eliminarEmpleado(String id);
}
