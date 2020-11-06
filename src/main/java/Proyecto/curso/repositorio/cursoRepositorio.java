package Proyecto.curso.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Proyecto.curso.modelo.Curso;

@Repository

public interface cursoRepositorio extends JpaRepository <Curso, Long> {

}
