package lecture02;

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Human h1 = new Human("Chitose",19);
        h1.print();

        Human h2 = new Human();
        System.out.println("名前を入力してください");
        h2.name = input.next();
        System.out.println("年齢を入力してください");
        h2.age = input.nextInt();
        h2.print();

    }

}
