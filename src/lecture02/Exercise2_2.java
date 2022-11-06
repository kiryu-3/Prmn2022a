package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gassta = new GasStation();

        car.run();
        gassta.refuel(car);
        car.run();
    }


}

