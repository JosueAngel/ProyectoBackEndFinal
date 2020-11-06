package Proyecto.cuenta.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Proyecto.cuenta.modelo.Cuenta;
import Proyecto.cuenta.servicio.cuentaServicio;
import Proyecto.cuenta.utilitario.ResponseDTO;

@RestController
@RequestMapping("/cuenta")

public class cuentaControlador {

	@Autowired
	cuentaServicio servicio;
	
	@GetMapping
	public ResponseDTO listar()
	{
		return servicio.findAll();
	}
	
	@PostMapping
	public ResponseDTO insertar(@RequestBody Cuenta cuenta)
	{
		return servicio.crear(cuenta);
	}
	
	@PutMapping
	public ResponseDTO actualizar(@RequestBody Cuenta cuenta)
	{
		return servicio.actualizar(cuenta);
	}
	
	@DeleteMapping("/{id}")
	public ResponseDTO eliminar(@PathVariable Long id)
	{
	return servicio.borrar(id);
	}
	
	
}
