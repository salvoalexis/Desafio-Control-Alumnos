package cl.adl.controlAlumnos.repository;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import cl.adl.controlAlumnos.model.Alumno;



@Repository
public interface AlumnoRepository extends CrudRepository <Alumno, Integer>{
	
	

	
	

}
