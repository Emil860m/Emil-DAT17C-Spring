package dk.kea.swc3.dat17c.demo.Cars.model;

import dk.kea.swc3.dat17c.demo.Users.model.User;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String model;
    private String color;
    private Integer doors;
    @OneToOne
    private User user;

    public Car(String model, String color, Integer doors, User user) {
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.user = user;
    }

    public Car(String model, String color, Integer doors) {
        this.model = model;
        this.color = color;
        this.doors = doors;
    }

    public Car(String model) {
        this.model = model.toLowerCase();
    }

    public Car() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
