package Act3.service;

import java.util.List;

import Act3.dto.Caja;

public interface ICajaService {
	
	List<Caja> listCaja();
	
	Caja cajaPorCod(String numReferencia);
	
	Caja saveCaja(Caja caja);
	
	Caja updateCaja(Caja caja);
	
	public void deleteCaja(String numReferencia);

}
