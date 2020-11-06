package Proyecto.curso.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Proyecto.curso.utilitario.Messages;
import Proyecto.curso.modelo.Curso;
import Proyecto.curso.repositorio.cursoRepositorio;
import Proyecto.curso.utilitario.ResponseDTO;

@Service

public class cursoServicio {

	@Autowired
	cursoRepositorio repositoriobd;
	
	public ResponseDTO findAll()
	{
		ResponseDTO res= new ResponseDTO();
		try
		{
			res.setRespuesta(repositoriobd.findAll());
		}
		catch(Exception e)
		{
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		return res;
	}
	
	
	
	public ResponseDTO crear (Curso curso)
	{
		ResponseDTO res = new ResponseDTO();
		try
		{
			res.setRespuesta(repositoriobd.save(curso));
		}
		catch(Exception e)
		{
		res.setCodigo(Messages.CODE_FATAL_ERROR);
		res.setMensaje(Messages.MSG_FATAL_ERROR);
		e.printStackTrace();
		}
		return res;
	}
	
	
	
	public ResponseDTO actualizar(Curso curso)
	{
		ResponseDTO res = new ResponseDTO();
		try
		{
			if(repositoriobd.existsById(curso.getIdCurso()))
			{
				res.setRespuesta(repositoriobd.save(curso));
				res.setCodigo(Messages.CODE_UPDATE_SUCCES);
				res.setMensaje(Messages.MSG_UPDATE_OK);
			}
			else
			{
				res.setCodigo(Messages.CODE_ITEM_NOT_FOUND);
				res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);
			}
		}
		catch(Exception e)
		{
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		return res;	
	}
	
	
	
	public ResponseDTO borrar(Long id)
	{
		ResponseDTO res = new ResponseDTO();
		try
		{
			if(repositoriobd.findById(id)!=null)
			{
				repositoriobd.deleteById(id);
				res.setCodigo(Messages.CODE_DELETE_SUCCES);
				res.setMensaje(Messages.MSG_DELETE_OK);
			}
			else
			{
				res.setCodigo(Messages.CODE_FATAL_ERROR);
				res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);
			}
		}
		catch(Exception e)
		{
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		return res;
	}
	
}
