package Proyecto.venta.modelo;

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
@Table(name="venta")

public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id_Venta")
	private Long idVenta;
	
	@Column(name="Nombre_Cliente")
	private String nombreCliente;
	
	@JsonProperty("fechaVenta")
	@Column(name="fecha_venta")
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fechaVenta;

	@Column(name="Cantidad")
	private String cantidadVenta;
	
	@Column(name="Tipo_comprobante")
	private String tipoComprobante;
	
	@Column(name="Total")
	private String totalVenta;
	
	@Column(name="Estado")
	private String estadoVenta;
	
	
	
	public Venta() {
	}
	
	public Venta(Long idVenta, String nombreCliente, Date fechaVenta,  
			String cantidadVenta, String tipoComprobante, String totalVenta, String estadoVenta) 
	{	
		this.idVenta = idVenta;
		this.nombreCliente = nombreCliente;
		this.fechaVenta = fechaVenta;
		this.cantidadVenta=cantidadVenta;
		this.tipoComprobante = tipoComprobante;
		this.totalVenta = totalVenta;
		this.estadoVenta=estadoVenta;
	}

	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getCantidadVenta() {
		return cantidadVenta;
	}

	public void setCantidadVenta(String cantidadVenta) {
		this.cantidadVenta = cantidadVenta;
	}

	public String getTipoComprobante() {
		return tipoComprobante;
	}

	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	public String getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(String totalVenta) {
		this.totalVenta = totalVenta;
	}

	public String getEstadoVenta() {
		return estadoVenta;
	}

	public void setEstadoVenta(String estadoVenta) {
		this.estadoVenta = estadoVenta;
	}

	

	
	
	
	
	
	
}
