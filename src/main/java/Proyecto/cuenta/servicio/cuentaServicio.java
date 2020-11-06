package Proyecto.cuenta.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Proyecto.cuenta.modelo.Cuenta;
import Proyecto.cuenta.repositorio.cuentaRepositorio;
import Proyecto.cuenta.utilitario.Messages;
import Proyecto.cuenta.utilitario.ResponseDTO;

@Service

public class cuentaServicio {

	@Autowired
	cuentaRepositorio repositoriobd;
	
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
	
	
	
	public ResponseDTO crear (Cuenta cuenta)
	{
		ResponseDTO res = new ResponseDTO();
		try
		{
			res.setRespuesta(repositoriobd.save(cuenta));
		}
		catch(Exception e)
		{
		res.setCodigo(Messages.CODE_FATAL_ERROR);
		res.setMensaje(Messages.MSG_FATAL_ERROR);
		e.printStackTrace();
		}
		return res;
	}
	
	
	
	public ResponseDTO actualizar(Cuenta cuenta)
	{
		ResponseDTO res = new ResponseDTO();
		try
		{
			if(repositoriobd.existsById(cuenta.getIdCuenta()))
			{
				res.setRespuesta(repositoriobd.save(cuenta));
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
