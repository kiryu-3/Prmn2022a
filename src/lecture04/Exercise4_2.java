package lecture04;

import java.util.Scanner;
import java.util.Random;
public class Exercise4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ATM atm = new ATM();
        while(true){
            System.out.println("1:登録　2:ログイン 3:終了");
            int checker = input.nextInt();
            if(checker==1){
                System.out.println("名前を入力してください");
                String name = input.next();
                atm.registerAccount(name,numberDecide());
            }else if(checker==2){
                System.out.println("名前を入力してください");
                String name = input.next();
                System.out.println("口座番号を入力してください");
                String number = input.next();
                if(atm.exitstsAccount(name,number)){
                    System.out.println("名前:"+name+" 口座番号："+number +" は存在します");
                    atm.inOut();
                }else {
                    System.out.println("名前:" + name + " 口座番号：" + number + " は存在しません");
                }
            }else if(checker==3){
                System.out.println("終了します");
                break;
            }else{
                System.out.println("Error!");
            }
        }

    }
    public static String numberDecide(){
        Random rand = new Random();
        int num = rand.nextInt(89999) + 10000;
        return String.valueOf(num);
    }
}
