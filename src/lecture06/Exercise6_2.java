package lecture06;

import lecture05.Insect;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        ArrayList<Integer> saikoro = new ArrayList<>();
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        for(int i=0;i<5;i++){
            saikoro.add(random.nextInt(6)+1);
        }

        System.out.println("さいころを5つ振りました。");
        System.out.print("何番目のさいころの値を確認しますか？\n> ");
        try{
            int number = input.nextInt();
            System.out.println(number + "番目の値は " + saikoro.get(number) + "です");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました.");
            System.out.println("プログラムを終了します.");
        }
        catch(InputMismatchException e){
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します.");
        }


    }
}
