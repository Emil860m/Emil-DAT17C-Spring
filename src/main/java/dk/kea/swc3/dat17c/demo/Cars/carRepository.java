package dk.kea.swc3.dat17c.demo.Cars;

import dk.kea.swc3.dat17c.demo.Cars.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface carRepository extends CrudRepository<Car, Long> {

}
