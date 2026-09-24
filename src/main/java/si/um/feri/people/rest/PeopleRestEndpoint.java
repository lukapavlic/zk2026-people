package si.um.feri.people.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import si.um.feri.people.dao.PersonDao;
import si.um.feri.people.vao.Person;

@RestController
public class PeopleRestEndpoint {

    @Autowired
    PersonDao dao;

    @PostMapping("/people")
    public void addPerson(Person p) {
        dao.save(p);
    }

    @GetMapping("/people/{email}")
    public Person getPerson(@PathVariable("email") String email) {
        return dao.findById(email).get();
    }

    @GetMapping("/people")
    public Iterable<Person> getPeople() {
        return dao.findAll();
    }

}
