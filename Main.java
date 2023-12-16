//Фаткуллин Виль 11-306. Вариант 2
package Pet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько питомцев хотите покормить?(введите количество)");
        int numberOfPets = scan.nextInt();
        Pet[] pets = new Pet[numberOfPets];
        for (int i = 0; i < pets.length; i++) {
            if(i % 2 == 0){
                pets[i] = new Dog();
            } else{
                pets[i] = new Cat();
            }
        }
        System.out.println("Состояние до кормления: ");
        for (Pet pet : pets){
            System.out.println("Сытость: " + pet.getSatiety());
        }
        System.out.println("Кормим всех питомцев: ");
        for(Pet pet : pets){
            pet.eat();
        }
        System.out.println("Состояние после кормления: ");
        for (Pet pet : pets){
            System.out.println("Сытость: " + pet.getSatiety());
        }
    }
}
