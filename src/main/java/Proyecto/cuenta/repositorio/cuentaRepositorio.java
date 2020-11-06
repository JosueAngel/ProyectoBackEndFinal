package Proyecto.cuenta.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Proyecto.cuenta.modelo.Cuenta;

@Repository

public interface cuentaRepositorio extends JpaRepository <Cuenta, Long>{

	
}
