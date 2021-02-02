package pl.javastart.meeting9;

public abstract class Engine {

    void startEngine() {
        startEngine("Startuję silnik");
    }

    void startEngine(String startingSound) {
        System.out.println(startingSound);
        giveVoice();
        System.out.println("Wystartowany!");
    }


    abstract void giveVoice();


}
