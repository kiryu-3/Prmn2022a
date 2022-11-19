package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums[] = new int[2];
        int sum=0;
        for(int i=0;i<2;i++){
            System.out.println(i+1 + "つ目の整数を入力してください");
            System.out.print("> ");
            String mojiretu = input.nextLine();
            nums[i] = Integer.parseInt(mojiretu);
            sum = sum + nums[i];
        }

        System.out.println(nums[0] + " + " + nums[1] + " = " + sum);

    }
}
