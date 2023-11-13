package Act1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Act1.dao.IFabricanteDAO;
import Act1.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService{
	@Autowired
    private IFabricanteDAO iFabricanteDAO;

    @Override
    public List<Fabricante> listarFabricantes() {
        return iFabricanteDAO.findAll();
    }

    @Override
    public Fabricante obtenerFabricantePorId(Integer id) {
    	return iFabricanteDAO.findById(id).get();
    }

    @Override
    public Fabricante guardarFabricante(Fabricante fabricante) {
        return iFabricanteDAO.save(fabricante);
    };


    @Override
    public Fabricante actualizarFabricante(Fabricante fabricante) {
    	return iFabricanteDAO.save(fabricante);
    }

    @Override
    public void eliminarFabricante(Integer id) {
    	iFabricanteDAO.deleteById(id);
    }
}
