package cl.adl.controlAlumnos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.adl.controlAlumnos.model.Direccion;



@Repository
public interface DireccionRepository extends CrudRepository <Direccion, Integer> {

}
