package lecture04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    private List<Account> accountList ;
    private int index;

    Scanner input = new Scanner(System.in);

    public ATM(){
        accountList = new ArrayList<>();
    }

    public void registerAccount(String name,String number){
        accountList.add(new Account(name,number));
        System.out.println(name+" さんのアカウントを口座番号：" +number+" で登録しました。");
    }

    public boolean exitstsAccount(String name,String number){
        int checkpoint = 0;
        for(Account alist : accountList){
            String str = alist.getName();
            String num = alist.getNumber();
            if(str.equals(name)&&num.equals(number)){
                index=accountList.indexOf(alist);
                checkpoint++;
            }
        }
        return checkpoint>0;
    }

    public void inOut(){
        while(true){
            System.out.println("1:入金 2:引出 3:終了");
            int checheker = input.nextInt();
            if(checheker==1){
                System.out.println("いくら入金しますか");
                deposit();
            }else if(checheker==2){
                System.out.println("いくら引き出しますか");
                long minus = input.nextLong();
                if(accountList.get(index).getBalance()-minus>=0){
                    long money = withdraw(accountList.get(index).getBalance(),minus);
                    accountList.get(index).setBalance(money);
                }else{
                    System.out.print("口座番号："+accountList.get(index).getNumber() +" から "+minus+"円引き出せませんでした。");
                    System.out.println("残金:" + accountList.get(index).getBalance() + "円です。");
                }
            }else if(checheker==3){
                System.out.println("終了します");
                break;
            }else{
                System.out.println("ERROR!");
            }
        }

    }

    public void deposit(){
        long plus = input.nextLong();
        long sum = accountList.get(index).getBalance()+plus;
        System.out.println("口座番号："+accountList.get(index).getNumber() +" に "+plus+"円入金しました。");
        accountList.get(index).setBalance(sum);
    }

    public long withdraw(long nowmoney,long minus){
        long sum = nowmoney-minus;
        accountList.get(index).setBalance(sum);
        System.out.print("口座番号："+accountList.get(index).getNumber() +" から "+minus+"円引き出しました。");
        System.out.println("残金:" + sum + "円です。");
        return sum;
    }
}
