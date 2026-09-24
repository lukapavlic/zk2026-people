package si.um.feri.people.dao;

import org.springframework.data.repository.CrudRepository;
import si.um.feri.people.vao.Person;

public interface PersonDao extends CrudRepository<Person, String> {
}
