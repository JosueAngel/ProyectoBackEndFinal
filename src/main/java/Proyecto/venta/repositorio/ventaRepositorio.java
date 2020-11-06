package Proyecto.venta.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Proyecto.venta.modelo.Venta;

@Repository

public interface ventaRepositorio extends JpaRepository <Venta, Long>{
	
}
