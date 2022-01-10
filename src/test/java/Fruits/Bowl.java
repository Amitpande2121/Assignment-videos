package Fruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bowl {
    private List<Fruit> fruits;
    private ShapeOfBowl shape;

    public Bowl() {
        fruits= new ArrayList<>();
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);

    }

    public Bowl getAllApplesBowl() {
        Bowl bowlOfApples=new Bowl();
        for (Fruit fruit : fruits) {
            if(fruit instanceof Apple){
                bowlOfApples.addFruit(fruit);
            }
            
        }
        return bowlOfApples;

    }

    public int getcount() {
        return fruits.size();
    }
}

    //  private Bowl getAllOrangesBowl() {

 //   }

   // private Bowl getAllBananasBowl() {

 //   }

