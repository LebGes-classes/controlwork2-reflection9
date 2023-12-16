package Pet;
import java.util.Random;

public class Cat extends Pet{
    @Override
    public void eat(){
        System.out.println("Мяу!");
        int increase = new Random().nextInt(76);
        setSatiety(satiety + increase);
    }
}
