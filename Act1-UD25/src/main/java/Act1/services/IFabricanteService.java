package Act1.services;

import java.util.List;

import Act1.dto.Fabricante;

public interface IFabricanteService {
	//Listar todos
		public List<Fabricante> listarFabricantes();
		
		//Listar por id
		public Fabricante obtenerFabricantePorId(Integer id);

	    // Guardar
	    public Fabricante guardarFabricante(Fabricante fabricante);

	    // Actualizar
	    public Fabricante actualizarFabricante(Fabricante fabricante);

	    // Eliminar
	    public void eliminarFabricante(Integer id);
}
