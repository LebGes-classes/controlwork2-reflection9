package Pet;
import java.util.Random;
import java.util.Scanner;

public abstract class Pet {
    protected int satiety;
    protected abstract void eat();

    public void setSatiety(int i) {
        if (i > 100) {
            satiety = 100;
        } else {
            satiety = i;
        }

    }
    public int getSatiety(){
        return satiety;
    }


}
