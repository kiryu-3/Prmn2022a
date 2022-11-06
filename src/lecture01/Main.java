package lecture01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("B2211410 Kaoru Segawa");

        //int studentNumber = 2211410;
        //System.out.println("B" + studentNumber + " Kaoru Segawa");

        /*Scanner input = new Scanner(System.in);
        System.out.println("年齢を入力してください");
        int age = input.nextInt();
        if(age < 20){
            System.out.println("I am " + age + " years old so I cannot drink Liquor.");
        }else{
            System.out.println("I am " + age + " years old so I can drink Liquor.");
        }*/

        /*int [] array = new int[100];
        int sum = 0;
        for(int i=0;i<100;i++){
            array[i] = i+1;
            switch (i%2){
                case 0:
                    sum +=i;
            }
        }

        System.out.println(sum);*/

        int[] score = {41,85,72,38,80};
        int minpoint = min(score);
        int maxpoint = max(score);
        double averagepoint = average(score);
        hantei(score);
        System.out.println("最高点:"+maxpoint+"点");
        System.out.println("最低点:"+minpoint+"点");
        System.out.println("平均点:"+averagepoint+"点");

    }


    static int min(int[] score){
        int minpoint = score[0];
        for (int i = 1; i < score.length; i++) {
            if (minpoint > score[i]) {
                minpoint = score[i];
            }
        }
        return minpoint;
    }

    static int max(int[] score){
        int maxpoint = score[0];
        for (int i = 1; i < score.length; i++) {
            if (maxpoint < score[i]) {
                 maxpoint = score[i];
            }
        }
        return maxpoint;
    }

    static double average(int[] score){
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }

        return (double)sum / score.length;
    }

    static void hantei(int[] score){
        for(int i = 0; i < score.length; i++) {
            if (score[i] < 60) {
                System.out.println(i + "番 " + score[i] + "点 不可");
            } else if (60 <= score[i] && score[i] < 70) {
                System.out.println(i + "番 " + score[i] + "点 可");
            } else if (70 <= score[i] && score[i] < 80) {
                System.out.println(i + "番 " + score[i] + "点 良");
            } else if (80 <= score[i] && score[i] < 90) {
                System.out.println(i + "番 " + score[i] + "点 優");
            } else if (90 <= score[i] && score[i] <= 100) {
                System.out.println(i + "番 " + score[i] + "点 秀");
            }
        }
    }
}


