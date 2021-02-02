package pl.javastart.meeting9;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.startEngine();
    }
}
