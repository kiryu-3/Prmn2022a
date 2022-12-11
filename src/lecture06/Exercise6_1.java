package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("小数値を入力してください:");
        try{
            double number = input.nextDouble();
            System.out.println(number);
        }
        catch(InputMismatchException e){
            System.out.println("エラー");
        }

    }
}
