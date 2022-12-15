package demo_reskill.lambda;

import java.util.ArrayList;
import java.util.List;

public class MainDemo {

    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();

        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // Anonymous Class
//        printAnimal(animals, new CheckTrait() {
//            @Override
//            public boolean test(Animal a) {
//                return a.canSwim();
//            }
//        });

        //  Without Lambda, must implement extra class
        printAnimal(animals, new CheckIfHopper());

        // With Lambda
        printAnimal(animals, a -> a.canHop());

        // Method Reference
        printAnimal(animals, Animal::canHop);

    }

    private static void printAnimal(List<Animal> animals, CheckTrait checker){
        for (Animal animal : animals){
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
