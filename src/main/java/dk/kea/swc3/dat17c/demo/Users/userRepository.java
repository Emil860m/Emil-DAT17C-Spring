package dk.kea.swc3.dat17c.demo.Users;

import dk.kea.swc3.dat17c.demo.Users.model.User;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<User, Long> {
    User findByName(String name);
}
