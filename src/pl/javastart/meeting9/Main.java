package pl.javastart.meeting9;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(new HybridEngine());
        car.start();

        Engine diesel = new DieselEngine();
        Engine hybrid = new HybridEngine();
        Engine specHybrid = new SpecyficznaHybryda();

        System.out.println(diesel.getClass());
        System.out.println(hybrid.getClass());
        System.out.println(specHybrid.getClass());

        System.out.println(specHybrid.getClass().equals(HybridEngine.class));
        System.out.println(specHybrid.getClass().equals(SpecyficznaHybryda.class));
        System.out.println(specHybrid instanceof HybridEngine);
        System.out.println(specHybrid instanceof Object);


    }


}
