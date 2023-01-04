package lesson44springdata.example.lesson44springdata.controller;

import lesson44springdata.example.lesson44springdata.model.Person;
import lesson44springdata.example.lesson44springdata.model.PersonCreate;
import lesson44springdata.example.lesson44springdata.repository.PersonData;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("person")
public class TestController {

  private final PersonData data;

  @GetMapping
  public List<Person> findAll() {
    return data.findAll();

  }

  @GetMapping("{id}")
  public ResponseEntity<Person> findbyId(@PathVariable Integer id) {
    Optional<Person> byId = data.findById(id);
    return ResponseEntity.of(byId);

  }

  @PostMapping
  public void createPerson(@RequestBody PersonCreate rq) {
    Person p = new Person();
    p.setUsername(rq.getUsername());
    p.setPassword(rq.getPassword());
    data.save(p);
  }

  @PostMapping("buggy")
  public void updateOrCreatePerson(@RequestBody Person p) {
    data.save(p);
  }

  @GetMapping("delete")
  public void delete(){
    data.deleteAll();
  }


}
