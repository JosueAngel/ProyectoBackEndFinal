package Proyecto.cuenta.modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="cuenta")

public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id_Cuenta")
	private Long idCuenta;
	
	@Column(name="Nombre_Cuenta")
	private String nombreCuenta;
	
	@Column(name="Tipo_Cuenta")
	private String tipoCuenta;
	
	@Column(name="Descripcion")
	private String descripcionCuenta;
	
	@JsonProperty("fechaCreacion")
	@Column(name="Fecha_Creacion")
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fechaCreacion;
	
	@Column(name="Contrasena")
	private String contrasenaCuenta;
	
	
	
	public Cuenta() {
	}
	
	public Cuenta(Long idCuenta, String nombreCuenta, String tipoCuenta,  
			String descripcionCuenta, Date fechaCreacion, String contrasenaCuenta) 
	{	
		this.idCuenta = idCuenta;
		this.nombreCuenta = nombreCuenta;
		this.tipoCuenta = tipoCuenta;
		this.descripcionCuenta = descripcionCuenta;
		this.fechaCreacion = fechaCreacion;
		this.contrasenaCuenta = contrasenaCuenta;
	}

	
	
	public Long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getNombreCuenta() {
		return nombreCuenta;
	}

	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getDescripcionCuenta() {
		return descripcionCuenta;
	}

	public void setDescripcionCuenta(String descripcionCuenta) {
		this.descripcionCuenta = descripcionCuenta;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getContrasenaCuenta() {
		return contrasenaCuenta;
	}

	public void setContrasenaCuenta(String contrasenaCuenta) {
		this.contrasenaCuenta = contrasenaCuenta;
	}
	
	

}
