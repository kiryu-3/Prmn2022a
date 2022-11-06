package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        Tire[] tire = new Tire[65];
        Engine engine = new Engine(4000);

        Car car = new Car(tire,engine);

        GasStation gasStation = new GasStation();
        gasStation.refuel(car);
        car.startEngine();
        car.run();
    }


}
