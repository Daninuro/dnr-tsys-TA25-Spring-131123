package Act3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import Act3.dao.ICajaDAO;
import Act3.dto.Caja;

@Service
public class ICajaServiceImpl implements ICajaService{

	@Autowired
	@Lazy
	ICajaDAO iCajaServ;

	@Override
	public List<Caja> listCaja() {
		// TODO Auto-generated method stub
		return iCajaServ.findAll();
	}

	@Override
	public Caja cajaPorCod(String numReferencia) {
		// TODO Auto-generated method stub
		return iCajaServ.findById(numReferencia).get();
	}

	@Override
	public Caja saveCaja(Caja caja) {
		// TODO Auto-generated method stub
		return iCajaServ.save(caja);
	}

	@Override
	public Caja updateCaja(Caja caja) {
		// TODO Auto-generated method stub
		return iCajaServ.save(caja);
	}

	@Override
	public void deleteCaja(String numReferencia) {
		// TODO Auto-generated method stub
		iCajaServ.deleteById(numReferencia);
	}

}
