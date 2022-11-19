package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter Fighter1 = new Fighter(210,100,"Fighter1");
        Fighter Fighter2 = new Fighter(180,150,"Fighter2");

        while(true){
            Fighter1.attack(Fighter2);
            boolean check = Fighter2.isAlive();
            if(check){
                System.out.println("Figher2 は倒れた。");
                break;
            }
            Fighter2.attack(Fighter1);
            check = Fighter1.isAlive();
            if(check){
                System.out.println("Figher1 は倒れた。");
                break;
            }
        }
    }
}
