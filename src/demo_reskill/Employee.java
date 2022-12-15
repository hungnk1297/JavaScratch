package demo_reskill;

public abstract class Employee {

    public int calculateSal(){
        int base = 10_000_000;
        return base * getRank();
    }

    public abstract int getRank();
}
