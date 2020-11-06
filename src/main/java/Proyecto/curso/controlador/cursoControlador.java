package Proyecto.curso.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Proyecto.curso.modelo.Curso;
import Proyecto.curso.servicio.cursoServicio;
import Proyecto.curso.utilitario.ResponseDTO;

@RestController
@RequestMapping("/curso")
public class cursoControlador {
	
	@Autowired
	cursoServicio servicio;
	
	@GetMapping
	public ResponseDTO listar()
	{
		return servicio.findAll();
	}
	
	@PostMapping
	public ResponseDTO insertar(@RequestBody Curso curso)
	{
		return servicio.crear(curso);
	}
	
	@PutMapping
	public ResponseDTO actualizar(@RequestBody Curso curso)
	{
		return servicio.actualizar(curso);
	}
	
	@DeleteMapping("/{id}")
	public ResponseDTO eliminar(@PathVariable Long id)
	{
	return servicio.borrar(id);
	}
}

