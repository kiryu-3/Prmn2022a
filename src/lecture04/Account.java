package lecture04;

public class Account {
    String name;
    String number;
    long balance;

    public Account(String name,String number){
        this.name = name;
        this.number = number;
        this.balance = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getNumber(){
        return this.number;
    }

    public long getBalance(){
        return this.balance;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }
}
