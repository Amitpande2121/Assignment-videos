package Fruits;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FruitsTests {
    @Test
    public void shouldSegrigateApples(){
        Apple  apple1 = new Apple();
        Apple  apple2 = new Apple();
        Orange  orange1= new Orange();
        Orange  orange2= new Orange();
        Banana  banana1 = new Banana();
        Banana  banana2 = new Banana();

        Bowl  MixedFruitbowl = new Bowl();
       MixedFruitbowl.addFruit(apple1);
       MixedFruitbowl.addFruit(apple2);
       MixedFruitbowl.addFruit(orange1);
       MixedFruitbowl.addFruit(orange2);
       MixedFruitbowl.addFruit(banana1);
       MixedFruitbowl.addFruit(banana2);

       Bowl bowlOfApples=MixedFruitbowl.getAllApplesBowl();
        Assert.assertEquals(bowlOfApples.getcount(),2);
    }
}
