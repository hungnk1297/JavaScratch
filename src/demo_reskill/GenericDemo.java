package demo_reskill;


import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

    public static void main(String[] args) {
        withGeneric();
    }

    public static void withoutGeneric() {
        List genericsList = new ArrayList<>();
        genericsList.add(Integer.valueOf(1));
        genericsList.add("Hehe");
        genericsList.add(Double.valueOf(5.0));
        genericsList.forEach(System.out::println);
    }

    public static void withGeneric(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
//        integerList.add("Hehe");  // Won't Compile
        integerList.forEach(System.out::println);
    }
}

