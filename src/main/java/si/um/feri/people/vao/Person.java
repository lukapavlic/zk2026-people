package si.um.feri.people.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Person {

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Person() {
    }

    String name;
    String surname;
    @Id
    String email;

    public boolean isRelatedTo(Person person) {
        if (person==null ||  this.surname==null || this.email==null)
            return false;
        return surname.equalsIgnoreCase(person.surname);
    }

}
