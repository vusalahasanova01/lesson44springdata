package lesson44springdata.example.lesson44springdata.controller;

import lesson44springdata.example.lesson44springdata.model.Person;
import lesson44springdata.example.lesson44springdata.model.PersonCreate;
import lesson44springdata.example.lesson44springdata.repository.PersonData;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("person")
public class TestController {

  private final PersonData data;

  @GetMapping
  public List<Person> findAll() {
    return data.findAll();

  }

  @PostMapping
  public void createPerson(@RequestBody PersonCreate rq) {
    Person p = new Person();
    p.setUsername(rq.getUsername());
    p.setPassword(rq.getPassword());
    data.save(p);
  }
}
