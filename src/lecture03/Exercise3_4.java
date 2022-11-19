package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> veg = new ArrayList<>();
        veg.add(new Vegetable("にんじん",117));
        veg.add(new Vegetable("たまねぎ",120));
        veg.add(new Vegetable("にんじん",154));

        for(Vegetable Veg:veg){
            Veg.print();
        }
    }
}
