package lecture04;

public class Fighter {
    private int hitpoint;
    private int power;
    private String name;

    public Fighter(int hitpoint,int power,String name){
        this.hitpoint = hitpoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        System.out.println(this.name + " は " + enemy.name + " に " + this.power +" ダメージを与えた");
        enemy.hitpoint -= this.power;
        System.out.println(enemy.name + " の残り hitpoint : " + enemy.hitpoint);
    }

    public boolean isAlive(){
        if(hitpoint <= 0){
            return true;
        }else {
            return false;
        }
    }

}
