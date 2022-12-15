package demo_reskill;

import demo_reskill.lambda.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoStream {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();

        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        //  Normal for loop
        for (Animal animal : animals) {
            if (animal.canHop()) {
                System.out.println(animal);
            }
        }

        //  Stream
        animals.parallelStream()
                .filter(Animal::canHop)
                .forEach(System.out::println);
    }

    static void ao(int[] intArr){
        List<Integer> a = IntStream.of(intArr).boxed().toList();
    }
}
