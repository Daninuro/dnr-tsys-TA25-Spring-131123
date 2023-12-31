package Act3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Act3.dto.Almacen;
import Act3.service.IAlmacenService;
import Act3.service.IAlmacenServiceImpl;

@RestController
@RequestMapping("/almacen")
public class AlmacenController {

	@Autowired
    private IAlmacenServiceImpl almacenService;

	@GetMapping("/list")
    public List<Almacen> getAllAlmacenes() {
        return almacenService.listAlmacen();
    }

    @GetMapping("/{codigo}")
    public Almacen getAlmacenById(@PathVariable Integer codigo) {
        return almacenService.almacenPorId(codigo);
    }

    @PostMapping
    public Almacen saveAlmacen(@RequestBody Almacen almacen) {
        return almacenService.saveAlmacen(almacen);
    }

    @PutMapping("/{codigo}")
    public Almacen updateAlmacen(@PathVariable Integer codigo, @RequestBody Almacen almacen) {
        return almacenService.updateAlmacen(almacen);
    }

    @DeleteMapping("/{codigo}")
    public void deleteAlmacen(@PathVariable Integer codigo) {
        almacenService.deleteAlmacen(codigo);
    }
}
