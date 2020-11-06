package Proyecto.curso.modelo;
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
@Table(name="curso")

public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id_Curso")
	private Long idCurso;
	@Column(name="Nombre_Curso")
	private String nombreCurso;
	@Column(name="Nombre_Profesor")
	private String nombreProfesor;
	@Column(name="Descripcion_Curso")
	private String descripcionCurso;
	
	@JsonProperty("fechaCreacion")
	@Column(name="Fecha_Creacion")
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fechaCreacion;
	
	@Column(name="Precio_Curso")
	private String precioCurso;
	
	
	
	
	public Curso() {
	}
	
	public Curso(Long idCurso, String nombreCurso, String nombreProfesor,  
			String descripcionCurso, Date fechaCreacion, String precioCurso) 
	{	
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
		this.nombreProfesor = nombreProfesor;
		this.descripcionCurso = descripcionCurso;
		this.fechaCreacion = fechaCreacion;
		this.precioCurso = precioCurso;
	}

	
	
	
	
	
	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getNombreProfesor() {
		return nombreProfesor;
	}

	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	public String getDescripcionCurso() {
		return descripcionCurso;
	}

	public void setDescripcionCurso(String descripcionCurso) {
		this.descripcionCurso = descripcionCurso;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getPrecioCurso() {
		return precioCurso;
	}

	public void setPrecioCurso(String precioCurso) {
		this.precioCurso = precioCurso;
	}
	
	
	
}




