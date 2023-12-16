package Pet;
import java.util.Random;

public class Dog extends Pet{
    @Override
    public void eat(){
        System.out.println("Гав!");
        int increase = new Random().nextInt(76);
        setSatiety(satiety + increase);
    }
}