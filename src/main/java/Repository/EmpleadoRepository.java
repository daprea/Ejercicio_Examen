package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Empleado;

public interface  EmpleadoRepository  extends JpaRepository <Empleado, Integer> {

}
