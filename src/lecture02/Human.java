package lecture02;

public class Human {
    String name;
    int age;
    String syozoku;

    Human (){

    }

    Human (String name , int age){
        this.name = name;
        this.age = age;
    }

    void print(){
        if(this.age <= 18){
            syozoku = "生徒 ";
        }else if(this.age <= 22){
            syozoku = "学生 ";
        }else{
            syozoku = " ";
        }
        System.out.println(syozoku + name + " " + age + "歳です");
    }
}
