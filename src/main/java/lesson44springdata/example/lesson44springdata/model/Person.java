package lesson44springdata.example.lesson44springdata.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "person1")
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id1")
  private Integer id;

  @Column(name = "username1")
  private String username;

  @Column(name = "password1")
  private String password;

}
