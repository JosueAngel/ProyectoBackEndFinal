package Proyecto.venta.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Proyecto.venta.modelo.Venta;
import Proyecto.venta.servicio.ventaServicio;
import Proyecto.venta.utilitario.ResponseDTO;

@RestController
@RequestMapping("/venta")

public class ventaControlador {

	@Autowired
	ventaServicio servicio;
	
	@GetMapping
	public ResponseDTO listar()
	{
		return servicio.findAll();
	}
	
	@PostMapping
	public ResponseDTO insertar(@RequestBody Venta venta)
	{
		return servicio.crear(venta);
	}
	
	@PutMapping
	public ResponseDTO actualizar(@RequestBody Venta venta)
	{
		return servicio.actualizar(venta);
	}
	
	@DeleteMapping("/{id}")
	public ResponseDTO eliminar(@PathVariable Long id)
	{
	return servicio.borrar(id);
	}
	
	
}
