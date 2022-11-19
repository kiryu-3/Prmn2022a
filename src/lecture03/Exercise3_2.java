package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("何行か入力してください");
        int count = input.nextInt();
        input.nextLine();

        ArrayList<String> array = new ArrayList<>();
        for(int i=0;i<count;i++){
            System.out.println(i + "行目：");
            System.out.print(">");
            String mojiretu = input.nextLine();
            array.add(mojiretu);
        }

        int j=0;
        System.out.println("入力した文字列：");
        for(String mojiretu : array){
            System.out.println("[" + j + "] " +  mojiretu);
            j++;
        }


    }
}
