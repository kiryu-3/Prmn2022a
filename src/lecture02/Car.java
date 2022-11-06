package lecture02;

public class Car {
    int fuel=0;
    Tire[] tires = new Tire[100];
    Engine engine = new Engine();
    Car(){
        fuel = 0;
    }

    Car(Tire[] tire,Engine engine2){
        tires = tire;
        engine = engine2;
    }

    void run(){
        if(fuel>=1){
            System.out.println("燃料を1消費して走りました。");
        }
        else{
            System.out.println("燃料が足りないため走れませんでした。");
        }

    }

    void startEngine(){

        engine.start();
    }
}
