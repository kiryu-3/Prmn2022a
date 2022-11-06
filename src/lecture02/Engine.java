package lecture02;

public class Engine {
    int rpm;

    Engine(){

    }

    Engine(int rpm2){
        rpm = rpm2;
    }

    void start(){
        System.out.println("rpm = " + rpm + " でエンジンを始動させました");
    }
}
