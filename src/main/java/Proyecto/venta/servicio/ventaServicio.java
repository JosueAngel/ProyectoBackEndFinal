package Proyecto.venta.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Proyecto.venta.modelo.Venta;
import Proyecto.venta.repositorio.ventaRepositorio;
import Proyecto.venta.utilitario.Messages;
import Proyecto.venta.utilitario.ResponseDTO;

@Service

public class ventaServicio {

	@Autowired
	ventaRepositorio repositoriobd;
	
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
	
	
	
	public ResponseDTO crear (Venta venta)
	{
		ResponseDTO res = new ResponseDTO();
		try
		{
			res.setRespuesta(repositoriobd.save(venta));
		}
		catch(Exception e)
		{
		res.setCodigo(Messages.CODE_FATAL_ERROR);
		res.setMensaje(Messages.MSG_FATAL_ERROR);
		e.printStackTrace();
		}
		return res;
	}
	
	
	
	public ResponseDTO actualizar(Venta venta)
	{
		ResponseDTO res = new ResponseDTO();
		try
		{
			if(repositoriobd.existsById(venta.getIdVenta()))
			{
				res.setRespuesta(repositoriobd.save(venta));
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
