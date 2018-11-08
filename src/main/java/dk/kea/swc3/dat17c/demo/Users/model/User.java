package dk.kea.swc3.dat17c.demo.Users.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private Integer age;
    private Character gender;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, Integer age) {
        name = name.toLowerCase();
        this.name = name.substring(0,1).toUpperCase() + name.substring(1);
        this.age = age;
    }

    public User(String name, Integer age, Character gender) {
        name = name.toLowerCase();
        this.name = name.substring(0,1).toUpperCase() + name.substring(1);
        this.age = age;
        this.gender = gender;//gender.toString().toUpperCase().charAt(0);
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
