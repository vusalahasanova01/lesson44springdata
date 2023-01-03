package lesson44springdata.example.lesson44springdata.repository;

import lesson44springdata.example.lesson44springdata.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonData extends JpaRepository<Person,Integer> {
}
