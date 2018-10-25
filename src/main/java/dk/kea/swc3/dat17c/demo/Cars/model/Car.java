package dk.kea.swc3.dat17c.demo.Cars.model;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model.toLowerCase();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
